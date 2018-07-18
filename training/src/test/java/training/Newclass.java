package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newclass {
	@Parameters("browser")
	@Test
	public void testLogin(String value)
	{
		WebDriver driver=null;
		if(value.equals("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	
		else if (value.equals("Firefox"))
		{
			System.setProperty("WebDriver.gecko.driver","C:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("No Driver Found");
		}
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("sanketh247");
		driver.findElement(By.id("password")).sendKeys("gopala247");
		driver.findElement(By.name("commit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEquals(title,"GitHub");
		
		System.out.println("Continue to testing.......");
	}
	}
