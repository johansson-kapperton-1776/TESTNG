package loginPg;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver1;
	
	@Test(priority = 1)
	void setupDriver()  {
		driver1 = new ChromeDriver();
		driver1.get("https://www.saucedemo.com/v1/");
		
		driver1.manage().window().maximize();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	// SMOKE TEST
	@Test(priority = 2, groups = "smoke")
	void checkTitle() {
		String title = driver1.getTitle();
		
		if(title.equals("Swag Labs"))  {
			System.out.println("Test passed");
		}  else {
			System.out.println("Test fail");
		}
	}
	@Test(priority = 3)
	void checkLogo() {
		WebElement logo = driver1.findElement(By.xpath("//div[@class='login_logo']"));
		if(logo.isDisplayed())  {
			System.out.println("Test pass");
		} else {
				System.out.println("Test fail");
			}
		}

	@Test(priority = 4)
	void checkUsername() {

		WebElement usernamefield = driver1.findElement(By.xpath("//input[@id='user-name']"));
		if(usernamefield.isDisplayed()) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
	}
	@Test(priority = 5, enabled = false)
	void checkPassword() {
		WebElement passwordfield = driver1.findElement(By.xpath("//input[@id='password']"));
		if(passwordfield.isDisplayed())  {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}

	}
	@Test(priority = 6)
	void checkLogin() {
		WebElement loginButton = driver1.findElement(By.xpath("//input[@id='login-button']"));
		if(loginButton.isDisplayed())  {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}

	}
}
