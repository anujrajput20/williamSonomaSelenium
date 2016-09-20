package com.williamSonoma.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MauvielKettlePage {
	static WebElement element = null;

	public static WebElement btn_MauvielKettle(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[src*=mauviel-teakettle]")));
		element = driver.findElement(By.cssSelector("img[src*=mauviel-teakettle]"));
		return element;

	}

	public static WebElement txtbx_quantity(WebDriver driver){ 
		element = driver.findElement(By.cssSelector("input[class*='qty']"));
		return element;
	}

	public static WebElement txtbx_color(WebDriver driver){ 
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title*='Stainless Steel']")));
		element = driver.findElement(By.cssSelector("a[title*='Stainless Steel']"));
		return element;
	}

	public static WebElement btn_AddtoCart(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class*='btn_addtobasket_add']")));
		element = driver.findElement(By.cssSelector("button[class*='btn_addtobasket_add']"));
		return element;

	}

	public static WebElement btn_Checkout(WebDriver driver){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#btn-checkout.button-background a#anchor-btn-checkout.button")));
		element = driver.findElement(By.cssSelector("div#btn-checkout.button-background a#anchor-btn-checkout.button"));
		return element;

	}


}
