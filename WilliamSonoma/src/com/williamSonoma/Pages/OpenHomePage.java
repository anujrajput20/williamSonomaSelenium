package com.williamSonoma.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenHomePage {

	private static WebElement element = null;
	public static void openHomePage(WebDriver driver,String url){
		driver.get(url);
	}

	public static WebElement btn_CookWare(WebDriver driver){
		element = driver.findElement(By.cssSelector("a.topnav-cookware"));
		return element;

	}

}