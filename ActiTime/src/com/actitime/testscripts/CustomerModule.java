package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateCustomer",true);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		FileLib f=new FileLib();
		String custName = f.getExcelData("Sheet1", 1, 0);
		String dscrptn= f.getExcelData("Sheet1", 1, 1);
		t.setCustomer(custName, dscrptn);
		
	}
	
	
	
}
