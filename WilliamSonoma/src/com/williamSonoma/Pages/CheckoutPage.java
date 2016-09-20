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
public class CheckoutPage {

	static WebElement element = null;

	public static WebElement btn_SaveForLater(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[class*='save-for-later-link']")));
		element = driver.findElement(By.cssSelector("a[class*='save-for-later-link']"));
		return element;

	}

	public static WebElement btn_OpenSaveForLaterPage(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='#save-for-later-section']")));
		element = driver.findElement(By.xpath("//a[@href='#save-for-later-section']"));
		return element;

	}


}
