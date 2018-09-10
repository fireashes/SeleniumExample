package test.selenium.pagepattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTest2 {
	WebDriver driver;
	WebElement textBox;

	public SeleniumTest2(WebDriver driver) {
		this.driver = driver;
		
		// you may Check title of the page and assert if page title is incorrect
        System.out.println("Page title is: " + driver.getTitle());
	}
	
	// Find the text box by ID
	public void inputTextBox(String txt) {
		// Find the text-box by ID and input data
		textBox = driver.findElement(By.id("q2"));
		textBox.clear();
		textBox.sendKeys(txt);
	}
	
	// Find and click selenium-test1
	public SeleniumTest1 clickSeleniumTest1() {
		// Find the text link by its name
		WebElement someElement = driver.findElement(By.linkText("selenium-test1"));
		
		// Click the link text
		someElement.click();
		
		return new SeleniumTest1(driver);
	}
	
	// Find and click selenium-test3
}