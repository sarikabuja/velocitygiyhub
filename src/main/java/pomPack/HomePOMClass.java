package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {
      
	WebDriver driver;
	//setting button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingbutton;
	
	public void clickSettingButton()
	{
		settingbutton.click();
	}
	
	//logout button
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	public void  clicklogOutButton()
	{
		logOutButton.click();	
	}
	//constuctor
	public HomePOMClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}
