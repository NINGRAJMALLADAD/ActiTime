package com.actitime.pom;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.FileLib;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement adNwBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement nWCustBtn;
	
	@FindBy(xpath="//div[@class='customerNameDiv']/input")
	private WebElement custNameBx;
	
	@FindBy(xpath="(//div[@class='comboboxButton']/div)[3]")
	private WebElement drpdwn;
	
	@FindBy(xpath="(//div[@class='inputContainer']/textarea)[9]")
	private WebElement descrptnBx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crtCustBtn;
	
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement nwPrjtBtn;
	
	@FindBy(xpath="//div[@class='sectionDetails']/input")
	private WebElement prjtNmBx;
	
	@FindBy(xpath="(//div[@class='inputContainer']/textarea)[9]")
	private WebElement prjtDesBx;
	
	@FindBy(xpath="//div[@class='customerContainer']//div[@class='dropdownButton']")
	private WebElement drpdwnBtn;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Our company']")
	private WebElement prjtOptn;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement crtPrjtBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setCustomer(String custname,String descrptn) throws InterruptedException {
		
		adNwBtn.click();
		nWCustBtn.click();
		Thread.sleep(3000);
		custNameBx.sendKeys(custname);
		Thread.sleep(3000);
		descrptnBx.sendKeys(descrptn);
		drpdwn.click();
		crtCustBtn.click();	
	}
	public void setProject(String PrjtNam,String PrjtDecrptn) throws InterruptedException {
		adNwBtn.click();
		nwPrjtBtn.click();
		Thread.sleep(3000);
		prjtNmBx.sendKeys(PrjtNam);
		Thread.sleep(3000);
		drpdwnBtn.click();
		Thread.sleep(3000);
		prjtOptn.click();
		Thread.sleep(3000);
		prjtDesBx.sendKeys(PrjtDecrptn);
		Thread.sleep(3000);
		crtPrjtBtn.click();
		
		
		
		
		
	}

}
