package stepDefinitions;
import com.pages.CreateAccountPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CreateAccountSteps {
    private final CreateAccountPage createaccountPage = new CreateAccountPage(DriverFactory.getDriver());

    @Given("user navigates to CreateAccountPage")
    public void user_navigates_to_create_account_page() {

        DriverFactory.getDriver().get("https://www.kapiva.in/login.php?action=create_account");
    }

    @When("user fills the CreateAccount from given sheetname {string} and rownumber {int}")
    public void user_fills_the_CreateAccount_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {

        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData1 =
                reader.getData("automation.xlsx", sheetName);


        String email = testData1.get(rowNumber).get("email");
        String Password = testData1.get(rowNumber).get("Password");
        String ConfirmPassword = testData1.get(rowNumber).get("ConfirmPassword");
        String firstname = testData1.get(rowNumber).get("firstname");
        String lastname = testData1.get(rowNumber).get("lastname");
        String phonenumber = testData1.get(rowNumber).get("phonenumber");
        String companyname = testData1.get(rowNumber).get("companyname");
        String Addressline1 = testData1.get(rowNumber).get("Addressline1");
        String Addressline2 = testData1.get(rowNumber).get("Addressline2");
        String city = testData1.get(rowNumber).get("city");
        String state = testData1.get(rowNumber).get("state");
        String Country =testData1.get(rowNumber).get("Country");
        String Zip = testData1.get(rowNumber).get("Zip");
        String execId = testData1.get(rowNumber).get("execId");
        String message = testData1.get(rowNumber).get("message");

        createaccountPage.fillCreateaccountForm(email,Password,ConfirmPassword, firstname, lastname, phonenumber, companyname, Addressline1, Addressline2, city, state,Country, Zip, execId);


    }

    @When("user clicks on CreateAccount button")
    public void user_clicks_on_CreateAccount_button() {
        CreateAccountPage.clickonCreateAccount();

    }


    @Then("User verify {string} in the successfully msg field")
    public void userVerifyInTheSuccessfullyMsgField(String text) {
        String msg = CreateAccountPage.getSuccessfullMessg();
        msg = msg.trim();
        text = text.trim();
        if (msg.equalsIgnoreCase(text)) {
            System.out.println("Text verified");
        } else {
            System.out.println("Text not verified");
        }
    }
}
