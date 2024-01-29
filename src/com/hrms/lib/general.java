package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;
public class general extends  global{
	//std rule: To provide all re-usable fun:/methods: related to whole application
	public void openApplication() {
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened"); //console
	Reporter.log("Application opened"); //html report
	Log.info("Application Opened ");//log file
	}
	public void closeApplication() {
	driver.quit();
	System.out.println("Application closed");
	Log.info(" Application closed");
	}
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(username);
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	Log.info("Login competed ");
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Log.info("logout completed ");
	}
	public void enterFrame() {
	driver.switchTo().frame(frame_empinfo);
	System.out.println("Entered into frame");
	Log.info("entered into frame ");
	}
	public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from frame");
	Log.info("exit from frame ");
	}
	public void addNewEmp() {
	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_efn)).sendKeys(efn);
	driver.findElement(By.name(txt_eln)).sendKeys(eln);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("New emp added");
	Log.info("new emp added ");
	}
	}
