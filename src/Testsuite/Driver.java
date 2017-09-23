package Testsuite;

import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Driver {

	static ChromeDriver webDr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File file = new File("C:\\chromedriver.exe");
	
		launch();
				
		
	}
	


	@BeforeMethod()
	public static void launch(){
		System.setProperty("webdriver.chrome.driver", "F:\\Development\\Java\\chromedriver.exe");
		webDr = new ChromeDriver();
		webDr.get("https://www.phptutorial.com");		
		}
	
	@Test()
	public static void testchk()
	{
		System.out.println("page launched");
	
	}
	

}
