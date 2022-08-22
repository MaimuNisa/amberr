import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Singleton {

    private  static WebDriver driver;

    public Singleton() {
    }


    public  WebDriver getDriver(){

      if(driver==null)  {
          switch ("chrome"){
              case "chrome":
                  WebDriverManager.chromedriver().setup();
                  driver = new ChromeDriver();
                  break;
              case "firefox":
                  WebDriverManager.firefoxdriver().setup();
                  driver = new FirefoxDriver();
                  break;

              default:
                  WebDriverManager.chromedriver().setup();
                  driver = new ChromeDriver();


          }
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


      }
return  driver;

    }

    public  void  tearDown(){
        driver.quit();
        driver=null;
    }


}
