package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.core.Parametros;
import br.com.utils.Utils;

public class TentativaCadastroGmail extends Utils {

	public void signin () {
		
		driver.findElement(By.xpath("//div[@style = 'width:140px']/a")).click();
				
	}
	
	public void criarConta () {
		
		driver.findElement(By.xpath("//button[@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d uRo0Xe TrZEUc']")).click();
		
	}
	
	public void nome ( String nome) {
		
		waitToBeClickable("//input[@id = 'firstName']", 10);
		driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys(nome);
		
	}
	
	public void sobrenome ( String sobrenome ) {
		
		driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys(sobrenome);
		
	}
	
	public void email ( String email ) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'username']")).clear();
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name = 'Passwd']")).clear();
		
		int contador = 20;
		while (contador > 0) {
			
			driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(Keys.BACK_SPACE);
			--contador;
			
		}
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("123123");
		
	}
	
	public void senha ( String senha ) {
		
		
		driver.findElement(By.xpath("//input[@name = 'Passwd']")).sendKeys(senha);
		
	}
	
	public void confirmaSenha ( String confirmaSenha ) {
		
		driver.findElement(By.xpath("//input[@name = 'ConfirmPasswd']")).sendKeys(confirmaSenha);
		
	}
	
	public void proxima () {
		
		driver.findElement(By.xpath("//div[@id = 'accountDetailsNext']")).click();
		
	}
	
	
	
	
	
	
}
