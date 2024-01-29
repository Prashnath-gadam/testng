package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001_testNG {
	public WebDriver driver;
	@BeforeClass
public void openapp() throws Exception {
		driver = new ChromeDriver();
	driver. get("http://183.82.103.245/nareshit/login.php");
	Reporter.log("app is opened");
	System.out.println("app is opened");
}
	@AfterClass
	public void closeapp() throws Exception{
		driver.findElement(By.linkText("Logout")).click();
	driver.close();	
	Thread.sleep(3000);
	Reporter.log("logout complited");
		System.out.println("closed the broswer");
		Reporter.log("closed app");
	}
	@Test
	public void login()throws Exception {
		Reporter.log("app io opeend");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
		System.out.println("logined successfuly");
	Reporter.log(" results are o ");
	Reporter.log("Login completed");
	
	}
}
