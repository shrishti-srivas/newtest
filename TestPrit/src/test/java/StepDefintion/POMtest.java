package StepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POMtest {
	WebDriver driver;
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on home page");
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
	}

	@When("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginOR test =new loginOR(driver);
		test.usern.sendKeys("tomsmith");
		test.passw.sendKeys("SuperSecretPassword!");
		test.login.click();
	}

	@Then("^display login msg successfully$")
	public void display_login_msg_successfully() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in successfully");
	}
}



