package Cyclos_Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Cyclos_PageObject.Cyclos_LoginPage;


public class TC_Cyclos_LoginTest extends Cyclos_BaseClass{
	@Test
	public void LoginTest() throws IOException {
		
		Cyclos_LoginPage lp=new Cyclos_LoginPage(driver);
		lp.setLoginclick();
		lp.setUsername("demo");
		lp.setpassword("1234");
		lp.setSubmit();
	}
	

}
