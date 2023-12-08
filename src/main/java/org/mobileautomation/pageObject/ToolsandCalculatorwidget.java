package org.mobileautomation.pageObject;

import org.mobileautomation.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ToolsandCalculatorwidget extends AndroidActions {

	AndroidDriver driver;
	
	public ToolsandCalculatorwidget(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ConstantFields.FinancialFitness)
	private WebElement FFitness;
	
	public void clickonFFitness()
	{
		String text="Tools & Calculators"; 
		  scrollToText(text);
		driver.findElement(AppiumBy.accessibilityId("Financial Fitness")).click();  
		//FFitness.click();
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
	}
}
