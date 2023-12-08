package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class NRIhomepage extends AndroidActions {

	AndroidDriver driver;
	
	public NRIhomepage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView")
	private WebElement bottomlgnbtn;
	
	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement userinput;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement password;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Login with Password\"]/android.widget.TextView")
	private WebElement loginwithPwd;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Submit COE\"]")
	private WebElement SubmitCOE;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"My Policies\"]")
	private WebElement mypolicy;
	
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"More\"]")
	private WebElement more;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Active\"]")
	private WebElement activecard;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Inactive\"]")
	private WebElement inactivecard;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"closed\"]")
	private WebElement closedcard;
	
	
	public void clickonLoginBtn() {
		bottomlgnbtn.click();
	}
	
	public void loginwithPassword() throws Exception
	{
		
		userinput.sendKeys("SH106677926");
		loginwithPwd.click();
		password.sendKeys("MR SXsEW");
		userinput.sendKeys("SH106677926");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView")).click();
		Thread.sleep(200);	
		//takeSnapShot(driver, "C://Users//tmuke//OneDrive//Pictures//Screenshots//snapshot.png");
	}
	
	public void Clickonlogout()
	{
		more.click();
		logout.clear();
		
	}
	
	public void ClickonSubmitCOE()
	{
		String text="Services";
	      scrollToText(text);
		  SubmitCOE.click();	
	}
	
	public void Clickonmypolicy() throws Exception
	{
		mypolicy.click();
		takeSnapShot(driver, "C://Users//tmuke//OneDrive//Pictures//Screenshots//snapshot.png");
		activecard.click();
		inactivecard.click();
		closedcard.click();
	}
	
	
}
