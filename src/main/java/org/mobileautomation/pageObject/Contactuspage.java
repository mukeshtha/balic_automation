package org.mobileautomation.pageObject;


import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Contactuspage extends AndroidActions{

	AndroidDriver driver;
	
	public Contactuspage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Contact Us\"]")
	private WebElement contactuscta;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"i-Serve\"]/android.widget.TextView")
	private WebElement iservice;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Live Chat\"]/android.widget.TextView")
	private WebElement livechat;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"WhatsApp\"]/android.widget.TextView")
	private WebElement whatsapp;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Contact Us\"]/android.widget.TextView")
	private WebElement contactus;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Branch Locator\"]/android.widget.TextView")
	private WebElement branchlocator;
	
	
	
	public void gotoIservice() throws InterruptedException
	{
		iservice.click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.widget.TextView")).click();
	}
	
	public void gotoLivechat() throws InterruptedException
	{
		livechat.click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.widget.TextView")).click();
		}
	
	public String gotoWhatsapp() throws InterruptedException
	{
		whatsapp.click();
		Thread.sleep(100);

		String alertmsg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertmsg;
		
	}
	
	public void gotoContactus() throws InterruptedException
	{
		contactus.click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.widget.TextView")).click();
	}
	
	public void gotoBranchlocator() throws InterruptedException
	{
		branchlocator.click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.widget.TextView")).click();

	}
	public void gotoContactusPage() {
		contactuscta.click();
	}
	
}
