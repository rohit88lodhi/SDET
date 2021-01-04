package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OLAStepDef {
	
	public WebDriver driver = Hooks.driver;
	
	@Given("^user is on OLA Corporate page$")
	public void user_is_on_OLA_Corporate_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.get("https://corporate.olacabs.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}
	
	@When("^User Clicks on Contact US$")
	public void user_Clicks_on_Contact_US() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("link-contact")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}

	@When("^User Enters \"([^\"]*)\" in Name TexbBox$")
	public void user_Enters_in_Name_TexbBox(String arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email43")).sendKeys(arg1);
		Thread.sleep(3000);
			    
	}
	
	@When("^User Enters \"([^\"]*)\" in Name Email Address Textbox$")
	public void user_Enters_in_Name_Email_Address_Textbox(String arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys(arg1);
		Thread.sleep(3000);
	    
	}
	

	@When("^User Enters \"([^\"]*)\" in Name Company Name Textbox$")
	public void user_Enters_in_Name_Company_Name_Textbox(String arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("corporate_name")).sendKeys(arg1);
		Thread.sleep(3000);
	   
	}
	
	@When("^User Enters \"([^\"]*)\" in Name Phone Number Textbox$")
	public void user_Enters_in_Name_Phone_Number_Textbox(String arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("phone_no")).sendKeys(arg1);
	   Thread.sleep(3000);
	}
	
	@When("^User Enters \"([^\"]*)\" in Name Comments Textbox$")
	public void user_Enters_in_Name_Comments_Textbox(String arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("comments")).sendKeys(arg1);
		Thread.sleep(3000);
	   
	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		
	    
	}


}
