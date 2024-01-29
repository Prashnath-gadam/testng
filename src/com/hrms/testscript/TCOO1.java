package com.hrms.testscript;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.general;


public class TCOO1 {

	@Test
	public void test() {
		
		DOMConfigurator.configure("log4j.xml");
general obb =new general();
obb.openApplication();
obb.login();
obb.logout();
obb.closeApplication();
	}

}
