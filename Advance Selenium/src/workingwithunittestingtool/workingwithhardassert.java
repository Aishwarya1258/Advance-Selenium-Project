package workingwithunittestingtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingwithhardassert {
	@Test
	public void login() throws InterruptedException {
		String expURL = "https://www.bmw.in/en/index.html";
		String expModelURL = "https://www.bmw.in/en/all-models.html";
		WebDriver driver = new ChromeDriver();
		Reporter.log("user is able to open the empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("user is able to open maximize browser", true);
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("user is able to open BMW", true);

		Thread.sleep(3000);
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, expURL);

		driver.findElement(By.xpath("//span[text()='Models']")).click();
		String actualModelurl = driver.getCurrentUrl();
		System.out.println(actualModelurl);
		Assert.assertEquals(actualModelurl, expModelURL);
		Thread.sleep(3000);
		driver.quit();

	}

}
