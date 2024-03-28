package workingwithunittestingtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workinwithinvocationcount {
	@Test(invocationCount = 5,threadPoolSize = 4)
	public void run() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
		 
	}
	

}
