package com.dataedge;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author VikRam ShaRma
 *  DataEdge Systems Inc.
 */
public class ByDOM 
{
	public static void main(String[] args) throws InterruptedException {  
  try 
  {  
	 WebDriver driver = new FirefoxDriver();  
	 //Maximize window  
	 driver.manage().window().maximize();  
	 //Launching the browser page  
	 driver.get("file:///C:/Users/VikRamShaRma/Desktop/selenium/dom-locator.html");  
	 //Adding wait    
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	//Creating the Javascriptexecutor interface object by Type casting  
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	 //Send email address   
	 WebElement email = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementById('email');");  
	 email.sendKeys("dataedgesystems.inc@gmail.com");  
	 Thread.sleep(3000);  

	 //send pass  
	 WebElement pass = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.forms['domf2'].elements['password'];");  
	 pass.sendKeys("aaaaaa");  
	 Thread.sleep(3000);  

	 //Click on button  
	 WebElement btn = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.forms[1].elements['butt'];");  
	 btn.click();  
	 WebElement last = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementsByName('name1')[0];");  
	 last.sendKeys("aaaaaa");  
	 Thread.sleep(3000);  

	 //close firefox browser   
	 driver.quit();  
   }catch(NoSuchElementException e) 
      {
	   e.printStackTrace();
	  }  
 }  
} 