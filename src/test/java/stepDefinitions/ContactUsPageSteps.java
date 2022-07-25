package stepDefinitions;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class ContactUsPageSteps {
       private final ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());


    @Given("user navigates to contact us page")
    public void user_navigates_to_contact_us_page() {
        DriverFactory.getDriver().get("https://www.kapiva.in/doctor/contact-us/");
    }

    @When("user fills the form from given sheetname {string} and rownumber {int}")
    public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {

        ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData =
                reader.getData("automation.xlsx", sheetName);

        String Name = testData.get(rowNumber).get("Name");
        String email = testData.get(rowNumber).get("email");
        String ContactNumber = testData.get(rowNumber).get("ContactNumber");
        String orderRef = testData.get(rowNumber).get("orderref");
        String message = testData.get(rowNumber).get("message");
        contactUsPage.fillContactUsForm(Name, email,ContactNumber, orderRef, message);
    }

    @When("user clicks on send button")
    public void user_clicks_on_send_button() {
        contactUsPage.clickSend();

    }
    @Then("User verify {string} text in the msg field")
    public void user_verify_text_in_the_msg_field(String text) {
        String msg = ContactUsPage.getSuccessMessg();
        msg =msg.trim();
        text =text.trim();
        if (msg.equalsIgnoreCase(text))
        {
            System.out.println("Text verified");
        }
        else
        {
            System.out.println("Text not verified");
        }


    }

}
