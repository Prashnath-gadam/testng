package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class global {

	//std rule : To Provide TestData & objects related to whole application
	public    WebDriver driver;
	//============TestData
	// DT Var VV
	public String url = "http://183.82.103.245/nareshit/login.php";
//public String url = "http://127.0.0.1/orangehrm-2.6/login.php&quot;;
	public String username = "nareshit";
	public String password = "nareshit";
	public String efn = "selenium";
	public String eln = "suresh";

	//============Objects/elements
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frame_empinfo = "rightMenu";
	public String btn_add = "//input[@value='Add']";
	public String txt_efn = "txtEmpFirstName";
	public String txt_eln = "txtEmpLastName";
	public String btn_save = "btnEdit";
	}
	
