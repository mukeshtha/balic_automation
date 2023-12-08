package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PreLoginpage extends AndroidActions {

	AndroidDriver driver;
    
	public PreLoginpage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ConstantFields.paypremiumicon)
	private WebElement paypremium;

	@FindBy(xpath = ConstantFields.contactusicon)
	private WebElement contactus;

	@FindBy(xpath = ConstantFields.moreicon)
	private WebElement more;

	@FindBy(xpath = ConstantFields.homeicon)
	private WebElement home;

	@FindBy(xpath = ConstantFields.bottomloginbtn)
	private WebElement bottomlgnbtn;

	@FindBy(xpath = ConstantFields.userstory)
	private WebElement userstoryicon;

	@FindBy(xpath=ConstantFields.happycustomer)
	private WebElement happycust1;
	
	@FindBy(xpath="android.view.ViewGroup/android.widget.ImageView")
    private WebElement preapproveswipe;
	
	@FindBy(xpath=ConstantFields.LIGVideo)
    private WebElement lifeinsurnaceguidevid;
	
	@FindBy(xpath=ConstantFields.LIGArtice)
    private WebElement lifeinsurnaceguidearticle;
	
	@FindBy(xpath=ConstantFields.LIGPodcast)
    private WebElement lifeinsurnaceguidepodcast;
	
	public void gotoPaypremiumPage() {
		paypremium.click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Back\"]")).click();
	}

	public void gotoContactusPage() {
		contactus.click();
	}

	public void gotoMorePage() {
		more.click();
	}

	public void gotoHomePage() {
		home.click();
	}

	public void clickUserstories()
	{
		userstoryicon.click();
	}
	public void preApproveswipe()
	{
		Actions act=new Actions(driver);
		act.dragAndDropBy(preapproveswipe, 200,0).build().perform();
	}
	public void clickLifeInsuranceGuideCategory() throws InterruptedException
	{
		String text="Life Insurance Guide"; 
		  scrollToText(text);
		  
		lifeinsurnaceguidevid.click();
		lifeinsurnaceguidearticle.click();
		lifeinsurnaceguidepodcast.click();
		driver.findElement(AppiumBy.accessibilityId("Episode 01 - How t..., In today's episode we..., Yesterday|9 min.")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.widget.TextView")).click();
	}
	
	public void gotoHappyCustomerstories() throws InterruptedException {
	  scrollToText("Happy Customer Stories");
	  happycust1.click();
	  Thread.sleep(100);
	  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.widget.TextView")).click();
	  }
	 

}
