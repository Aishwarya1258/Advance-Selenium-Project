package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunNestle {
	@Test(groups = "food")
	public void Nestle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nestle.in/");
		Thread.sleep(3000);
		driver.quit();
	}
}
