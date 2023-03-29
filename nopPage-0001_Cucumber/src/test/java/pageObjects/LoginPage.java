package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

	
		public WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver)   //constructor
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(id = "ap_email")  //Annotation
		
		WebElement txtEmail;
			
		@FindBy(xpath= "//span[@id='continue']/descendant::input[@id='continue']")
		
		WebElement btncontinue;
		
		@FindBy(id = "ap_password")
	
		WebElement txtPassword;
		
		@FindBy(xpath= "//input[@id='signInSubmit']")
	
		WebElement btnSignin;
		
		@FindBy(xpath= "//*[@id=\"nav-link-accountList\"]")
		
		WebElement link;
		
		
		
		@FindBy(linkText= "Sign Out")
	
		WebElement lnkSignout;

		

	


		
		public void setUserName(String uname) {     //for each element we have to write action methods
			txtEmail.clear();
			txtEmail.sendKeys(uname);
		}
		
		public void clickcontinue()
		{
			btncontinue.click();
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.clear();
			txtPassword.sendKeys(pwd);
		}
		
		public void clickSignin()
		{
			btnSignin.click();
		}
		
		public void mouseover()
		{
			Actions act = new Actions(ldriver);
			act.moveToElement(link).build().perform();
		}
		
		public void clickSignOut()
		{
		lnkSignout.click();	
		}
		

		

	}



