package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Loginpage extends AndroidActions {

	AndroidDriver driver;

	public Loginpage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='android.view.ViewGroup'][1]")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@class='android.view.ViewGroup'][4]")
	private WebElement gmailicon;

	@FindBy(xpath = "//*[@class='android.view.ViewGroup'][5]")
	private WebElement facebookicon;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Login with Password\"]/android.widget.TextView")
	private WebElement loginwithPwd;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView")
	private WebElement bottomlgnbtn;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement userinput;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement userpassword;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Send OTP\"]")
	private WebElement sendotp;

	@FindBy(xpath = "//*[@class='android.widget.Button']")
	private WebElement closepopup;

	public void gotoGmail() throws InterruptedException {
		gmailicon.click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Retry\"]"));
		closepopup.click();
	}

	public void gotoFacebookPage() throws InterruptedException {
		facebookicon.click();
		driver.navigate().back();
	}

	public void closeLoginpage() {
		closebtn.click();
	}

	public void loginwithPassword(String username, String password) throws InterruptedException {

		userinput.sendKeys(username);
		loginwithPwd.click();
		userpassword.sendKeys(password);
		userinput.sendKeys(username);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView"))
				.click();
		Thread.sleep(200);
	}

	public void CheckvalidCredits(String username, String password) throws InterruptedException {

		loginwithPwd.click();

		userpassword.sendKeys(password);
		userinput.sendKeys(username);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"More\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")).click();

	}

	/*
	 * public void loginwithOTP(String username) throws InterruptedException {
	 * userinput.sendKeys(username); sendotp.click(); }
	 */

	public void clickonLoginBtn() {
		bottomlgnbtn.click();
	}

}
