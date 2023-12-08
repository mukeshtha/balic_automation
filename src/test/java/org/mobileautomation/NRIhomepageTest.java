package org.mobileautomation;

import org.mobileautomation.pageObject.NRIhomepage;
import org.testng.annotations.Test;

public class NRIhomepageTest extends BaseTest{

	@Test
	public void NRIpageTest() throws Exception
	{
      NRIhomepage nripage=new NRIhomepage(driver);
      
      nripage.clickonLoginBtn();
      nripage.loginwithPassword(); 
     //nripage.ClickonSubmitCOE();
      String text="SAMJHO HO GAYA";
		nripage.scrollToText(text);
		nripage.Clickonmypolicy();
		Thread.sleep(100);
      nripage.Clickonlogout();
	}
}
