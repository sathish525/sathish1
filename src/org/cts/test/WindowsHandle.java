package org.cts.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
public static void main(String[] args) throws Throwable {
    //launching Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish\\eclipse-workspace\\Sathish\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	
	
	WebElement login =driver.findElement(By.id("inputValEnter"));
	login.sendKeys("Iphone x");
		
	// keyboard actions
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement p =driver.findElement(By.xpath("//p[text()='iPhone X Soft Silicon Cases WK Design - White WK Fluxay Phone Case']"));
	p.click();
	
	//parent id return type String
	
	String par=driver.getWindowHandle();
	System.out.println(par);
	
	//All Windows id return type must be Set<String>
	
	Set <String> child = driver.getWindowHandles();
	System.out.println(child);
	
	//Iteration
	for(String x:child) {
		if(!par.equals(x));
		driver.switchTo().window(x);
	}
	
//driver.findElement(By.xpath("//a[contains(text()'T&C')]"));
	
	//to back to main window
	driver.switchTo().defaultContent();
	
	Set <String> s = driver.getWindowHandles();
//Multiple Windos Switcch	
	
	List <String> li = new ArrayList();
	
	li.addAll(s);
	String a =li.get(0);
	driver.switchTo().window(a);
	
	
	
	
	
}
}
