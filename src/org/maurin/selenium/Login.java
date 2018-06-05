package org.maurin.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// Load Chromedriver program
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "tools/chromedriver");

		// Open WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to web page
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");

		//driver.close();
	}

}
