package demoJenkinpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import org.testng.annotations.Test;

public class jenkinDemoclass {

	@Test
	public void testJenkins()
	{
		System.out.println("Welcome Nitin in the world of Jenkins");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://adam.goucher.ca/parkcalc/");
		driver.close();
		
	}
}
