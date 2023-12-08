package org.mobileautomation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PaypremiumL1screen extends Paypremiumpage{

	AndroidDriver driver;
	
	
	public PaypremiumL1screen(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Pay Premium\"]")
	private WebElement paypremium;
	
	@FindBy(xpath="//*[@class='android.view.ViewGroup']")
	private WebElement backbtn;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Proceed To Pay\"]/android.view.ViewGroup")
	private WebElement ProceedToPay;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Proceed\"]/android.view.ViewGroup")
	private WebElement Proceed;
	
	public void gotoHomepage()
	{
	    backbtn.click();	
	}
	
	public void gotoPaypremiumPage() {
		paypremium.click();
		
	}
	
	public void  ClickonProceed()
	{
		ProceedToPay.click();
	}
	
	
	

}
