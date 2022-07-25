package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {

	private static WebDriver driver;

	// 1. By Locators: OR
	private final By emailId = By.id("login_email");
	private final By password = By.id("login_pass");
	private final By signInButton = By.xpath("//*[@value=\"Sign in\"]");
	private final By forgotPwdLink = By.linkText("Forgot your password?");
	private final By LoginLink = By.xpath("//*[contains(text(),'Sign in')]");
	private static final By successMessg = By.xpath("//*[@class='alertBox-column alertBox-message']");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public boolean isForgotLoginLinkExist() {
		return driver.findElement(LoginLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}


	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);

	}

	public static String getSuccessMessg() {
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebElement msg = driver.findElement(By.xpath("//*[@class='alertBox-column alertBox-message']"));
		String runtimemessage = msg.getAttribute("class");
		System.out.println(runtimemessage);
		return driver.findElement(successMessg).getText();

	}

}
