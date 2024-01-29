package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/* program checking the before +afterclass and  giving priority
before and after will not work its just print. test is only excuting
programe. prority also not assings for before and afterclass.. its sub set f
@test only .testNG.org
*/
public class tesrng1 {
@AfterClass

public void openapp() {
	System.out.println("app is opened");

}
@BeforeClass
 public void login() {
	 System.out.println("login into app");
 }
 @Test(priority = 2)
 public void enterdetails() {
System.out.println("enter emp details");
 }
 @Test(priority = 1)
 public void closeapp() {
System.out.println("close the browser ");
 }
 }
