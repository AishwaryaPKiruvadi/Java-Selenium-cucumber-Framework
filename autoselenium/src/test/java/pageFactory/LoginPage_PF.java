package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF 
{
	@FindBy(id="user-name")
//	@CacheLookUp
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement btn_login;

	
	WebDriver driver;
	
	public  LoginPage_PF(WebDriver driver)
	{
		this.driver = driver;
//	PageFactory.initElements(driver,this);
		
/*		Tip : @CacheLookUp 
    	if you are working with Ajax applications(where different elements have diff loading time,
     	so it waits for an element to load till specified time then throw NOSuchElementFound )
        if you dnt use this you will get throw NOSuchElementFound Execptions 
        Here is how to code        */ 
        
//       AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
       PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        
        
		
		
		
	}
	
	
	//Actions
	public void enetrusername(String usernname)
	{
		txt_username.sendKeys(usernname);
	}
	
	public void enetrpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void clickLogin()
	{
		btn_login.click();
	}
}
