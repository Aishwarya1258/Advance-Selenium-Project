package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRuncadbury {
	@Test(groups = "food")
	public void cadbury() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/personalised-gifts.html?utm_source=google&utm_medium=cpc&utm_campaign=MDLZ_CJD_Search_PROS_Brand_Exact_Broad_Non_Gifting_TROAS&gad_source=1&gclid=Cj0KCQiArrCvBhCNARIsAOkAGcVwR_FQR0jlpVRJjhUeHAbNG_fWBJxMo6Z_gOMNk4H7W5yMxOC9cRoaAqevEALw_wcB");
		Thread.sleep(3000);
		driver.quit();
	}
	
}

