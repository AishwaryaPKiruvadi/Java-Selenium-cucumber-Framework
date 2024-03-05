package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	//Object Identifiers - if identifiers changes from backend,directly can change from here at a center place for all	
//	giving protected and private is best practice 
	
	  protected WebDriver driver;
	
      private By txt_username = By.id("user-name");
      private By txt_password = By.id("password");
      private By btn_login = By.id("login-button");

//      Constructor     
      public LoginPage(WebDriver driver) 
      {
    	  this.driver = driver;
//    	  If you have trouble finding the “<title>” in the sea of HTML, then use the Find function. Again, on Windows, you can select Ctrl + F and then type “title” to quickly find the Title
    	  if(!driver.getTitle().equals("Swag Labs"))
    	  {
    		  throw new IllegalStateException("This is not Login page. Its" +driver.getCurrentUrl());
    	  }
      }
      //Actions for login page objects
      
      public void enterUsername(String usernname)
      {
    	  driver.findElement(txt_username).sendKeys(usernname);
    	  
      }
      
      public void enterPassword(String password)
      {
    	  driver.findElement(txt_password).sendKeys(password);
      }
      
      public void clickLogin()
      {
    	  driver.findElement(btn_login).click();
      }
      
      public void quitsbrowser() 
  	{
  	    driver.close();
  	    driver.quit();
  	}
}


