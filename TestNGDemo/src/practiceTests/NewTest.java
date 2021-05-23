package practiceTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	//WebDriver driver;
	@BeforeTest
	public void setup() {
	/*	System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/chromedriverlatest/chromedriver.exe");	
		 driver = new ChromeDriver(); //launch chrome
		  driver.get("https://www.calculator.net/");*/

System.out.println("setup");
	}
  @Test
  public void f1() {
System.out.println("f1");
  }
  @Test
  public void f2() {
	  System.out.println("f2");
  }
  @Test
  public void f3() {
	  System.out.println("f3");
  }
  @AfterTest
  public void teardown() {
		//driver.close();

System.out.println("teardown");
	}
}
