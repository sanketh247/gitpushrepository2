package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newclass {
	@Test
	public void testLogin()
	{
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("sanketh247");
		driver.findElement(By.id("password")).sendKeys("gopala247");
		driver.findElement(By.name("commit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"Sign in to GitHub · GitHub");
		
		System.out.println("Continue to testing.........");
	}
}
