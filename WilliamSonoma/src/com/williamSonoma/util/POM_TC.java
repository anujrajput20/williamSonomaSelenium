package com.williamSonoma.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.williamSonoma.Pages.CheckoutPage;
import com.williamSonoma.Pages.MauvielKettlePage;
import com.williamSonoma.Pages.OpenHomePage;
import com.williamSonoma.Pages.SavedItemsPage;
import com.williamSonoma.Pages.TeaKettlePage;
import com.williamSonoma.Pages.WilliamSonomaHomePage;


public class POM_TC {

	private static WebDriver driver = null;

	static String baseURL ="http://www.williams-sonoma.com/";
	String actualtitle = "";
	static String expectedtitle="Cookware, Cooking Utensils, Kitchen Decor & Gourmet Foods | Williams-Sonoma";
	public static void main(String[] args) {
		String browser="safari";
		try {
			if(browser.equalsIgnoreCase("safari")){
				driver = new SafariDriver();
			}else if(browser.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Open Home Page
		OpenHomePage.openHomePage(driver, baseURL);

		// Check For Title
		String actualtitle = WilliamSonomaHomePage.getTittle(driver);
		if (actualtitle.equalsIgnoreCase(expectedtitle)){
			System.out.println("Correct Tittle displayed as"+actualtitle );
		}else{
			System.out.println("Incorrect Tittle displayed");
		}

		//Click on Cookware
		OpenHomePage.btn_CookWare(driver).click();
		//Click on TeaKettle
		TeaKettlePage.btn_TeaKettle(driver).click();
		// Select MauvielKettle
		MauvielKettlePage.btn_MauvielKettle(driver).click();
		// Select Color
		MauvielKettlePage.txtbx_color(driver).click();
		//Select Quantity
		MauvielKettlePage.txtbx_quantity(driver).clear();
		MauvielKettlePage.txtbx_quantity(driver).sendKeys("1");	
		
		//Add MauvielKettle to Cart 
		MauvielKettlePage.btn_AddtoCart(driver).click();
		
		// Select Checkout
		MauvielKettlePage.btn_Checkout(driver).click();
		
		//Click on Save For Later
		CheckoutPage.btn_SaveForLater(driver).click();
		
		//Check for saved Items
		CheckoutPage.btn_OpenSaveForLaterPage(driver).click();
		String savedItem=SavedItemsPage.view_getSavediTem(driver).getText();

		if (savedItem.equalsIgnoreCase("Mauviel Teakettle, Stainless-Steel")){
			System.out.println("TEST PASSED");
		}else{
			System.out.println("SOMETHING WRONG");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}