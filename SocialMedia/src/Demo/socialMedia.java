package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class socialMedia
{
WebDriver driver;
String projectPath = System.getProperty("user.dir");
@BeforeClass

public void setup()
{
System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
driver = new ChromeDriver();
}
@Test
public void launch_app() throws Exception
{
driver.get("https://freecrm.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
}

@Test (dependsOnMethods = "launch_app")
public void twitter() throws Exception
{
WebElement twitter = driver.findElement(By.xpath("//div//a[@href='https://twitter.com/cogmento']"));
twitter.click();

Thread.sleep(5000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(5000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("Twitter loaded");
Thread.sleep(5000);
}

@Test (dependsOnMethods = "twitter")
public void facebook() throws Exception
{
WebElement facebook = driver.findElement(By.xpath("//div//a[@href='https://www.facebook.com/cogmento']"));
facebook.click();
Thread.sleep(3000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(6000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("Facebook loaded");
Thread.sleep(6000);
}

@Test (dependsOnMethods = "facebook")
public void github() throws Exception
{
WebElement github = driver.findElement(By.xpath("//div//a[@href='https://github.com/cogmento']"));
github.click();
Thread.sleep(3000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(6000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("Github loaded");
Thread.sleep(6000);
}

@Test (dependsOnMethods = "github")
public void paperplane() throws Exception
{
WebElement paperplane = driver.findElement(By.xpath("//div//a[@href='https://t.me/cogmento']"));
paperplane.click();
Thread.sleep(3000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(5000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("Paperplan loaded");
Thread.sleep(5000);
}

@Test (dependsOnMethods = "paperplane")
public void FaMedium() throws Exception
{
WebElement FaMedium = driver.findElement(By.xpath("//div//a[@href='https://medium.com/@cogmento']"));
FaMedium.click();
Thread.sleep(5000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(5000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("FaMedium loaded");
Thread.sleep(5000);
}

@Test (dependsOnMethods = "FaMedium")
public void Linkedin() throws Exception
{
WebElement Linkedin = driver.findElement(By.xpath("//div//a[@href='https://www.linkedin.com/company/cogmento']"));
Linkedin.click();
Thread.sleep(3000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(5000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("Linkedin loaded");
Thread.sleep(5000);
}

@Test (dependsOnMethods = "Linkedin")
public void Youtube() throws Exception
{
WebElement Youtube = driver.findElement(By.xpath("//div//a[@href='https://youtu.be/ow44nHQPMJw']"));
Youtube.click();
Thread.sleep(3000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(6000);
driver.close();
driver.switchTo().window(tabs2.get(0));
System.out.println("Youtube loaded");
Thread.sleep(6000);
}

@AfterClass
public void finish()
{
driver.quit();
System.out.println("Test is successful");
}
}