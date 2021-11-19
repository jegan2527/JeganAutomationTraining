package packageDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Cross_Program1 {
	
	
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	@Parameters("browserName")


	@BeforeTest
    public void setup(String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", projectPath+"/driver/msedgedriver.exe");
		driver = new EdgeDriver();
		}


	}
	
	
	public void testgoogle() throws Exception 
	{
	driver.get("https://google.com");
	Thread.sleep(10000);
	}
	
	public void testyahoo() throws Exception 
	{
	driver.get("https://yahoo.com");
	Thread.sleep(10000);
	}
	
	@AfterTest
	public void finish() {
	driver.quit();
	System.out.println("Test run is successful");
	}


	}


