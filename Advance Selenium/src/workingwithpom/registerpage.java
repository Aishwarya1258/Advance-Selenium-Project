package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
	public registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerlink;

	public WebElement getregistterlink() {
		return registerlink;
	}

	public WebElement getmaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getfemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getfirstnametextbox() {
		return firstnametextbox;
	}

	public WebElement getlastnametextbox() {
		return lastnametextbox;
	}

	public WebElement getemailtextbox() {
		return emailtextbox;
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstnametextbox;
	@FindBy(id = "LastName")
	private WebElement lastnametextbox;
	@FindBy(id = "Email")
	private WebElement emailtextbox;

}
