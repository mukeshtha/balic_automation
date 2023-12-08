package org.mobileautomation;

import org.mobileautomation.pageObject.PaypremiumL1screen;
import org.mobileautomation.pageObject.Paypremiumpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaypremiumL1screenTest extends BaseTest {

	@Test
	public void paypremiumpageTest()
	{
		PaypremiumL1screen pay=new PaypremiumL1screen(driver);
		
		pay.gotoPaypremiumPage();
		
		pay.ClickonProceed();
		
		pay.gotoHomepage();
		
		
	}
}
