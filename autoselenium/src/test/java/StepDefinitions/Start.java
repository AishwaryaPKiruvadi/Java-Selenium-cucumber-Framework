package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;

public class Start 
{
	
WebDriver driver = null;
LoginPage_PF login;
//Another PF(another class in same package )
//eg:
//HomePage_PF home 
	
	@Given("user in browser")
	public void user_in_browser() 
	{
		System.out.println("==== I am inside Start_PF=======");
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/CucumberJavaProject/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("user enetr url")
	public void user_enetr_url() throws InterruptedException 
	{
		Thread.sleep(2000);
	   driver.navigate().to("https://www.saucedemo.com/");
	   System.out.println("here1");
	}

	@Then("^user is in login page enters (.*) and passsword (.*) clicks on login$")
	public void user_is_in_login_page_enters_usernname_and_passsword_password_clicks_on_login(String usernname,String password) throws InterruptedException
	{
//		Thread.sleep(3000);
		login = new LoginPage_PF(driver);
		Thread.sleep(3000);
		login.enetrusername(usernname);
//		Thread.sleep(1000);
		Thread.sleep(3000);
		login.enetrpassword(password);
		Thread.sleep(3000);

		login.clickLogin();
		Thread.sleep(1000);

		
		
		
		
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(usernname);
//	    
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//	    Thread.sleep(2000);
//	   
//	    WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
//	    login.click();
	}
	
	@And("user adds to cart")
	public void user_adds_to_cart() throws InterruptedException {
		Thread.sleep(1000);
		 WebElement addCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		 addCart.click();
	    
	}

	@And("User go to cart and enter deatils")
	public void user_go_to_cart_and_enter_deatils() throws InterruptedException 
	{
		Thread.sleep(1000);
		
		 WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		 cart.click();
		 Thread.sleep(1000);
		 WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		 checkout.click();
		 Thread.sleep(1000);
		 
		 	WebElement fname = driver.findElement(By.xpath("//input[@id='first-name']"));  
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    fname.sendKeys("aman");
		    Thread.sleep(1000);
		    WebElement lname = driver.findElement(By.xpath("//input[@id='last-name']"));  
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    lname.sendKeys("dat");
		    Thread.sleep(1000);
		    
		    WebElement pcode = driver.findElement(By.xpath("//input[@id='postal-code']"));  
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    pcode.sendKeys("00654");
		    Thread.sleep(1000);
		    
		    WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		    cont.click();
	}

	@And("user makes payment")
	public void user_makes_payment() throws InterruptedException {
		Thread.sleep(1000);
		WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();
		
	}

	@Then("user get sucessful order message")
	public void user_get_sucessful_order_message() throws InterruptedException {
		Thread.sleep(1000);
		WebElement orderd = driver.findElement(By.xpath("//h2[@class='complete-header']"));
	}
	
//	@Then("user quits browser")
//	public void user_quits_browser() throws InterruptedException 
//	{
//		Thread.sleep(1000);
//		login = new LoginPage(driver);
//	    login.quitsbrowser();	
//	}
}

