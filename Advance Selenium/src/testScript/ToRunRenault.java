package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunRenault {
	@Test(groups = "car")
	public void Renault() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.renault.co.in/contact/book-a-test-drive/book-a-test-drive.html?modelAdminId=triber-xbc-ph1&?CAMPAIGN=in-r-l-newcar-triber-triber-03-2024-os-nmti-na-adomantra-emailer&ORIGIN=non_programmatic_display&utm_source=Adomantra&utm_medium=non_programmatic_display&utm_campaign=in-r-l-newcar-triber-triber-03-2024-os-nmti-na-adomantra-emailer&dclid=CL6b49yA04QDFbYGgwMdMEoMbA&gad_source=1&gclid=Cj0KCQiArrCvBhCNARIsAOkAGcWwBNQD4Rz9URgUozUDEoOehZFl8BEtzjXMH8gsLWkKFJvJZTczKGIaAomVEALw_wcB");
		Thread.sleep(3000);
		driver.quit();
	}

}
