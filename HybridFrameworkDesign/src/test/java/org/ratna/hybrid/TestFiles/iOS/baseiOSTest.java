package org.ratna.hybrid.TestFiles.iOS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

//@BeforeClass and @AfterClass will come in this class to Start the Appium Server and Stop the Appium Server
public class baseiOSTest {

	public static IOSDriver DesiredCapabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT, 50000);
		cap.setCapability("commandTimeouts", 12000);
		cap.setCapability(MobileCapabilityType.APP, "/Users/Ratna/Desktop/UIKitCatalog.app");
		
		IOSDriver driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), cap);
		return driver;
	}

}
