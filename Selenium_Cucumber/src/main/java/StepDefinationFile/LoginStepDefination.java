package StepDefinationFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefination {

	@Given("^User is alrdey in login page$")
	public void user_is_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dudekulanelapa\\workspace\\Selenium_Cucumber\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
	
	@Given("^User Tittle of Login Page FreeCRM$")
	public void user_tittle_of_login_page_freecrm()
	{
		
	}
	@Given("^User Enter UserName$")
	public void user_enter_username()
	{
		
	}
	@Given("^User Enter Password$")
	public void user_enter_password()
	{
		
	}
	
	@Given("^User Clik on Login Button$")
public void user_clik_0n_the_login_button()
{
		
}
	
	@Given("^User is on Home Page$")
public void user_is_on_Home_page()
{
		
}
}
