package Interview;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.sql.DriverManager;

public class TESTbASE{

public WebDriver driver;
@Before
    public void setup(){
    driver = DriverHelper.getDriver();
    driver.navigate().to("https://www.facebook.com/");


}
    @After
    public  void tearDown(){
    driver.quit();
    driver = null;


    }


    }

