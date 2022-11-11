package assignment_nov06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoPractice_FlowUsingCSS_Selectors {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.pl/index.php?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)	
	public void CheckURL() {
		
		System.out.println("Current URL is: " + driver.getCurrentUrl());
	}
	
	@Test(priority=2)
	
	public void SignIn() {
		
		driver.findElement(By.cssSelector("a.login")).click();
	}
	
	@Test(priority=3)
	
	public void CreateAccount() {
		
		driver.findElement(By.cssSelector("input#email_create")).sendKeys("w_ahsan2@hotmail.com");
		driver.findElement(By.cssSelector("button#SubmitCreate")).click();
		
	}
	
	@Test(priority=4)
	
	public void UserCredentials() {
		
		driver.findElement(By.cssSelector("input#id_gender1")).click();
		driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("Waqas");
		driver.findElement(By.cssSelector("input#customer_lastname")).sendKeys("Ahsan");
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("Abcdef123@");
		driver.findElement(By.cssSelector("select#days")).sendKeys("1");
		driver.findElement(By.cssSelector("select#months")).sendKeys("January");
		driver.findElement(By.cssSelector("select#years")).sendKeys("1990");
		//driver.findElement(By.cssSelector("button#submitAccount")).click();
	}

	@AfterTest
	
	public void CloseBrowser() {
		
		//driver.quit();
	}

}
