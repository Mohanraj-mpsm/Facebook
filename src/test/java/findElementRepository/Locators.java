package findElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusablefunctions.CommonFunctions;

public class Locators extends CommonFunctions {
	//CommonFunctions c = CommonFunctions.getInstance();
	CommonFunctions c = new CommonFunctions ();
	
	public Locators() {
		PageFactory.initElements(c.driver,this);
	}

		@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
		private WebElement close;
		
		@FindBy(name="q")
		private WebElement searchBar;
		
		@FindBy(xpath="//a[contains(text(),'Create new account')]")
		private WebElement createAccount;
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy(xpath="//input[@name='reg_email__']")
		private WebElement emailID;
		
		@FindBy(xpath="//input[@name='reg_passwd__']")
		private WebElement passCode;
		
		@FindBy(xpath="(//input[@type='radio'])[2]")
		private WebElement genderMale;
		
		@FindBy(xpath="//button[@name='websubmit']")
		private WebElement signUp;
		
		public WebElement getCreateAccount() {
			return createAccount;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getEmailID() {
			return emailID;
		}

		public WebElement getPassCode() {
			return passCode;
		}

		public WebElement getGenderMale() {
			return genderMale;
		}

		public WebElement getSignUp() {
			return signUp;
		}

		
		public WebElement getClose() {
			
			return close;
		}

		public WebElement getSearchBar() {
			
			return searchBar;
		}		
}
