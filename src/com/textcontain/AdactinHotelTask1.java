package com.textcontain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelTask1 {

public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Baskar\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	WebElement txtAdactin = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App! ')]"));
	String text = txtAdactin.getText();
	System.out.println(text);
	

}
}
