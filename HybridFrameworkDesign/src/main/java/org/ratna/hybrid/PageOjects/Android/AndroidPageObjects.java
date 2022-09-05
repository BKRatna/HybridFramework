package org.ratna.hybrid.PageOjects.Android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ratna.hybrid.Utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


//This contains both locators and Action methods(Also the methods of AndroidActions class file as we are extending that class)
public class AndroidPageObjects extends AndroidActions

{	
	AndroidDriver driver;
	public AndroidPageObjects (AndroidDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Defining locators Way1
//	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
//	private WebElement fieldName;
	
	
	//Defining Action method
//	public void setField(String value)
//	{
//		fieldName.sendkeys(value);
//		driver.hideKeyboard();
//	}
	
	
	
	
	//Defining locators Way2
//	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
//	public WebElement nameField;
}
