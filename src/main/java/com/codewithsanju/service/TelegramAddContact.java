package com.codewithsanju.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelegramAddContact {
	
	public static void main(String[] args) throws InterruptedException {
		
		Map<String, String> contactsMap = new LinkedHashMap<>();
		contactsMap.put("+919898618083","Hitesh");




		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Myfiles\\Companies\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver1 = new ChromeDriver(options);
		System.out.println(driver1.getTitle());
		Actions actions = new Actions(driver1);
		
		
		WebDriverWait wt = new WebDriverWait(driver1, 10);
		
		for(Map.Entry<String, String> map : contactsMap.entrySet()) {
			
			driver1.navigate().to("https://web.telegram.org/a/");
			Thread.sleep(3000);
			
			wt.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\"LeftMainHeader\"]/div[1]/button/div[2]")));
			driver1.findElement(By.xpath("//*[@id=\"LeftMainHeader\"]/div[1]/button/div[2]")).click();
			System.out.println("Opened Menu");
			Thread.sleep(3000);
			
//			WebElement contactsElement = driver1.findElement(By.xpath("//*[@id=\"LeftMainHeader\"]/div[1]/button/div[2]"));
//			actions.moveToElement(contactsElement).click().build().perform();
//			contactsElement.click();
			driver1.findElement(By.xpath("//*[@id=\"LeftMainHeader\"]/div[1]/div/div[2]/div[2]")).click();
			System.out.println("Opened Contacts");
			Thread.sleep(3000);
			
			driver1.findElement(By.xpath("//*[@id=\"LeftColumn-main\"]/div[2]/div[2]/div/button")).click();
			System.out.println("Opened AddContact");
			
			Thread.sleep(3000);
			driver1.findElement(By.xpath("//*[@id=\"portals\"]/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/input"))
					.sendKeys(map.getKey());
			System.out.println("Passed Phone Number " + map.getKey());
			
			Thread.sleep(3000);
			driver1.findElement(By.xpath("//*[@id=\"portals\"]/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/input"))
					.sendKeys("18Nov " + map.getValue());
			System.out.println("Passed Contact Name " + "18Nov " + map.getValue());
			
			Thread.sleep(3000);
			driver1.findElement(By.xpath("//*[@id=\"portals\"]/div[1]/div/div/div[2]/div[2]/div[2]/button[2]"))
					.click();
			System.out.println("Saved Contact");
			Thread.sleep(3000);
		}
		
	}
	
	static boolean checkMenuEnable(WebDriver driver) {
		
		if(driver.findElement(By.xpath("//*[@id=\"LeftMainHeader\"]/div[1]/button/div[2]")).isDisplayed())
			return true;
		else
			return false;
		
	}
}
