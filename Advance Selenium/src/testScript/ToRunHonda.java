package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunHonda {
	@Test(groups = "car")
	public void honda() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://global.honda/en/");
		Thread.sleep(3000);
		driver.quit();
	}

}
