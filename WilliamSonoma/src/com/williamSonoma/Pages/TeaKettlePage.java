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
public class TeaKettlePage {

	private static WebElement element = null;
	public static WebElement btn_TeaKettle(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://www.williams-sonoma.com/shop/cookware/teakettles/?cm_type=lnav']")));
		element = driver.findElement(By.xpath("//a[@href='http://www.williams-sonoma.com/shop/cookware/teakettles/?cm_type=lnav']"));
		return element;

	}

}
