package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class CreateAccountPage {
    private static WebDriver driver;


    private final By Emailid = By.id("FormField_1_input");
    private final By Password1 =By.id("FormField_2_input");
    private final By ConfirmPassword1 = By.id("FormField_3_input");
    private final By firstname1 = By.id("FormField_4_input");
    private final By lastname1 = By.id("FormField_5_input");
    private final By phonenumber1 =By.id("FormField_7_input");
    private final By companyname1 = By.id("FormField_6_input");
    private final By Addressline11 =By.id("FormField_8_input");
    private final By Addressline21 = By.id("FormField_9_input");
    private final By city1 = By.id("FormField_10_input");
    private final By Country1 = By.xpath("//*[@id=\"FormField_11_select\"]");
    private final By State1 = By.id("FormField_12_input");
    private final By Zip1 = By.id("FormField_13_input");
    private final By execId1 = By.id("FormField_26_input");
    private static final By CreateAccountButton = By.xpath("//*[@class='button button--primary']");
    private static final By successMessg = By.xpath("//*[@class='page-heading']");


    public CreateAccountPage(WebDriver driver) {
        CreateAccountPage.driver = driver;
    }

    public String getCreateAccountPageTitle() {
        return driver.getTitle();
    }

    public void fillCreateaccountForm(String Email, String Password, String ConfirmPassword, String firstname, String lastname, String phonenumber, String companyname, String Addressline1, String Addressline2, String city, String state, String Country, String Zip, String execId) {

       driver.findElement(Emailid).sendKeys(Email);
       driver.findElement(Password1).sendKeys(Password);
        driver.findElement(ConfirmPassword1).sendKeys(ConfirmPassword);
        driver.findElement(firstname1).sendKeys(firstname);
        driver.findElement(lastname1).sendKeys(lastname);
        driver.findElement(phonenumber1).sendKeys(phonenumber);
        driver.findElement(companyname1).sendKeys(companyname);
        driver.findElement(Addressline11).sendKeys(Addressline1);
        driver.findElement(Addressline21).sendKeys(Addressline2);
        driver.findElement(city1).sendKeys(city);
        driver.findElement(State1).sendKeys(state);
        driver.findElement(Country1).sendKeys(Country);
        driver.findElement(Zip1).sendKeys(Zip);
        driver.findElement(execId1).sendKeys(execId);

    }

    public static void clickonCreateAccount() {
        driver.findElement(CreateAccountButton).click();
    }

    public static String getSuccessfullMessg() {
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        WebElement msg = driver.findElement(By.xpath("//*[@class='page-heading']"));
        String runtimemessage = msg.getAttribute("class");
        System.out.println(runtimemessage);
        return driver.findElement(successMessg).getText();
    }

}
