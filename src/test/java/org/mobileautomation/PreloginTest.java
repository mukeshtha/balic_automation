package org.mobileautomation;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.mobileautomation.pageObject.PreLoginpage;
import org.testng.annotations.Test;

public class PreloginTest extends BaseTest {

	@Test
	public void PreloginpageTest() throws MalformedURLException, InterruptedException {
		PreLoginpage preloginpg = new PreLoginpage(driver);
		 
		preloginpg.clickLifeInsuranceGuideCategory();
		
		preloginpg.gotoHappyCustomerstories();
		
		preloginpg.gotoPaypremiumPage();

		preloginpg.gotoContactusPage();

		preloginpg.gotoMorePage();

		preloginpg.gotoHomePage();

		preloginpg.gotoHomePage();

	}
}
