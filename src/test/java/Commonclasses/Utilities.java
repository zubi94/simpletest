package Commonclasses;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Utilities {
	
	protected WebDriver driver;
	@Parameters({"browser","URL"})
	@BeforeTest
	public void browsers(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lala94\\Desktop\\Selenium misc files\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lala94\\Desktop\\Selenium misc files\\Firefox web driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}else {
			System.out.println("Browser name not correct");
		}
	}
	

  @AfterClass
  public void afterClass() {
  }

}
