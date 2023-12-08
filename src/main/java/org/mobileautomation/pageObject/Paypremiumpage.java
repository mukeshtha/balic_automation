package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Paypremiumpage extends AndroidActions {

	AndroidDriver driver;
	

	public Paypremiumpage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Pay Premium\"]")
	private WebElement paypremium;
	
	@FindBy(xpath="(//*[@class='android.widget.TextView'])[1]")
	private WebElement backbtn;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Proceed To Pay\"]/android.view.ViewGroup")
	private WebElement ProceedToPay;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Select All\"]")
	private WebElement selectall;
	
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
	
	public void selectAllCards() throws InterruptedException
	{
		selectall.click();
		Thread.sleep(300);
		selectall.click();
	}
	
}
