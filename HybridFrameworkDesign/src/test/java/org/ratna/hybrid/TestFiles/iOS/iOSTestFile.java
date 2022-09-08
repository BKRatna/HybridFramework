package org.ratna.hybrid.TestFiles.iOS;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.ratna.hybrid.PageOjects.iOS.iOSPageObjects;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
//import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

//This class should extend the PageObjects class and user should use the pageobject method and pass the value here
//@Test will come in this class. And we can group multiple tests here if the tests can be grouped. If any tests cannot be grouped then create other TestFile similarly
public class iOSTestFile extends baseiOSTest {

	IOSDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
//		iOSPageObjects iospageobjects = new iOSPageObjects(driver);
//		iospageobjects.SelectAlertViews(); (or)
//		NextPageObjectsClassname nxtpo = iospageobjects.SelectAlertViews(); In this way we need not to create an object in this file
		
//		driver.findElement(MobileBy.AccessibilityId("Alert Views")).click();
//		driver.findElement(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]")).click();
//		driver.findElement(MobileBy.xpath("//XCUIElementTypeCell")).sendKeys("Hello");
//		driver.findElement(MobileBy.AccessibilityId("OK")).click();
//		driver.findElement(MobileBy.AccessibilityId("Confirm / Cancel")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(MobileBy.AccessibilityId("A message should be a short, complete sentence.")).getText());
//		driver.findElement(MobileBy.AccessibilityId("Confirm")).click();
//		
		
	}
	

}
