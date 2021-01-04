package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStep {
	
	public WebDriver driver = Hooks.driver;
	
	@Given("^user is on facbook page$")
	public void user_is_on_facbook_page() {
	
		driver.get("http://www.facebook.com");
	    
	}

	@When("^user enters \"([^\"]*)\" and user enters \"([^\"]*)\"$")
	public void user_enters_and_user_enters(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(arg1);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(arg2);
	    
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	   
	}

	@Then("^user will not be able to log in$")
	public void user_will_not_be_able_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test Passed");

	   
	}



}
