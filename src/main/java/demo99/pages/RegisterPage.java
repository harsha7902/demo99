package demo99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo99.utilities.PageUtility;
import demo99.utilities.WaitUtility;



public class RegisterPage {
//	new edit
	WebDriver driver;
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(xpath="//input[@name='userName']")
	WebElement email;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement ConfPassword;
	@FindBy(name="submit")
	WebElement submitBtn;
	//gettext
	@FindBy(xpath="//a[text()='SIGN-ON']")
	WebElement clickSignOn;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	WaitUtility waitutility=new WaitUtility();
	PageUtility pageutility=new PageUtility();
	
	public void enterFirstName(String strFName) {
		firstName.sendKeys(strFName);
	}
	public void enterLastName(String strLName) {
		lastName.sendKeys(strLName);
	}
	public void enterPhone(String strPhone) {
		phone.sendKeys(strPhone);
	}
	public void enterEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	public void enterAddress(String strAddress) {
		address.sendKeys(strAddress);
	}
	public void enterCity(String strCity) {
		city.sendKeys(strCity);
	}
	public void enterState(String strState) {
		state.sendKeys(strState);
	}
	public void enterPostal(String strPost) {
		postalCode.sendKeys(strPost);
	}
	public void selectCountry(String strCountry) throws InterruptedException {
		pageutility.selectByVisibleText(country, driver, strCountry);
		
	}
	public void enterUsername(String strUsername) {
		username.sendKeys(strUsername);
	}
	public void enterPw(String strPw) {
		password.sendKeys(strPw);
	}
	public void enterCorfirmPw(String strConfirmPw) {
		ConfPassword.sendKeys(strConfirmPw);
	}
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	public void registerDetails(String strFName, String strLName, String strPhone, String strEmail, String strAddress, String strCity, String strState, String strPost, String strCountry, String strUsername, String strPw, String strConfirmPw) throws InterruptedException 
	{
		this.enterFirstName(strFName);
		this.enterLastName(strLName);
		this.enterPhone(strPhone);
		this.enterEmail(strEmail);
		this.enterAddress(strAddress);
		this.enterCity(strCity);
		this.enterState(strState);
		this.enterPostal(strPost);
		this.selectCountry(strCountry);
		this.enterUsername(strUsername);
		this.enterPw(strPw);
		this.enterCorfirmPw(strConfirmPw);
		this.clickSubmitBtn();
	}
	public void clickSignOnBtn() {
		clickSignOn.click();
	}



}
