import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class seleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// All Constants and Locators
		String baseURL ="http://www.williams-sonoma.com/";
		String actualtitle = "";
		String expectedtitle="Cookware, Cooking Utensils, Kitchen Decor & Gourmet Foods | Williams-Sonoma";
		String cookWare="a.topnav-cookware";
		String teaKettle="//a[@href='http://www.williams-sonoma.com/shop/cookware/teakettles/?cm_type=lnav']";
		String mauvielteaKettle="img[src*=mauviel-teakettle]";
		String addToCartButton="button[class*='btn_addtobasket_add']";
		String quantity="input[class*='qty']";
		String stainlessSteel="a[title*='Stainless Steel']";
		String checkoutButton="div#btn-checkout.button-background a#anchor-btn-checkout.button";
		String saveForLater="a[class*='save-for-later-link']";
		String saveForLaterPage="//a[@href='#save-for-later-section']";
		String savedItemName="div[class*='cart-table-row-title']";
		long seconds=100;
		
		WebDriver driver = new SafariDriver();
		
		// Open williams-sonoma home Pagex
		driver.get(baseURL); 
		
		// Get title of the page
		actualtitle = driver.getTitle();
		if (actualtitle.equalsIgnoreCase(expectedtitle)){
			System.out.println("Correct Tittle displayed as"+actualtitle );
		}else{
			System.out.println("Incorrect Tittle displayed");
		}
		
		//driver.switchTo().frame("__cmbFrame");
		//driver.findElement(By.cssSelector("a[title='Minimize']")).click();
		
		//Click on cookWare
		driver.findElement(By.cssSelector(cookWare)).click();
		
		//Wait and click on Tea Kettle page 
		new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.xpath(teaKettle)));
		driver.findElement(By.xpath(teaKettle)).click();
		
		//Wait and select on mauviel Kettle 
		new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(mauvielteaKettle)));
		driver.findElement(By.cssSelector(mauvielteaKettle)).click();
		
		// Select Quantity
		new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(addToCartButton)));
		driver.findElement(By.cssSelector(quantity)).sendKeys("1");
		
		//Select Color
		driver.findElement(By.cssSelector(stainlessSteel)).click();
		
		//Click on Add to Cart Button
		driver.findElement(By.cssSelector(addToCartButton)).click();
		
		//Click on Checkout Button
		new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(checkoutButton)));
		driver.findElement(By.cssSelector(checkoutButton)).click();
		
		//Select Save for Later
		new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(saveForLater)));
		driver.findElement(By.cssSelector(saveForLater)).click();
		
		
		// View saved items
		new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.xpath(saveForLaterPage)));
		driver.findElement(By.xpath(saveForLaterPage)).click();
		
		
		//Get the value of the item in save to later page
		String itemInCart =driver.findElement(By.cssSelector(savedItemName)).getText();
		
		if(itemInCart.equalsIgnoreCase("Mauviel Teakettle, Stainless-Steel")){
			System.out.println("TEST PASSED");
		}else{
			System.out.println("TEST FAILED, Item is "+ itemInCart);
		}

		driver.close();


	}

}
