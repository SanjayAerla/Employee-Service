package com.codewithsanju.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Myfiles\\chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			
//			WebDriver driver = new ChromeDriver();
//
//			//Facebook Login
//			driver.navigate().to("http://www.facebook.com/");
//			driver.findElement(By.id("email")).sendKeys("san*****@gmail.com");
//			driver.findElement(By.id("pass")).sendKeys("******");
//			driver.findElement(By.name("login")).click();
//			
//			Thread.sleep(3000);
//			
//			takeSnapShot(driver, "E:\\Myfiles\\Testing\\Automation Testing\\testWithCorrectDetails.png") ;
//			driver.close();
			
			
			WebDriver driver1 = new ChromeDriver();

			//Facebook Login
			driver1.navigate().to("http://www.facebook.com/");
			driver1.findElement(By.id("email")).sendKeys("san*****@gmail.com");
			driver1.findElement(By.id("pass")).sendKeys("******");
			driver1.findElement(By.name("login")).click();
			
			Thread.sleep(3000);
			takeSnapShot(driver1, "E:\\Myfiles\\Testing\\Automation Testing\\testWithWrongDetails.png") ;
			driver1.close();
			
		} catch (Exception ex) {
//			ex.printStackTrace();
		}

	}
	
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		try {
		File DestFile = new File(fileWithPath);
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		FileUtils.copyFile(scrShot.getScreenshotAs(OutputType.FILE), DestFile);
		} catch (Exception ex) {
//			ex.printStackTrace();
		}
	}
}
