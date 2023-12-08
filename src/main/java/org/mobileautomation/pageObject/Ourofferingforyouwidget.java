package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Ourofferingforyouwidget extends AndroidActions{

	AndroidDriver driver;
	
	public Ourofferingforyouwidget(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Single\"]")
	private WebElement single;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Married\"]")
	private WebElement married;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Younger Kids\"]")
	private WebElement youngerkid;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Older Kids\"]")
	private WebElement olderkid;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Retired\"]")
	private WebElement retired;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Products\"]")
	private WebElement offerings_products;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Life Goals\"]")
	private WebElement offerings_lifegoals;

	public void clickLifestagecategories()
	{
		single.click();
		married.click();
		youngerkid.click();
		olderkid.click();
		retired.click();
	}
	public void gotoOurOfferingswidget() throws InterruptedException
	{
		offerings_products.click();
		Thread.sleep(100);
		offerings_lifegoals.click();
	}

	
}
