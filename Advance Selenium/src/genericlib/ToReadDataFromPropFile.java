package genericlib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromPropFile {
	@Test
	public void ToOpenDemoWebShop() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		utilitymethods um = new utilitymethods();
		String url = um.readingthedatafromthepropertyfile("./testdata/data.properties", "url");
		driver.get(url);
	}
}
