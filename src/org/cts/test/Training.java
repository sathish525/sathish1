package org.cts.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish\\eclipse-workspace\\Sathish\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");


		WebElement SignIn = driver.findElement(By.xpath("//input[@value='SIGNIN']"));
		SignIn.click();
		Thread.sleep(2000);

		Alert a= driver.switchTo().alert();
		String text= a.getText();
		System.out.println(text);
		a.accept();
	}
}
