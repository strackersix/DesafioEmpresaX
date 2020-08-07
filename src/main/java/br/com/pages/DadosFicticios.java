package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.core.Parametros;

public class DadosFicticios extends Parametros {

		
	public void url ( String url ) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void gender (String gender) {
		
		WebElement xpath = driver.findElement(By.xpath("//select[@id = 'gen']"));
		Select select = new Select(xpath);
		select.selectByVisibleText(gender);
				
	}
			
	public void nameSet (String nameSet) {
		
		WebElement xpath = driver.findElement(By.xpath("//select[@id = 'n']"));
		Select select = new Select(xpath);
		select.selectByVisibleText(nameSet);
		
	}	
	
	public void country ( String country ) {
		
		WebElement xpath = driver.findElement(By.xpath("//select[@id = 'c']"));
		Select select = new Select(xpath);
		select.selectByVisibleText(country);
		
		
	}
	
	public void generate () {
		
		driver.findElement(By.xpath("//input[@id = 'genbtn']")).click();
		
	}
	
	public void capturarTudo () {
		
		armazenaTudo = driver.findElement(By.xpath("//div[@class = 'info']")).getText();
		System.out.println("Todos os dados Capturados:" + "\n" + "-------------------------//--------------------------" + "\n\n" + armazenaTudo);
		
	}
	
	public void capturarNome () {
		
		armazenaNome = driver.findElement(By.xpath("//div[@class = 'address']/h3")).getText();
		
	}
	
	public void capturaEmail () {
		
		armazenaEmail = driver.findElement(By.xpath("(//dd)[9]")).getText();
		
		
	}
			
	
}
	
	
	
	
	
	
	
	
	
	

