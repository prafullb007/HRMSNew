package com.hrms.POM;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.TestRunner.BaseClass1;

public class Login_HrmsPOM  extends BaseClass1{

	// OBJECTS
	static By txt_username=By.name("txtUserName");
	static By txt_password=By.name("txtPassword");
	static By btn_login=By.name("Submit");
	// FUNCTIONS
	public static void login(String un,String pw) {
	driver.findElement(txt_username).sendKeys(un);
	driver.findElement(txt_password).sendKeys(pw);
	}
	public static void clickonloginbtn() {
	driver.findElement(btn_login).click();
	Reporter.log("Login is completed");
	}

}
