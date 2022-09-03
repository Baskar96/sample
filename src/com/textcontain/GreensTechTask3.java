package com.textcontain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask3 {
	
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Baskar\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		WebElement txtOverview = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		 txtOverview.click();
		WebElement txtAboutSelenium = driver.findElement(By.xpath("//div[@class='card-body']"));
		String text = txtAboutSelenium.getText();
		System.out.println(text);		
		System.out.println(text1);
		System.out.println(text1);
	
}
}



