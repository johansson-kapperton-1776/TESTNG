package testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Framework.Base;

public class loginfunc {
	
	WebDriver driver;
	loginfunc lf;
	
	@Test
	void loginTest()  {
		
		driver = Base.getDriver();
		
	}
	
	public void takeScreenshot()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
	}

}
