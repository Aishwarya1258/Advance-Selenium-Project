package workingwithunittestingtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingwithDependGroup {
	@Test(groups = "mobile")
	public void motorola() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.motorola.com/us/");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(groups = "mobile")
	public void samsung() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.samsung.com/in/offer/online/samsung-fest/?cid=in_pd_affiliate_other_all_none_samsungeshopfest2022_notification_20220701_none-1ur-501409l-2022&%243p=a_optimise_media&mid=2075365&pid=37899&~click_id=%7Bs2%7D&_branch_match_id=869843929018041140&utm_source=Display_OMG&utm_medium=paid%20advertising&_branch_referrer=H4sIAAAAAAAAA8soKSkottLXL87ILyhOzC0uzUtPz8lPSszRSywo0MvJzMvWD0kJroow9Q6vrEyyVzUyMS6wTYzPLyjJzM0sTo3PTU3JTFTLzUyxNTIwNzU2M1UrALKNzS0sLdVUzV2TczKTs%2BOBIqrmTsVGquYuAM6Xx8RwAAAA");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(groups = "mobile")
	public void oppo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		Thread.sleep(3000);
		driver.quit();
	}

}
