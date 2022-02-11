package pageactions;

import org.openqa.selenium.WebDriver;
import pageobjects.SignInPage;

public class SignInAction extends MainPageAction{
    private SignInPage signInPage;

    public SignInAction(WebDriver driver) {
        super(driver);
        signInPage=new SignInPage(driver);
    }
}
