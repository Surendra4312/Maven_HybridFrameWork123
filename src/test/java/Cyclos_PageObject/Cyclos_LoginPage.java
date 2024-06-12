package Cyclos_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	WebDriver driver;
	public Cyclos_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="//a[@id='login-link']//div[1]")
	WebElement btnclick;
	
	@FindBy(xpath="//input[@placeholder='User']")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement Submitbutton;
	
	public void setLoginclick() 
	{
		 btnclick.click();
	}
	public void setUsername(String uname) {
		txtUsername.sendKeys(uname);
	}
	public void setpassword(String password)
	{
		txtPassword.sendKeys(password);
	
	}
	public void setSubmit() 
	{
		Submitbutton.click();
	}

	
	}
