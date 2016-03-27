
package com.gmail.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLogin {
	
	private static WebElement element = null;
	
	
	public static WebElement Email(WebDriver driver){
		
		element = driver.findElement(By.id("Email"));
		return element;
	}
	
public static WebElement NextButton(WebDriver driver){
		
		element = driver.findElement(By.id("next"));
		return element;
		
	}
public static WebElement PassWord(WebDriver driver){
	
	element = driver.findElement(By.id("Passwd"));
	return element;
	
}
public static WebElement SignInButton(WebDriver driver){
	
	element = driver.findElement(By.id("signIn"));
	return element;
	
}

public static WebElement Verify(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[1]/div/span"));
	return element;
	
}

public static WebElement Compose(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id=':it']/div/div"));
	return element;
}
	
public static WebElement To(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id=':oh']"));
	return element;
}
public static WebElement Subject(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id=':o1']"));
	return element;
}

public static WebElement Content(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id=':p6']"));
	return element;
	
}
public static WebElement Send(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id=':nr']"));
	return element;
	
}
public static WebElement Sentmail(WebDriver driver){
	
	element = driver.findElement(By.xpath(".//*[@id=':j5']/div/div[1]"));
	return element;
	
}

public static WebElement GotoMail(WebDriver driver){
	
	element = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div[7]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]"));
	return element;
}
	
public static WebElement DropEmail(WebDriver driver){
	
	element = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[1]"));
	return element;
}
}

