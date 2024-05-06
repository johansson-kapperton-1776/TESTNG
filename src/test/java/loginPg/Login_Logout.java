package loginPg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login_Logout {

	WebDriver driver1;
	// SMOKE TEST
	@Test(alwaysRun = true, priority = -1, groups = {"smoke", "regression"})
	void setupDriver()  {
		driver1 = new ChromeDriver();
		driver1.get("https://www.saucedemo.com/v1/");
		
		driver1.manage().window().maximize();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	// login with correct credentials
	
	// SMOKE TEST
	@Test(priority = 2, groups = "smoke")
	void loginC()  {
		
		WebElement usernamefield = driver1.findElement(By.xpath("//input[@id='user-name']"));
		usernamefield.sendKeys("standard_user");
		
		
		WebElement passwordfield = driver1.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys("secret_sauce");
		
		WebElement loginButton = driver1.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
		
	}
	
	// login with incorrect credentials
	@Test(priority = 3, enabled = false)
	void loginIn()  {
		
	}
	@Test(priority = 3)
	void logout()  {
		
	}
	
}
