package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunkia {
	@Test(groups = "car")
	public void kia() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kia.com/in/our-vehicles/sonet/showroom.html?utm_source=search&utm_medium=cpc&utm_campaign=sonet_pe&utm_content=text_ad&gad_source=1&gclid=Cj0KCQiArrCvBhCNARIsAOkAGcXTpG9DwtsUB38iw61DArEVF_0cFWrNxlBWo66yQZYh5XIGRD7pt28aAkhYEALw_wcB");
		Thread.sleep(3000);
		driver.quit();
	}

}
