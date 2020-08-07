package br.com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.Parametros;

public class Utils extends Parametros {
	
	public void waitToBeClickable ( String locator, int time ) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		
	}
	

}
