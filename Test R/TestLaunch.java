package com.OspreyDPIA.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Base.LaunchBrowser;
// FIRST DRAFT
public class TestLaunch extends LaunchBrowser{
	
	@Test
	public void OspreyDPIA() throws InterruptedException {
		driver.get("https://dev.ospreysmart.com/osp/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.className("formSignUpAction-buttonLink")).click();
		//driver.findElement(By.id("name")).sendKeys("Shobha");
		//driver.findElement(By.id("company-name")).sendKeys("Gravicus");
		//driver.findElement(By.id("email")).sendKeys("Shobharya@aol.com");
		//driver.findElement(By.id("password")).sendKeys("Gravicus123");
		//try {
		//	Thread.sleep(5000);
		//	Select dropdown = new Select(driver.findElement(By.id("company-size")));
		//	dropdown.selectByIndex(1);
		//}catch(Exception e)
		//{
		//	System.out.println(e);
		//}
		//try {
		//	Thread.sleep(5000);
		//	Select dropdown = new Select(driver.findElement(By.id("industry")));
		//	dropdown.selectByIndex(3);
		//	}catch(Exception e)
		//	{
		//	System.out.println(e);
		//}
		//driver.findElement(By.className("signUp-checkbox")).click();
		//driver.findElement(By.className("signUp-checkboxLabel")).click();
		//Thread.sleep(4000);
		//--driver.findElement(By.className("signUp-submit")).click();
		//Thread.sleep(4000);
		
		
		// LOGIN to DPIA --
		driver.findElement(By.id("email")).sendKeys("shobharya@aol.com");
		driver.findElement(By.id("password")).sendKeys("Gravicus123");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		// call DPIA  HyperLink
		driver.findElement(By.className("sidebar-listItemLink")).click();
		//Thread.sleep(1000);
		driver.findElement(By.className("ospDashboard-dpiaHighlight")).click();
		//Thread.sleep(2000);
		driver.findElement(By.className("button-green")).click();
		Thread.sleep(3000);
		
		
		
		//+ Add new business process
		//driver.findElement(By.id("process")).click();
		Thread.sleep(1000);
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
	
	}

}
