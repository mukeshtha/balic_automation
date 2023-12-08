package org.mobileautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseTest {

	static Logger log = Logger.getLogger(BaseTest.class);
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//mobileautomation//resources//data.properties");
		prop.load(fis);
		
		String ipAddress=prop.getProperty("ipAddress");
		//String port=prop.getProperty("portno");
		int port=4723;
		
		service=startAppiumServer(ipAddress,port);
		
		log.info("Launch Appium Server");
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName(prop.getProperty("AndroidDeviceName"));
		options.setApp(System.getProperty("user.dir")+"//src//test//java//resources//lifeassit.apk");
		
		driver=new AndroidDriver(service.getUrl(),options);
		log.info("Launch LifeAssit App");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	
	private AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {
		// TODO Auto-generated method stub
		service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//tmuke//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")).withIPAddress(ipAddress).usingPort(port).build();
		service.start();
		return service;
	}

	@AfterClass
	public void tearDown()
	{
          driver.quit(); 
		  service.stop();
		  log.info("Close Driver and Service");
		 	 
	}
}
