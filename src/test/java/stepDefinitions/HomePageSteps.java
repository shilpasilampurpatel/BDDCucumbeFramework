package stepDefinitions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    private final HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("user navigates to Home page")
    public void user_navigates_to_Home_page() {
        DriverFactory.getDriver().get("https://www.kapiva.in/");
    }

    @When("Verify by clicking on links from the shop category")
    public void verify_ByClickingOn_LinksFromTheShop_Category() throws InterruptedException {
        homePage.clickShop();

    }

    @Then("User should navigate to each respective links based on the link selection {int}")
    public void User_ShouldNavigate_ToEachRespective_Links_BasedOnTheLink_Collection(int Linknumber) throws InterruptedException {
        Thread.sleep(2000);
        homePage.clicklinkundershopMenu(Linknumber);
    }

    @And("Verify the Images displayed on the Page")
    public void verify_TheImages_DisplayedOnThe_Page() {
        homePage.Verifyimagedisplayed();
    }

    @And("Verify the Broken images which are displayed on the page")
    public void verifyTheBrokenImagesWhichAreDisplayedOnThePage() {
        homePage.test_selenium_broken_images();
    }

    @And("Click on Addcartbutton to add products in add cart")
    public void clickOnAddcartbuttonToAddProductsInAddCart() throws InterruptedException {
        homePage.clickAddcartButton();
        Thread.sleep(2000);
    }

    @And("click on cartButton to proceed for payment")
    public void clickOnCartButtonToProceedForPayment() throws InterruptedException {
        homePage.clickoncartbutton();
        Thread.sleep(3000);
    }

    @When("User click on Checkout button")
    public void userClickOnCheckoutButton() throws InterruptedException {
        homePage.clickcheckoutbutton();
        Thread.sleep(1000);
    }

    @And("Click on TrackingIcon next to the searchbox")
    public void clickOnTrackingIconNextToTheSearchbox() throws InterruptedException {
        homePage.clicktrackingbutton();
        Thread.sleep(1000);
    }

    @When("Enter the valid  trackingId {string}")
    public void enterTheValidTrackingId(String TrackingId) {
        homePage.enterTrackingId(TrackingId);

    }

    @Then("Click on trackButton")
    public void clickOnTrackButton() {
        homePage.clickOnTrackButton();
    }
    @Then("User check {string} text in the msg Displayed")
    public void user_CheckTextInThe_Msg_displayed (String text){
        String msg = LoginPage.getSuccessMessg();
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

