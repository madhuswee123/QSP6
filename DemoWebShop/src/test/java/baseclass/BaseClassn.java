package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassn {
	
  public static WebDriver driver;
  
  @BeforeClass
    public void launch() {
	  driver = new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	 
 }
  
 @BeforeMethod
 public void logindetails() {
	 driver.findElement(By.linkText("Log in")).click();
	 driver.findElement(By.id("Email")).sendKeys("madhu673gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("madhu673");
	 driver.findElement(By.linkText("Log in")).click();
 }
  
   @AfterMethod
  public void logout() {
	  driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
  }

  @AfterClass
  public void close() {
	  driver.quit();
  }
   
   
}
