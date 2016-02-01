package demoJenkinpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Iterator;
 
import java.awt.List.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class jenkinDemoclass {

	@Test
	public void testJenkins()
	{
		String result="Pass";
		System.out.println("Welcome Nitin in the world of Jenkins");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://adam.goucher.ca/parkcalc/");
		driver.manage().window().maximize();
		
		
	}
}


