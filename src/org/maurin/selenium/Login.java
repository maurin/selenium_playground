package org.maurin.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// Load Chromedriver program and open WebDriver
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "tools/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Open browser and Navigate to web page
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");

		// Find element, determine action, pass parameters
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("tim@testmail.com");
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");

		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();









		//driver.close();
	}

}
