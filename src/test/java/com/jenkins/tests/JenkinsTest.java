package com.jenkins.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	public static final String USERNAME = "venu";
	  public static final String ACCESS_KEY = "14Feb1989#";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	@Test
	public void printMessage() throws MalformedURLException
	{
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.internetExplorer();
		desiredCapabilities.setBrowserName(System.getenv("SELENIUM_BROWSER"));
		desiredCapabilities.setVersion(System.getenv("SELENIUM_VERSION"));
		desiredCapabilities.setCapability(CapabilityType.PLATFORM, System.getenv("SELENIUM_PLATFORM"));
		System.out.println("Testing Jenkins configuration..");
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/IEDriverServer/IEDriverServer.exe");
		WebDriver driver = new RemoteWebDriver(new URL(URL), desiredCapabilities);
		// WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
