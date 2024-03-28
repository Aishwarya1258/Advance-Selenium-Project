package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunToyoto {
	@Test(groups = "car")
	public void toyoto() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toyotabharat.com/showroom/camry/?utm_campaign=camry-south-feb24&utm_source=google&utm_medium=lead&utm_term=lead&utm_content=conversions&agency_code=DENXX&gad_source=1&gclid=Cj0KCQiArrCvBhCNARIsAOkAGcXjCll0mKHgtN-T9fI-ydZs0jPm4yTydU7nO8wzC_-VQsCak8lAq4MaAkMeEALw_wcB");
		Thread.sleep(3000);
		driver.quit();
	}


}
