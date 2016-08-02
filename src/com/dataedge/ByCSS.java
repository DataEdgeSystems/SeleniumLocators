package com.dataedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author VikRam ShaRma
 *  DataEdge Systems Inc.
 */
public class ByCSS 
{
  public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();    // open FireFox browser instance
	driver.get("https://www.facebook.com/");   // open facebook.com
	driver.manage().window().maximize();       // maximze the browser
	
	driver.findElement(By.cssSelector("input[id=email")).sendKeys("dataedgesystems.inc@gmail.com");
	driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("sharma22");
	driver.findElement(By.cssSelector("input[id=u_0_m]")).click();
	
	System.out.println("TITLE IS:" +driver.getTitle());   // print the title of facebook
	driver.quit();
	
}
}
