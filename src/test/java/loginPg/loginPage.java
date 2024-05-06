package loginPg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginPage {

	//priority
	//disable/enable
	//always run
	//Depends On
	//groups
	//run the group by using suit
	
	//data provider 
	// how to pass parameter with data
	
	//int[] data = {1, 3, 5, 8, 9 ,89};
	
	
	//int[][] data2 = { {20, 30}, {30,40}, {40,80} };
	
	WebDriver driver1;
	@Test(dataProvider = "LoginData")
	void loginTest(String username, String password)  {
		
		driver1 = new ChromeDriver();
		driver1.get("https://www.saucedemo.com/v1/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver1.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver1.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver1.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	
	
	
	@DataProvider(name = "LoginData")
	public Object[][] dataProviderx()  {
		Object[][] data = {{"standard_user","secret_sauce"},{"woo@gmail.com","4444444"},{"johan@gmail.com","433334"}};
		return data;
	}
	
}
