package org.mobileautomation.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;


public class AndroidActions {

	AndroidDriver driver;
	AppiumDriver appiumdriver;
	public AndroidActions(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement) ele).getId(),"duration",2000));
	}
	
	public void scrollToEndAction(AndroidDriver driver)
	{
		boolean canscrollMore;
		do {
		canscrollMore=(Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		}while(canscrollMore);
		
	}
	
	public void scrollToText(String text)
	{
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
		try {
	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+text+"\").instance(0))"));
	//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textContains(\""+text+"\").instance(0))"));
		}
		catch(Exception ex)
		{
			ex.getMessage();
		}
		System.out.println("----SCROLLING DONE---");
	
	}
	
	
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
	public Double getFormattedAmount(String amount)
	{
		 Double price=Double.parseDouble(amount.substring(1));
		 return price;
	}
	
	public void swipeLeft()
	{
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		
		int x1=(int) (size.width*0.20);
		//int x2=(int) (size.width*0.80);
		
		TouchAction action = new TouchAction(driver);
		WebElement banner=driver.findElement(By.id("__CAROUSEL_ITEM_1_READY__"));
		action.longPress(ElementOption.element(banner)).moveTo(ElementOption.element(banner, x1, 580)).release().perform();
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
}
