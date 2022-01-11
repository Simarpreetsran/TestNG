package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Simar\\Java\\Chromedriver 95\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso-osu.canadapost-postescanada.ca/pfe-pap/en/registration/personal");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}		
}
