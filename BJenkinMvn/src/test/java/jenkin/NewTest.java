package jenkin;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
	
    WebDriver driver=null;
Logger log=Logger.getLogger(NewTest.class);
		  @BeforeSuite
		  public void f() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vallisubash\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();
				 log.info("browser instantiated successfully");
				  	//	System.setProperty("webdriver.gecko.driver", "C:\Users\Vallisubash\Downloads\selenium\chromedriver_win32\\chromedriver.exe");
				  //WebDriver driver=new FirefoxDriver();
				  	

				  		driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				  driver.get("https://shop.demoqa.com/");
				  Thread.sleep(2000); 
				  
				  

		  }
		  @Test
		  public void main()
		  {
			System.out.println(driver.getCurrentUrl());
		  }
		  @AfterSuite
		  public void g()
		  {
			 driver.close(); 
		  }
  }

