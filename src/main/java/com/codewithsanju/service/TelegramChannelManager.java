package com.codewithsanju.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class TelegramChannelManager {
	
	public static void main(String[] args) throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        cap.setCapability("platformName","Windows");
        cap.setCapability("deviceName","WindowsPC");
      
        WindowsDriver wd = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
        LocalDate date = LocalDate.now();
        String datee = date.toString();
        
        wd.findElement(By.className("RichEditD2DPT")).sendKeys(datee);
    }
}



