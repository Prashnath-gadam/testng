package com.hrms.testscript;
import org.testng.annotations.Test;



import com.hrms.lib.general ;
import org.apache.log4j.xml.DOMConfigurator;

public class TCOO2 {
	@Test
	public void TC002() {
		DOMConfigurator.configure("log4j.xml");	
general o = new general();
o.openApplication();
o.login();
o.logout();
o.closeApplication();
	}
}
