package pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.RegistrationPage;

public class RegistrationAction extends MainPageAction {

    private RegistrationPage registrationPage;

    public RegistrationAction(WebDriver driver) {
        super(driver);
        registrationPage = new RegistrationPage();
    }

    public String getTitle() {
        return getPageTitle(getElement(registrationPage.getPageTitle()));
    }

    public void resgisterUser(String type, String registrationForm, String currency, String password) {
       //if the type is email then I can register by email otherwise only register by phone
        if (type.equals("Email")) {
            getElement(registrationPage.getOptionEmail()).click();
            getElement(registrationPage.getInputEmail()).sendKeys(registrationForm);
        } else {
            getElement(registrationPage.getOptionPhoneNumber()).click();
            getElement(registrationPage.getInputPhoneNumber()).sendKeys(registrationForm);
        }
        //According to the type of currency selected I click on the radiobutton
        switch (currency) {
            case "USD":
                getElement(registrationPage.getOptionUSD()).click();
                break;
            case "EUR":
                getElement(registrationPage.getOptionEUR()).click();
                break;
            case "mBTC":
                getElement(registrationPage.getOptionmBTC()).click();
                break;
            case "mETH":
                getElement(registrationPage.getOptionmETH()).click();
                break;
            default:
                break;
        }
        //I write the password
        getElement(registrationPage.getInputPassword()).sendKeys(password);
        //I write the password Confirmation
        getElement(registrationPage.getInputPasswordConfirmation()).sendKeys(password);
        //I agree with the policy
        getElement(registrationPage.getComboAgree()).click();
        //click on the registration button
        getElement(registrationPage.getBtnRegister()).click();
    }


}
