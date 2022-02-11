package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    private By inputLoginName;
    private By inputPassword;
    private By checkRememberMe;
    private By linkForgotPassword;

    public  SignInPage(WebDriver driver){
        inputLoginName=By.id("UserLogin_username");
        inputPassword=By.id("UserLogin_password");
        checkRememberMe=By.xpath("//form/fieldset[1]/div[3]/div/label");
        linkForgotPassword=By.xpath("//form/fieldset[1]/div[3]/a");
    }

    public By getInputLoginName() {
        return inputLoginName;
    }

    public By getInputPassword() {
        return inputPassword;
    }

    public By getCheckRememberMe() {
        return checkRememberMe;
    }

    public By getLinkForgotPassword() {
        return linkForgotPassword;
    }

}
