/**
 * 
 */
package com.williamSonoma.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author anujrajput
 *
 */
public class SavedItemsPage {
	static WebElement element = null;
	public static WebElement view_getSavediTem(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class*='cart-table-row-title']")));
		element = driver.findElement(By.cssSelector("div[class*='cart-table-row-title']"));
		return element;

	}

}
