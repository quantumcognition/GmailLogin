package com.gmail.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.gmail.login.*;

public class GmailTest {
		
		private static WebDriver driver = null;
		 
		@BeforeTest
		
		public void getUrl(){
			driver = new FirefoxDriver();
			driver.get("https://gmail.com");
		
		}
		
		@Test
		public void Login(){
			
			//Log Into Gmail Account//
			
			GmailLogin.Email(driver).sendKeys("abc14");
			GmailLogin.NextButton(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			GmailLogin.PassWord(driver).sendKeys("*********");
			GmailLogin.SignInButton(driver).click();
		
			//Account Verification//
			
			//String r = GmailLogin.Verify(driver).getText();
	                //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//Assert.assertEquals(r, "Ananth");
			
			//Send a Mail Across//
			
			//GmailLogin.Compose(driver).click();
		        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//GmailLogin.To(driver).sendKeys("abc14@gmail.com");
			//GmailLogin.Subject(driver).sendKeys("Ola Senor !");
			//GmailLogin.Content(driver).sendKeys("Send it Across to Space !");
			//GmailLogin.Send(driver).click();
			//GmailLogin.Sentmail(driver).click();
			//GmailLogin.GotoMail(driver).click();
			
			//Action for transferring the mail from Inbox to Starred//
			
			Actions builder = new Actions(driver);   
	                Action builderOfActions = builder.dragAndDrop(GmailLogin.GotoMail(driver), GmailLogin.DropEmail(driver)).build();
	                builderOfActions.perform();
	                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.close();
			
		}
		
}
