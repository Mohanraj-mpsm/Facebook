package com.flipkart;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.reusablefunctions.CommonFunctions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunctions {
	//CommonFunctions c = CommonFunctions.getInstance();
	CommonFunctions c = new CommonFunctions();
	
	@Before
	public void launch (Scenario scene ) {
		c.chromeBrowser_Launch();
		final byte[] before = ((TakesScreenshot)c.driver).getScreenshotAs(OutputType.BYTES);
		scene.embed(before,"image/ss.png");
	}
	
	@After
	public void close (Scenario scenery) {
		final byte[] after = ((TakesScreenshot)c.driver).getScreenshotAs(OutputType.BYTES);
		scenery.embed(after, "image/ss.png");
		c.browserClose();
		
	}
}
