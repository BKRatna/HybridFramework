package org.ratna.hybrid.TestFiles.Android;

import java.io.IOException;

import org.ratna.hybrid.PageOjects.Android.AndroidPageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//This class should extend the PageObjects class and user should use the pageobject method and pass the value here
public class AndroidTestFile extends Base{

	public void MethodName() throws IOException, InterruptedException {
		
		service = startServer();
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("APIDemos");
		
		AndroidPageObjects androidPageObjects = new AndroidPageObjects(driver);
		
		//androidPageObjects.setField("Ratna");
	}
	
}
