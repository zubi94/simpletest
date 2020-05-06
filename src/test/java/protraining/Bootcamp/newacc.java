package protraining.Bootcamp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class newacc{
WebDriver driver;
@Test
public void f() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;    

	  WebElement name=driver.findElement(By.xpath("//*[@id='trending']"));
	  name.click();  
	  WebElement menumotion=driver.findElement(By.linkText("Home New Arrivals"));
	  menumotion.click();

}
//@BeforeClass
public void beforeClass()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\lala94\\eclipse-workspace\\homedepot\\chromedriver.exe");
	  
	  String url="https://www.target.com";
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
}

//@AfterClass
public void afterClass() {
}
}
