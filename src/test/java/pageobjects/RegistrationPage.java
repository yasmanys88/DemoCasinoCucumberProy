package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    @FindBy(how= How.XPATH,using = "//div/div[3]/div/ul/li[1]")
    private WebElement optionEmail;

    @FindBy(how= How.XPATH,using = "//div/div[3]/div/ul/li[2]")
    private WebElement optionPhoneNumber;

    @FindBy(how= How.ID,using = "core__protected_modules_user_yiiForm_RegistrationForm_email")
    private WebElement inputEmail;

    @FindBy(how= How.ID,using = "core__protected_modules_user_yiiForm_RegistrationForm_phone")
    private WebElement inputPhoneNumber;

    @FindBy(how= How.XPATH,using = "//form/fieldset[2]/div[1]/div[1]/div[1]/label")
    private WebElement optionUSD;

    @FindBy(how= How.XPATH,using = "//form/fieldset[2]/div[1]/div[1]/div[2]/label")
    private WebElement optionEUR;

    @FindBy(how= How.XPATH,using = "//form/fieldset[2]/div[1]/div[1]/div[3]/label")
    private WebElement optionmBTC;

    @FindBy(how= How.XPATH,using = "//form/fieldset[2]/div[1]/div[1]/div[4]/label")
    private WebElement optionmETH;

    @FindBy(how= How.ID,using = "core__protected_modules_user_yiiForm_RegistrationForm_password")
    private WebElement inputPassword;

    @FindBy(how= How.ID,using = "core__protected_modules_user_yiiForm_RegistrationForm_password_confirmation")
    private WebElement inputPasswordConfirmation;

    @FindBy(how= How.ID,using = "core__protected_modules_user_yiiForm_RegistrationForm_password_confirmation")
    private WebElement comboAgree;

    @FindBy(how= How.XPATH,using = "//form/fieldset[3]/button")
    private WebElement btnRegister;

    @FindBy(how= How.XPATH,using = "//form/div[2]/a")
    private WebElement linkSignIn;

    private WebDriver driver;

    public  RegistrationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getOptionEmail() {
        return optionEmail;
    }

    public WebElement getOptionPhoneNumber() {
        return optionPhoneNumber;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPhoneNumber() {
        return inputPhoneNumber;
    }

    public WebElement getOptionUSD() {
        return optionUSD;
    }

    public WebElement getOptionEUR() {
        return optionEUR;
    }

    public WebElement getOptionmBTC() {
        return optionmBTC;
    }

    public WebElement getOptionmETH() {
        return optionmETH;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getInputPasswordConfirmation() {
        return inputPasswordConfirmation;
    }

    public WebElement getComboAgree() {
        return comboAgree;
    }

    public WebElement getBtnRegister() {
        return btnRegister;
    }

    public WebElement getLinkSignIn() {
        return linkSignIn;
    }


}
