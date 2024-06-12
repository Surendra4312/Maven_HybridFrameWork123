package Cyclos_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Cyclos_BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public void OpenApplication() {

		driver=new ChromeDriver();
		

		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseApplication() {
	//driver.close();
}


	@AfterClass
	public void closeApp() {

		driver.close();
	}

	

}
