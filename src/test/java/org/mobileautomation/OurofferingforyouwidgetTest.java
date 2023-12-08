package org.mobileautomation;

import org.mobileautomation.pageObject.Ourofferingforyouwidget;
import org.testng.annotations.Test;

public class OurofferingforyouwidgetTest extends BaseTest {

@Test
	public void ourOfferingWidgetTest() throws InterruptedException
	{
		Ourofferingforyouwidget offer=new Ourofferingforyouwidget(driver);
		
		String text="Our Offerings For You";
		
		offer.scrollToText(text);
		
		offer.clickLifestagecategories();
		
		offer.gotoOurOfferingswidget();
	}
}