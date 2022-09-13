package pomPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogOutFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		driver.manage().window().maximize();
		System.out.println("Window maximaze");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is Open");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Login
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		System.out.println("user name is entered");
		
		lp.sendpassword();
		System.out.println("password is entered");
		
		lp.clickloginButton();
		System.out.println("login button clicked");
		//HomePage
		//setting button-logoutbutton
		HomePOMClass hp =new HomePOMClass(driver);
		hp.clickSettingButton();
		System.out.println("clicked on Setting Button");
		
		hp.clicklogOutButton();
		System.out.println("Clicked on logout button");
		
		//login page
		//validation
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("We have successfully login to saucedemo");
			System.out.println("Test case is passed");
			
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		
		//logout page
		//validation
		String expectedTitle1 = "Swag Labs";
		String actualTitle1 = driver.getTitle();
		if (expectedTitle1.equals(actualTitle1))
		{
			System.out.println("We have successfully logout to saucedemo");
			System.out.println("Test case is passed");
			
		}
		else
		{
			System.out.println("Test case is failed");
		}
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
