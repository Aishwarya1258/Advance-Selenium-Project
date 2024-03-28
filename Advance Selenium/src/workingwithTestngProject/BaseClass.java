package workingwithTestngProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	String emailId = "aishwaryaraj027@gmail.com";
	String password = "Aishuu96";
	String actualURL = "https://demowebshop.tricentis.com/";

	@BeforeSuite
	public void beforesuite() {
		System.out.println("iam before suite");
		Reporter.log("Data base connection start", true);
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("iam after suite");
		Reporter.log("Data base connection stop", true);
	}

	@BeforeClass
	public void browsersetup() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("user is able to open empty browser", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("user is able to open Demowebshop", true);
		String url = driver.getCurrentUrl();
		if (url.equals(actualURL)) {
			Reporter.log("user is able to land on demowebshophome page", true);
		} else {
			Reporter.log("user is notable to land on demowebshophome page");
		}
		Thread.sleep(6000);
	}

	@AfterClass
	public void quitbrowser() {
		driver.quit();
		Reporter.log("user is able to close the demowebshop", true);
	}

	@BeforeMethod
	public void login() throws Throwable {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("Password")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("user is able to login to demowebshop", true);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void logout() throws Throwable {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("user is able to logout from demowebshop", true);
		Thread.sleep(6000);
	}

}
