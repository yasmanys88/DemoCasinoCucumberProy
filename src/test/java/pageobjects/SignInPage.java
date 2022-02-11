package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(how= How.ID,using = "UserLogin_username")
    private WebElement inputLoginName;

    @FindBy(how= How.ID,using = "UserLogin_password")
    private WebElement inputPassword;

    @FindBy(how= How.XPATH,using = "//form/fieldset[1]/div[3]/div/label")
    private WebElement checkRememberMe;

    @FindBy(how= How.XPATH,using = "//form/fieldset[1]/div[3]/a")
    private WebElement linkForgotPassword;

    private WebDriver driver;

    public  SignInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getInputLoginName() {
        return inputLoginName;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getCheckRememberMe() {
        return checkRememberMe;
    }

    public WebElement getLinkForgotPassword() {
        return linkForgotPassword;
    }
}
