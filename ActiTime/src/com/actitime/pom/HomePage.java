package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="container_tasks")
	private WebElement tskTab;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgOut;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setTask() throws InterruptedException {
		Thread.sleep(50000);
		tskTab.click();
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(10000);
		lgOut.click();
	}

}
