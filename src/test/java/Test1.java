import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Test1 {

    public static WebDriver driver;

@BeforeSuite
    public void setUp(){
       WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

    }
@Test
    public void doLogin(){
    driver.get("https://jqueryui.com/slider/");
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.switchTo().frame(0);
    WebElement drag=  driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
    Actions action = new Actions(driver);
    action.dragAndDropBy(drag,400,0).perform();

    }
@AfterSuite
    public void tearDown(){
   // driver.close();
    }
}
