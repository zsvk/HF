package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{	public static WebDriver driver;
	public static void initialization()
	{
	WebDriverManager.firefoxdriver().setup();	//connect to actual browser
	driver = new FirefoxDriver();	//open new blank browser
	  
	
	//driver=new FirefoxDriver();			open new Blank Browser
	driver.manage().window().maximize();		//maximize the opned browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();		//if any cookies are present in webpage then it will delete it
	driver.get("https://demo.guru99.com/test/newtours/register.php");
}
}
