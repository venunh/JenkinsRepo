package com.jenkins.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void printMessage()
	{
		System.out.println("Testing Jenkins configuration..");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/IEDriverServer/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
