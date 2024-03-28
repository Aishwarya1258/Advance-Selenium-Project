package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	public Basepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="small-searchterms")
	private WebElement searchbar;
	
	@FindBy(id="small-searchterms")
	private WebElement searchbutton;
	
	public WebElement getsearchbar() {
		return searchbar;
	}

	

}
