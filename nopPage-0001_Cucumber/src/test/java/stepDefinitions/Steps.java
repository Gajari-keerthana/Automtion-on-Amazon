package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;


public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch firefox browser")
	public void user_launch_firefox_browser() {
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+".//Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		lp=new LoginPage(driver);
	  
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}

	@When("User enters Email or phone number as :{string}") 
	public void user_enters_email_or_phone_number_as(String email) {
	    lp.setUserName(email);
	  //  lp.setPassword(password);
	}
	
//	@When("click on continue ")
//	public void click_on_continue() {
//		lp.clickcontinue();
//	}
	@When("click on Continue")
	public void click_on_continue() {
		lp.clickcontinue();
	}
	
//	@When("User enters password as :{string}") 
//	public void user_password_as(String password) {
//	    lp.setUserName(password);
//	}
	@When("User enters password as : {string}")
	public void user_enters_password_as(String password) {
		lp.setPassword(password);
	}

	@When("click on Sign in")
	public void click_on_Sign_in() {
		lp.clickSignin();
	    
	}

//	@Then("page Title should be {string}")
//	public void page_title_should_be(String title) {
//	
//	    
//		if(driver.getPageSource().contains("Login was unsuccessful.")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else {
//			Assert.assertEquals(title, driver.getTitle());
//		}
//	}
	@Then("page Title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) 
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title,driver.getTitle());
		}
		String  actaul=driver.getTitle();
		System.out.println("here it is :"+actaul);
	}
	
//	@Then("Page Title should be {string}")
//	public void page_title_should_be(String title) {
//		if(driver.getPageSource().contains("Login was unsuccessful.")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else {
//			Assert.assertEquals(title, driver.getTitle());
//		}
//	}
	@Then("User on Accounts&Lists")
	public void user_on_accounts_lists() {
		lp.mouseover();
	}
	
//	@When("move to link")
//	public void move_to_link() {
//		lp.
//();

	
	
	@When("user click on Sign Out")
	public void user_click_on_Sign_Out_button() throws InterruptedException {
		lp.clickSignOut();
		Thread.sleep(3000);
	   
	}

	/*@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException(); 
	} */

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	  
	}


}
