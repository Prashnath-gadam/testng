package testng;
/*this is comapring data results of after and before class
  priority not given it will excuting frist ,
   if you give it will takes ( try 1,0,0; 010;001;)*/
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class df_Bt_am_bm {
	@Test(priority=1)
	public void openapp() {
		System.out.println(" app is opened");
	}
	@AfterMethod // last lo print avuthundi(test will print in the middle  )
	public void login() {
		System.out.println("last lo ravali logn into app ");
	}
	@BeforeMethod // excutes before the method(1st print avuthundi)
	public void enteremp() {
		System.out.println("1st print  snenter emp details");
	}
	@Test(priority = 1)
	public void closeapp () {
		System.out.println("close the app ");
	}
	@Test 
	public void aggrane() {
		System.out.println("testdata");
	}
	}
