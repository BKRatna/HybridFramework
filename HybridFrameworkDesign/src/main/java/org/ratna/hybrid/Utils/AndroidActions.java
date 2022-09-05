package org.ratna.hybrid.Utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	
	static AndroidDriver driver;
	public AndroidActions(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	//Android scrollToText
	public MobileElement scrollToText(String Text)
	{
		MobileElement element = (MobileElement) driver
		.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\""+Text+"\"))"));
		return element;
	}

}
