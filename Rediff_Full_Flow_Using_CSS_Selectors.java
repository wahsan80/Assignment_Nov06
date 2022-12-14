package assignment_nov06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Full_Flow_Using_CSS_Selectors {
	
	public static WebDriver driver;
	public static SoftAssert softassert;
	
	@BeforeTest
	
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)	
	public void CheckUrlTitle() {
		
		String CurrentUrl = driver.getCurrentUrl();
		String CurrentTitle = driver.getTitle();
		System.out.println("Current URL is: " + CurrentUrl);
		System.out.println("Current Title is: " + CurrentTitle);
		
	}
	
	@Test(priority=2)
	
	public void SignIn() {
		
		WebElement SignInLink = driver.findElement(By.cssSelector("a.signin"));
		softassert = new SoftAssert();
		softassert.assertTrue(SignInLink.isEnabled());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(SignInLink)).click();
		
		//driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	@Test(priority=3)
	
	public void SignOut() {
		
		driver.findElement(By.cssSelector("a.rd_logout")).click();
	}
	
	@Test(priority=4)
	
	public void HomePage() {
		
		driver.findElement(By.cssSelector("a.logo+span>a:nth-child(2)>b:nth-child(1)")).click();
	}

	@AfterTest
	
	public void CloseBrowser() {
		
		driver.quit();
	}

}
