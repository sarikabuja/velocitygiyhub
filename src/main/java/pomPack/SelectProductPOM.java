package pomPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPOM {

	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>allProducts;
	private WebDriver driver;
	
	public void ClickAllProducts()
	{
		allProducts.get(0).click();
		allProducts.get(1).click();
		allProducts.get(2).click();
		allProducts.get(3).click();
		allProducts.get(4).click();
		allProducts.get(5).click();
	}
	//constuctor
	public SelectProductPOM(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
		
		
		
		
		
	}
	
	
	
	
	
	

