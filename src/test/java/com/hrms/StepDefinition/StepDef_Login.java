package com.hrms.StepDefinition;

import com.hrms.POM.Login_HrmsPOM;
import com.hrms.TestRunner.BaseClass1;

import io.cucumber.java.en.*;

public class StepDef_Login {
	@Given("User lauches browser")
	public void user_lauches_browser() {
	   BaseClass1.launchbrowser();
	}

	@Given("User enters url {string}")
	public void user_enters_url(String hurl) {
	    BaseClass1.openapplication(hurl);
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String paswrd) {
	    Login_HrmsPOM.login(uname, paswrd);
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	   Login_HrmsPOM.clickonloginbtn();
	}
}
