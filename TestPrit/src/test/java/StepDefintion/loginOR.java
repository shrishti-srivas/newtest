package StepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginOR {
	public loginOR(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}
	@FindBy(id="username")WebElement usern;
	@FindBy(how=How.ID, using="password")WebElement passw;
	@FindBy(className="radius")WebElement login;
}
