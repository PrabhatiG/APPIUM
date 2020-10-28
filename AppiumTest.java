package Android.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
  @Test
  public void calc() {
	// Set the Desired Capabilities
	  DesiredCapabilities caps=new DesiredCapabilities();
	  caps.setCapability("deviceName", "Pixel_3"); 
	  caps.setCapability("platformName", "Android");
	  caps.setCapability("appPackage", "com.android.calculator2");
	  caps.setCapability("appPackage", "com.android.calculator2");
	  caps.setCapability("appActivity", ".Calculator");
	  
	  //Instantiate Appium Driver
	  AppiumDriver<MobileElement>driver=null;
	  
	  
	// Initialize driver
	  try {
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		System.out.println("Calculator is open");
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	  
	  
  }
}
