package org.ratna.hybrid.TestFiles.Android;

import java.io.IOException;

import javax.sound.midi.MidiDevice.Info;

import org.ratna.hybrid.PageOjects.Android.AndroidPageObjects;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//This class should extend the PageObjects class and user should use the pageobject method and pass the value here
//@Test will come in this class. And we can group multiple tests here if the tests can be grouped. If any tests cannot be grouped then create other TestFile similarly
public class AndroidTestFile extends Base{

	AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public void preTest()
	{
		//Refer to notes. This is used to get the app package and app activity Info. If we want every test to return back to any specific screen(Ex: homescreen) then we use Activity
		Activity activity = new Activity("pass the values here","pass the values here");
		driver.startActivity(activity);
	}
	
	
	@Test
	public void MethodName() throws IOException, InterruptedException {
		
		service = startServer();
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("APIDemos");
		
		AndroidPageObjects androidPageObjects = new AndroidPageObjects(driver);
		
		//androidPageObjects.setField("Ratna");
	}
	
}
