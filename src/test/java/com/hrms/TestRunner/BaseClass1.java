package com.hrms.TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass1 {

	public static WebDriver driver;
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver.","C:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	public static void openapplication(String urlhrms) {
		driver.get(urlhrms);//("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application is opened");
	}
	public static void closeapplication() {
		driver.quit();
		Reporter.log("Application is closed");
	}
}
