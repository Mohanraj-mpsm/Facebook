package com.flipkart;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.reusablefunctions.CommonFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import findElementRepository.Locators;

public class ProductSearch_Stepdefinition extends CommonFunctions {
	
	

//	CommonFunctions c = CommonFunctions.getInstance();
	CommonFunctions c =  new CommonFunctions();
	Locators l = new Locators();
	public static String href;

	@Given("Launching the website through url")
	public void launching_the_website_through_url() {
		driver.get("https://www.flipkart.com");
	    
	}

	@When("Login page is handled")
	public void login_page_is_handled() {
		
		boolean skipLogin = l.getClose().isDisplayed();
		Assert.assertTrue(skipLogin);
		c.touch(l.getClose());
	  
	}

	@When("entering a product name in search bar")
	public void entering_a_product_name_in_search_bar() throws InterruptedException, MalformedURLException, IOException {
		l.getSearchBar().sendKeys("Asics",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("Link"));
		Iterator<WebElement> link = links.iterator();
		while (link.hasNext()) {
			href = link.next().getAttribute("href");
			if (href == null || href.isEmpty())
			{
				System.out.println("Search link is empty or Null");
			}
			else if (!href.startsWith("https://www.flipkart.com")) {
				System.out.println("Link is not related to home domain");
			}
			else {
			HttpURLConnection http = (HttpURLConnection) new URL(href).openConnection();
			http.getRequestProperty("HEAD");
			http.connect();
			int responseCode = http.getResponseCode();
			if (responseCode==200) {
				System.out.println("The link is not a broken link:" +href);
			}
		}
		}
	
	}

	@Then("Get price of a product in search results")
	public void get_price_of_a_product_in_search_results() {
		
		List<WebElement> name = driver.findElements(By.xpath("(//a[@class='IRpwTa'])[1]"));
		for (int i = 0; i<name.size(); i++) {
			
			WebElement header = name.get(i);
			String names = header.getText();
			List<WebElement> price = driver.findElements(By.xpath("(//div[@class='_30jeq3'])[1]"));
			for (int j = i; j==i; j++) {
				
				WebElement headers = price.get(j);
				String prices = headers.getText();
				Map<String,String> m = new LinkedHashMap<String, String>();
				m.put(names, prices);
				Set<Entry<String, String>> entrySet = m.entrySet();
				for (Entry<String, String> entry : entrySet) {
					System.out.println(entry);
					
				}
				
			}
			
		}
	    
	}
	
	}


