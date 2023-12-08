package org.mobileautomation;

import org.mobileautomation.pageObject.Downloadswidget;
import org.testng.annotations.Test;

public class DownloadswidgetTest extends BaseTest{

	@Test
	public void DownloadsTest() throws InterruptedException
	{
		Downloadswidget download=new Downloadswidget(driver);
		
		download.clickonLoginBtn();
		download.loginwithPassword();
		
		String text="Downloads";
		download.scrollToText(text);
		
		download.clickonFundvaluestmt();
		download.clickonBonusstmt();
	}
}
