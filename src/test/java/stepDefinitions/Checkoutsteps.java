package stepDefinitions;
import com.pages.CheckoutPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Checkoutsteps {
    private final CheckoutPage checkoutPage=new CheckoutPage(DriverFactory.getDriver());
    @Given("when user navigates to checkout page")
    public void whenUserNavigatesToCheckoutPage() {
        DriverFactory.getDriver().get("https://www.kapiva.in/checkout-custom/");
        
    }


    @When("user fills Checkout form from the given sheetname {string} and rownumber {int}")
    public void userFillsCheckoutFormFromTheGivenSheetnameAndRownumberRowNumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {

            ExcelReader reader = new ExcelReader();
            List<Map<String,String>> TestData2 =
                    reader.getData("automation.xlsx", sheetName);

            String Checkoutemail = TestData2.get(rowNumber).get("Checkoutemail");
            String CheckoutNumber = TestData2.get(rowNumber).get("CheckoutNumber");
            String Checkoutfirstname = TestData2.get(rowNumber).get("Checkoutfirstname");
            String Checkoutlastname = TestData2.get(rowNumber).get("Checkoutlastname");
            String Checkoutlastaddress = TestData2.get(rowNumber).get("Checkoutlastaddress");
            String CheckoutPincode = TestData2.get(rowNumber).get("CheckoutPincode");

            checkoutPage.fillcheckoutform(Checkoutemail, CheckoutNumber,Checkoutfirstname, Checkoutlastname, Checkoutlastaddress,CheckoutPincode);
        
    }

    @Then("User click on Pay button")
    public void user_ClickOn_PayButton() throws InterruptedException {
        CheckoutPage.clickPayButton();
    }

    @Then("User navigate to payment section")
    public void user_NavigateT_oPaymentSection() {
    }

    @And("click on go back to shop button")
    public void clickOn_GoBackToShopButton() {
        CheckoutPage.clickgobacktoshopbutton();
    }

    @And("Click on Buynowbutton to navigate to checkoutPage")
    public void clickOn_Buynowbutton_ToNavigateTo_CheckoutPage() throws InterruptedException {
        Thread.sleep(3000);
        CheckoutPage.clickBuynowbutton();
        Thread.sleep(3000);
    }


}
