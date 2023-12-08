package org.mobileautomation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public abstract class AppiumUtils {
	
	public AppiumDriverLocalService service;

	public List<HashMap<String,String>> getJsonData(String jsonfilepath) throws IOException
	{
		//System.getProperty("user.dir")+"//src//test//java//org//mobileautomation//testData//eCommerce.json"
		String jsonContent=FileUtils.readFileToString(new File(jsonfilepath),StandardCharsets.UTF_8);
		
		ObjectMapper objectmapper=new ObjectMapper();
		List<HashMap<String,String>> data=objectmapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>() {
		});
		return data;
		
	}
	
	public AppiumDriverLocalService startAppiumServer(String ipAddress,int portnumber)
	{
		service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//tmuke//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")).withIPAddress(ipAddress).usingPort(portnumber).build();
		service.start();
		return service;
	}
	  
	
	
}
