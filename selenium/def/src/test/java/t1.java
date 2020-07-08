
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class t1 {
    @Test
    
    public void web () throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.bancoestado.cl");
     Thread.sleep(5000);
     driver.quit();
    }
}
