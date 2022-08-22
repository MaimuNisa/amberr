package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin

{
    public FacebookLogin(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath ="//input[@id='email']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(partialLinkText = "The password you’ve entered is incorrect. ")
    WebElement incorrectpassword;

    public  void  Login(){

        userName.sendKeys("nisabasyir9@gmail.com");
        passWord.sendKeys("876t");

        loginButton.click();


    }
   public  boolean displaymessage(){
       if (incorrectpassword.isDisplayed());
   return true;
   }

    }

