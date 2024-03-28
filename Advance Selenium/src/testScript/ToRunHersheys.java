package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunHersheys {
	@Test(groups = "food")
	public void hersheys() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thehersheycompany.com/en_us/home.html");
		Thread.sleep(3000);
		driver.quit();
	}
}
