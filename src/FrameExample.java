import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class FrameExample {

	public static void main(String[] args)throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement iframe=driver.findElement(By.xpath("//*[@id='iframeResult']"));
			driver.switchTo().frame(iframe);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("AZ");
            driver.switchTo().parentFrame();
            //driver.close();
            
            
	}

}