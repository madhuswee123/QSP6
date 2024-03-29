package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassn {
	
  public static WebDriver driver;
  
  @BeforeClass
    public void lanch() {
	  driver = new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	 
 }
  
  
    
  @AfterClass
  public void logout() {
	  driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
  }

}
