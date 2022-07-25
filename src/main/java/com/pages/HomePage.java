package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static sun.plugin.javascript.navig.JSType.URL;

public class HomePage {
    private static WebDriver driver;
    private static final By Shop = By.xpath("/html/body/header/div[2]/div[3]/nav/ul/li[1]/a");
    private static final By clickAddcartButton = By.xpath("(//*[@class='button button-wishlist'])[1]");
    private static final By clickoncartbutton = By.id("cart-preview-dropdown");
    private static final By clickcheckoutbutton = By.xpath("//*[@class='button button--small button--primary']");
    private static final By clicktrackingbutton = By.xpath("//a[contains(@href,'/track-order/')][1]");
    private static final By trackId =By.xpath("//*[@class='form-input track_input']");
    private static final By Trackbutton =By.xpath("//*[@class='track_order']");
    private String baseUrl;


    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }

    public void clickShop() throws InterruptedException {
        driver.findElement(Shop).click();
        Thread.sleep(3000);
    }


    public void Verifyimagedisplayed() {

        WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"product-listing-container\"]/form/ul/li[1]/article/figure/a/div[1]/img"));

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent) {
            System.out.println("Image is displayed.");
        } else {
            System.out.println("Image is not displayed.");
        }
    }

    public void test_selenium_broken_images() {
        {
            Integer iBrokenImageCount = 0;
            driver.manage().window().maximize();

            String status;
            try {
                iBrokenImageCount = 0;
                List<WebElement> image_list = driver.findElements(By.tagName("img"));
                /* Print the total number of images on the page */
                System.out.println("The page under test has " + image_list.size() + " images");
                for (WebElement img : image_list) {
                    if (img != null) {
                        if (img.getAttribute("naturalWidth").equals("0")) {
                            System.out.println(img.getAttribute("outerHTML") + " is broken.");
                            iBrokenImageCount++;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                status = "failed";
                System.out.println(e.getMessage());
            }
            status = "passed";
            System.out.println("The page " + URL + " has " + iBrokenImageCount + " broken images");
        }

    }

    public void clicklinkundershopMenu(int linknumber) {
        driver.findElement(By.xpath("(//*[@class='navPage-childList-action navPages-action'])[" + linknumber + "]")).click();

    }

    public void clickAddcartButton() {
        driver.findElement(clickAddcartButton).click();

    }

    public void clickoncartbutton()
    {
        driver.findElement(clickoncartbutton).click();
    }

    public void clickcheckoutbutton() {
        driver.findElement(clickcheckoutbutton).click();
    }

    public void clicktrackingbutton() {driver.findElement(clicktrackingbutton).click();}

    public void enterTrackingId(String trackingId) {
        driver.findElement(trackId).sendKeys(trackingId);
    }

    public void clickOnTrackButton() {
        {driver.findElement(Trackbutton).click();}

    }
}



