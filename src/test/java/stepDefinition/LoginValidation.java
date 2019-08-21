package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class LoginValidation {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^user is already on the Login Page$")
	public void user_is_already_on_the_Login_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abha Kumari\\Documents\\INTERVIEW\\SELENIUM\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		/* The below line causes timeout. Do the rca*/
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://typing.com/");
	}

	@When("^title of the login page is correct$")
	public void title_of_the_login_page_is_correct() {
		
		/*The below line of the code is useful only for the first time when we are finding out the title of the page. Store the value in a string "title_exp" */
		// System.out.println(driver.getTitle());
		String title_exp = "Learn to Type | Free Typing Tutor - Typing.com";
		String title_act = driver.getTitle(); //This captures the value on the fly and compare with the "tille_exp" one as part of Regression test
		Assert.assertEquals (title_exp, title_act);
		
	}

	@Then("^user enters the login credential$")
	public void user_enters_the_login_credential() {
	    
	    WebElement teacher_login = driver.findElement(By.xpath("//a[@href='/teacher/login' and @class='btn btn--c btn--login' and @data-full='Teacher Login ›']"));
	    teacher_login.click();
	    
	    WebElement username = driver.findElement(By.xpath("//*[@class='input input--fw sessionInput' and @id='form-ele-username' and @type='text' and @name='username']"));
	    username.sendKeys("kpeeyush8@gmail.com");
	    
	    WebElement nextButton = driver.findElement(By.xpath("//button[@type='submit' and @href='#' and @class='btn btn--l btn--a sessionForm-submit js-submit']"));
	    nextButton.click();
	    
	   
	    /* The below piece of code is not working. Tried with both static and dynamic wait. Do the rca. It throws error "java.lang.NullPointerException" */
		//WebElement pwd = driver.findElement(By.xpath("//*[@type='password' and @class='input input--fw sessionInput is-password' and @name='password' and @id='form-ele-password']"));
	    //pwd.sendKeys("typing.com");

	}
	
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
	    // Fill up the code snippet
	    
	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		// Fill up the code snippet
	    
	}
}
