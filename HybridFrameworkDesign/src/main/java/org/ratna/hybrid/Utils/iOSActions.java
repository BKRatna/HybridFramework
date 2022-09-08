package org.ratna.hybrid.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class iOSActions extends AppiumUtils {
	
	static IOSDriver driver;
	public iOSActions(IOSDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

}
