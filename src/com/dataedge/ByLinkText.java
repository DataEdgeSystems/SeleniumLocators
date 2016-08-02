package com.dataedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author VikRam ShaRma
 *  DataEdge Systems Inc.
 */
public class ByLinkText 
{
  public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumhq.org");
	driver.manage().window().maximize();
    driver.findElement(By.partialLinkText("edit")).click();
    String title = driver.getTitle();
    System.out.println("TITLE IS: "+title);
    driver.quit();
	
}
}
