package pageactions;

import org.openqa.selenium.WebDriver;
import pageobjects.SignInPage;

public class SignInAction extends MainPageAction {
    private SignInPage signInPage;

    public SignInAction(WebDriver driver) {
        super(driver);
        signInPage = new SignInPage(driver);
    }

    public String getTitle() {
        return getPageTitle(getElement(signInPage.getPageTitle()));
    }

    public void actionSignIn(String credential, String password) {
        //I write the credential
        getElement(signInPage.getInputLoginName()).sendKeys(credential);
        //I write the password
        getElement(signInPage.getInputPassword()).sendKeys(password);
        //click on the Sign In button
        getElement(signInPage.getBtnSignIn()).click();
    }

}
