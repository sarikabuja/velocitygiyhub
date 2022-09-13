package pomPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginFunctionlity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
					"./DriverFolder/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is open");
			
			driver.manage().window().maximize();
			System.out.println("Window maximaze");
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("URL is Open");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			LoginPOMClass lp=new LoginPOMClass(driver);
			lp.sendUsername();
			System.out.println("user name is entered");
			
			lp.sendpassword();
			System.out.println("password is entered");
			
			lp.clickloginButton();
			System.out.println("login button clicked");
			
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
			driver.quit();
			System.out.println("Browser is closed");
			
			
			
			
			
			
	}
	

}
