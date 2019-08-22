package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathish\\eclipse-workspace\\Sathish\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://www.snapdeal.com");
    
}
	
}
