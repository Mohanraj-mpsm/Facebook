package com.flipkart;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusablefunctions.CommonFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import findElementRepository.Locators;



public class AccountCreation_Stepdefinition extends CommonFunctions {
	
//	CommonFunctions c = CommonFunctions.getInstance();
	CommonFunctions c = new CommonFunctions();
	Locators l = new Locators();
	
	@Given("Launching the website through url {string}")
	public void launching_the_website_through_url(String url) throws InterruptedException {
		
		driver.get(url);
	}

	@When("Sign up page appeared after clicking Create new account button")
	public void sign_up_page_appeared_after_clicking_create_new_account_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Create new account')]")));
	
		c.touch(l.getCreateAccount());
	}

	@Given("User enters the first name {string}")
	public void user_enters_the_first_name(String fname) throws IOException {
	  
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
			c.touch(l.getFirstName());
			c.insertText(l.getFirstName(), fname);
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot1.png");

			}
			catch (Exception e) {
			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot2.png");
			}

	}

	@Given("User enters the surname {string}")
	public void user_enters_the_surname(String lname) throws IOException {
		try {
			
			c.touch(l.getLastName());
			c.insertText(l.getLastName(), lname);
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot3.png");
			
			}
			catch (Exception e) {			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot4.png");
			}

	}

	@When("Mobile Number or Email address is entered {string}")
	public void mobile_number_or_email_address_is_entered(String num) throws IOException {
		try {
			
			c.touch(l.getEmailID());
			c.insertText(l.getEmailID(), num);
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot5.png");
			
			}
			catch (Exception e) {
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot6.png");
			}

	}

	@When("Password is entered {string}")
	public void password_is_entered(String pass) throws IOException {
		try {
			
			c.touch(l.getPassCode());
			c.insertText(l.getPassCode(), pass);
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot7.png");			
			}
			catch (Exception e) {			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot8.png");
			}

	}

	@Then("Date of birth is selected {string}")
	public void date_of_birth_is_selected(String yob) throws IOException {
		try {
			Select year = new Select(driver.findElement(By.id("year")));
			year.selectByVisibleText(yob);		
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot9.png");
			}
			catch (Exception e) {			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot10.png");
			}

	}

	@Then("Gender is selected")
	public void gender_is_selected() throws IOException {
		try {			
			c.touch(l.getGenderMale());			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot11.png");
		}
			catch (Exception e) {			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot12.png");
			}

	}

	@Then("SignUp button is clicked for account creation")
	public void sign_up_button_is_clicked_for_account_creation() throws IOException {
		try {			
			c.touch(l.getSignUp());			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot13.png");
			}
			catch (Exception e) {			
			c.screenshot("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\Screenshot/screenshot14.png");
			}

	}

}
