package org.mobileautomation;

import org.mobileautomation.pageObject.Contactuspage;
import org.testng.annotations.Test;

public class ContactpageTest extends BaseTest {

	@Test
	public void ContactusTest() throws InterruptedException
	{
		
		Contactuspage contact=new Contactuspage(driver);
		
		contact.gotoContactusPage();
		
		contact.gotoIservice();
		
		contact.gotoBranchlocator();
		
		contact.gotoContactus();
		
		contact.gotoLivechat();
		
		String alertText=contact.gotoWhatsapp();
		System.out.println("Alert Text Message " + alertText);
	}
}
