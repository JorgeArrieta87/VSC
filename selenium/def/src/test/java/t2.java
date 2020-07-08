import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
    public class t2 {
        @Test 
  
   public void login() { 
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); 
    WebDriver driver=new ChromeDriver();  
    driver.get("http://dbankdemo.com/login"); 
    
    WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]")); 
    WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]")); 
    WebElement login=driver.findElement(By.xpath("//*[@id=\"submit\"]")); 
    username.sendKeys("lala@lala.la"); 
    password.sendKeys("Lala1010"); 
    login.click();  
  
   
  }   

}
