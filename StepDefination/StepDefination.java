package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	public WebDriver driver;
	
	@Given("^User navigates to Google Page$")
	public void user_navigates_to_Google_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	    
	}

	@When("^User Enter String is Search Box$")
	public void user_Enter_String_is_Search_Box() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("ibm");
	  
	}

	@Then("^Results will Display$")
	public void results_will_Display() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
	   
	}

	
	
}
