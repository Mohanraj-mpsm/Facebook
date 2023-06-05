package com.reusablefunctions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	
	public static WebDriver driver;
	public static JavascriptExecutor js ;
	public static TakesScreenshot tk;
	public static Select s;
	
//	public static CommonFunctions c1 = null;
//	
//	private CommonFunctions() {
//		
//	}
//	
//	public static CommonFunctions getInstance() {
//		if(c1==null) {
//			c1= new CommonFunctions();
//		return c1;
//		}
//		return c1;
//	}
//	
	public void chromeBrowser_Launch() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);		
	}
	
	public void edgeBrowser_Launch() {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(options);		
	}

	public void browserClose() {
		
		driver.quit();	
	}
	
	public void maximize() {
		
		driver.manage().window().maximize();		
	}
	
	public void minimize() {
		
		driver.manage().window().minimize();
	}
	
	public void insertText(WebElement e, String text) {
		
		e.sendKeys(text);	
	}
	
	public void touch(WebElement e) {
		
		e.click();
	}
	
	public void get_text(WebElement e) {
		
		String out = e.getText();		
	}
	
	public void alert() {
		
		driver.switchTo().alert();		
	}
	
	public void handlingWindow() {
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);				
			}
			
		}
	}
	
	public void dropDown(WebElement e, int i) {
		
		s = new Select(e);
		s.selectByIndex(i);		
	}
	
	public void dropDown(WebElement e, String v) {
		
		s.selectByValue(v);		
	}
	
	public void dropDown(String k,WebElement e) {		
		
		s.selectByVisibleText(k);	
	}
	
	public void insertText(String val,WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+val+"')",e);
	}
	
	public void insertText(String val,WebElement e,int j) {
		
		Actions a = new Actions (driver);
		a.sendKeys(e,val);
	}
	
	public void scroll(WebElement e) {
		
		js.executeScript("arguments[0].scrollIntoView(true)",e);
	}
	
	public void screenshot(String location) throws IOException {
		tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(source, dest);
	}
	
	
	
}
