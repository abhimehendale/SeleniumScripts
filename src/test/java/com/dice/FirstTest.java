package com.dice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	
	@Test
	public void firstTestMethod(){
		System.setProperty("webdriver.gecko.driver", "//Users//abhishekmehendale//SeleniumDrivers//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		// Will open a webpage now.
		driver.get("http://www.dice.com");
		System.out.println("Dice Opened! Test Passed.");
		
		driver.quit();
		
	}

}
