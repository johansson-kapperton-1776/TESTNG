package loginPg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameter extends utility {

	// passing parameter 
	WebDriver driver;
	
	
	@Test
	void Title() {
		System.out.println("title");
	}
	
	@Test
	void logoTest()  {
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		if (logo.isDisplayed())  {
			logo.click();
		} else {
			System.out.println("Test fail");
		}
	}
	
	@Test
	void loginField()  {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	}
}
