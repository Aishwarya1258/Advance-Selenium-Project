package workingwithunittestingtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingwithtimeout {
	@Test(timeOut = 3000)
	public void samsung() throws InterruptedException {
		 WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phonepe.com/");
		//Thread.sleep(3000);
		driver.quit();
	}

}
