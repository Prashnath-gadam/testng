package testng;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
@Test
public class excel_webdriver_reports {
	   WebDriver driver;
	@BeforeClass
	public void startUp(){
	driver = new FirefoxDriver();
	}
	@AfterClass
	public void tearDown() {
	driver.quit();
	}
	public void tc001() throws Exception{
	   //Excel - Test Data
	FileInputStream file = new FileInputStream ("D:\\New folder\\pro.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet(0);
	String username = st.getCell(0,1).getContents();
	System.out.println(username );
	String password = st.getCell(1,1).getContents();
	System.out.println(password );
	Reporter.log(username);
	Reporter.log(password);
	driver.get("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application opened"); //html report
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	System.out.println("user  entered");
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	System.out.println("password entered");
	Thread.sleep(4000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed"); //console
	Reporter.log("Login completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
	}
	}
