
package com.williamSonoma.Pages;

import org.openqa.selenium.*;


public class WilliamSonomaHomePage {

	String tittle = null;

	public static String getTittle(WebDriver driver){

		String actualtitle = driver.getTitle();
		return actualtitle;

	}

}