package org.mobileautomation;

import org.mobileautomation.pageObject.ToolsandCalculatorwidget;
import org.testng.annotations.Test;

public class ToolsandCalculatorTest extends BaseTest {

	@Test
	public void ToolsandCalculatorwidgettest() throws InterruptedException
	{
		ToolsandCalculatorwidget tools=new ToolsandCalculatorwidget(driver);
		tools.clickonFFitness();
		Thread.sleep(100);
	}
}
