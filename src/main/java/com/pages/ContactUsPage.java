package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class ContactUsPage {
	
	private static WebDriver driver;


	private final By email = By.id("form-email");
	private final By orderRef = By.id("form-orderno");
	private final By messageText = By.name("contact_question");
	private final By sendButton = By.cssSelector("button[class=\"button button--primary contactBtn submitform\"]");
	private static final By successMessg = By.xpath("//*[@class='contactMessage']");
	private final By name = By.id("form-name");
	private final By contactnumber = By.id("form-phone");

	public ContactUsPage(WebDriver driver) {
		ContactUsPage.driver = driver;
	}

	public String getContactUsPageTitle() {
		return driver.getTitle();
	}
	
	public void fillContactUsForm(String Name, String emailId,String ContactNumber, String orderReference, String message) {
		driver.findElement(name).sendKeys(Name);
		driver.findElement(contactnumber).sendKeys(ContactNumber);
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(orderRef).sendKeys(orderReference);
		driver.findElement(messageText).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(sendButton).click();
	}
	
	public static String getSuccessMessg() {
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				WebElement msg= driver.findElement(By.xpath("//*[@class='contactMessage']"));
				String runtimemessage = msg.getAttribute("class");
				System.out.println(runtimemessage);
		return driver.findElement(successMessg).getText();
	}
	
	
	
	

}
