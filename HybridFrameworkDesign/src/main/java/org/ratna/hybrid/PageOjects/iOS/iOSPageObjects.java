package org.ratna.hybrid.PageOjects.iOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ratna.hybrid.Utils.iOSActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class iOSPageObjects extends iOSActions{
	
	IOSDriver driver;
	public iOSPageObjects (IOSDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
//	@iOSXCUITFindBy(accessibility="Alert Views")
//	private WebElement alertviews;
//	public void SelectAlertViews()
//	{
//		alertviews.click();
//	} (or) Below method is when we click on a object, if it navigates to the next screen then in this method itself we can create an object which we will be sent to testfile
//	public NextPageObjectsClassname SelectAlertViews()
//	{
//		alertviews.click();
//		return new NextPageObjectsClassname(driver);
//	}
	
}
