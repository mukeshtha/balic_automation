package org.mobileautomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mobileautomation.pageObject.Loginpage;
import org.mobileautomation.utils.AppiumUtils;

public class LoginTest extends BaseTest {

	
	@Test(dataProvider="data")
	public void LoginpageTest(Map<String,String> map) throws InterruptedException, IOException {
		
		Loginpage loginpg = new Loginpage(driver);
		loginpg.clickonLoginBtn();
		/*
		 * String username=map.get("USER_ID"); String password=map.get("PASSWORD");
		 */
		
		loginpg.loginwithPassword("SH106677926","MR SXsEW");
		
		//loginpg.loginwithOTP("POONAMKATKE");
		/*
		 * loginpg.gotoGmail(); loginpg.gotoFacebookPage(); loginpg.closeLoginpage();
		 */
	}
	
	@DataProvider(name="data")
	public Object[][] getData() throws IOException {
		
		File src=new File("C:\\Users\\tmuke\\NewWorkSpace\\LifeAssitBalic\\src\\test\\java\\org\\mobileautomation\\testData\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		xsf.close();
	
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
	    //int lastCellNum = sheet.getRow(0).getLastCellNum();
	    Object[][] obj = new Object[rowCount][1];
	    for (int i = 0; i < rowCount; i++) {
	        Map<Object, Object> datamap = new HashMap<>();
	        for (int j = 0; j < lastCellNum; j++) {
	          datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
	        }
	        obj[i][0] = datamap;
	      }
	        return  obj;
	}
	

}
