package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Downloadswidget extends AndroidActions {

	AndroidDriver driver;
	
	public Downloadswidget(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Premium Paid Certificate\"]")
	private WebElement premiumpaidcert;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Fund Value Statement\"]")
	private WebElement fundvaluestmt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Bonus Statement\"]")
	private WebElement bonusstmt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"e-Policy Bond\"]")
	private WebElement epolicybond;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Premium Receipt\"]")
	private WebElement premiumreceipt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Back\"]/android.widget.TextView")
	private WebElement backbtn;
	
	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement userinput;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement password;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Login with Password\"]/android.widget.TextView")
	private WebElement loginwithPwd;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView")
	private WebElement bottomlgnbtn;
	
	public void clickonPremiumpaidcert()
	{
		
		premiumpaidcert.click();
		backbtn.click();
	}
	public void clickonFundvaluestmt()
	{
		fundvaluestmt.click();
		backbtn.click();
	}
	public void clickonBonusstmt()
	{
		bonusstmt.click();
		backbtn.click();
	}
	public void clickonEpolicybond()
	{
		epolicybond.click();
		backbtn.click();
	}
	public void clickonPremiumreceipt()
	{
		premiumreceipt.click();
		backbtn.click();
	}
	
	public void clickonLoginBtn() {
		bottomlgnbtn.click();
	}
	
	public void loginwithPassword() throws InterruptedException
	{
		
		userinput.sendKeys("SH106677926");
		loginwithPwd.click();
		password.sendKeys("MR SXsEW");
		userinput.sendKeys("SH106677926");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView")).click();
		Thread.sleep(200);	
	}

}
