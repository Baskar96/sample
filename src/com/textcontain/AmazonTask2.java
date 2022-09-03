package com.textcontain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask2 {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Baskar\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtAmazon = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		String text = txtAmazon.getText();
		System.out.println(text);
		
	}

}


//p[contains(text(),'Greens Technologies Selenium training class will make you an expert')]
//p[contains(text(),'Greens Technologies Selenium')]