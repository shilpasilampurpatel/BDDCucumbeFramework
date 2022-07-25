package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private static WebDriver driver;

    private final By Checkoutemail1 = By.xpath("(//*[@class='h-full w-full border-gray-300 px-2 transition-all border-blue rounded-md'])[1]");
    private final By CheckoutNumber1 = By.xpath("(//*[@class='h-full w-full border-gray-300 px-2 transition-all border-blue rounded-md'])[2]");
    private final By Checkoutfirstname1 = By.xpath("(//*[@class='h-full w-full border-gray-300 px-2 transition-all border-blue rounded-md'])[3]");
    private final By Checkoutlastname1=By.xpath("(//*[@class='h-full w-full border-gray-300 px-2 transition-all border-blue rounded-md'])[4]");
    private final By Checkoutlastaddress1 = By.xpath("(//*[@class='h-full w-full border-gray-300 px-2 transition-all border-blue rounded-md'])[5]");
    private final By CheckoutPincode1 = By.xpath("(//*[@class='h-full w-full border-gray-300 px-2 transition-all border-blue rounded-md'])[6]");
    private static final By PayButton = By.xpath("//*[@id=\"app\"]/div[2]/section[1]/div[3]/div/div[2]/button");
    private static final By clickgobacktoshopbutton=By.xpath("//*[@class='bg-green-700 hover:bg-green-800 text-white cursor p-2 px-4 ']");
    private static final By Buynowbutton =By.xpath("(//a[contains(text(),'Buy Now')])[1]");


    public  CheckoutPage(WebDriver driver) {
        CheckoutPage.driver = driver;
}
    public void fillcheckoutform(String Checkoutemail, String CheckoutNumber,String Checkoutfirstname,String Checkoutlastname, String Checkoutlastaddress, String CheckoutPincode) throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(Checkoutemail1).sendKeys(Checkoutemail);
        driver.findElement(CheckoutNumber1).sendKeys(CheckoutNumber);
        driver.findElement(Checkoutfirstname1).sendKeys(Checkoutfirstname);
        driver.findElement(Checkoutlastname1).sendKeys(Checkoutlastname);
        driver.findElement(Checkoutlastaddress1).sendKeys(Checkoutlastaddress);
        driver.findElement(CheckoutPincode1).sendKeys(CheckoutPincode);
    }

    public static void clickPayButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(PayButton).click();
        Thread.sleep(3000);
    }
    public static void clickgobacktoshopbutton() {
        driver.findElement(clickgobacktoshopbutton).click();
    }
    public static void clickBuynowbutton() throws InterruptedException {
        driver.findElement(Buynowbutton).click();
        Thread.sleep(3000);
    }
}