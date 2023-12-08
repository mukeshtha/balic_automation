package org.mobileautomation;

import org.mobileautomation.pageObject.Paypremiumpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaypremiumTest extends BaseTest {

	@Test
	public void paypremiumpageTest() throws InterruptedException
	{
		Paypremiumpage pay=new Paypremiumpage(driver);
		
		pay.gotoPaypremiumPage();
		
		pay.selectAllCards();
		
		pay.gotoHomepage();
	}
}
