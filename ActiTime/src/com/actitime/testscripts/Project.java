package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class Project extends BaseClass{
	@Test
	public void createProject() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Project",true);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		FileLib f=new FileLib();
		String prjtNam = f.getExcelData("Sheet1", 1, 2);
		String PrjtDes=f.getExcelData("Sheet1", 1, 3);
		t.setProject(prjtNam, PrjtDes);
		
	}
}
