package org.maurin.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {
		// Load Chromedriver program and open WebDriver
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		System.setProperty("webdriver.gecko.driver", "tools/geckodriver");

		WebDriver driver = new FirefoxDriver();

		// Open browser to account management page & click on "Create Account"
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.linkText("Create Account")).click();

		// Fill out the form
		driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys("Test E User");
		driver.findElement(By.id("MainContent_txtEmail")).sendKeys("test.e.user@example.com");

		driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]")).sendKeys("3238675309");

		driver.findElement(By.cssSelector("input[type='password'][id='MainContent_txtPassword']")).sendKeys("mspass");
		driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys("mspass");

		driver.findElement(By.id("MainContent_Female")).click();

		new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByVisibleText("Germany");

		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();

		driver.findElement(By.id("MainContent_btnSubmit")).click();

		// Check that account was created
		String confirmation = driver.findElement(By.id(("MainContent_lblTransactionResult"))).getText();
		System.out.println(confirmation);

		//"Customer information added successfully"
		driver.close();
	}

}
