package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    private By optionEmail;
    private By optionPhoneNumber;
    private By inputEmail;
    private By inputPhoneNumber;
    private By optionUSD;
    private By optionEUR;
    private By optionmBTC;
    private By optionmETH;
    private By inputPassword;
    private By inputPasswordConfirmation;
    private By comboAgree;
    private By btnRegister;
    private By linkSignIn;
    private By pageTitle;


    public  RegistrationPage(){
        optionEmail= By.xpath("//div/div[3]/div/ul/li[1]");
        optionPhoneNumber= By.xpath("//div/div[3]/div/ul/li[2]");
        inputEmail= By.id("core__protected_modules_user_yiiForm_RegistrationForm_email");
        inputPhoneNumber= By.id("core__protected_modules_user_yiiForm_RegistrationForm_phone");
        optionUSD= By.xpath("//form/fieldset[2]/div[1]/div[1]/div[2]/label");
        optionEUR= By.xpath("//form/fieldset[2]/div[1]/div[1]/div[2]/label");
        optionmBTC= By.xpath("//form/fieldset[2]/div[1]/div[1]/div[3]/label");
        optionmETH= By.xpath("//form/fieldset[2]/div[1]/div[1]/div[4]/label");
        inputPassword= By.id("core__protected_modules_user_yiiForm_RegistrationForm_password");
        inputPasswordConfirmation= By.id("core__protected_modules_user_yiiForm_RegistrationForm_password_confirmation");
        comboAgree= By.xpath("//*[@id='registration_form_1']/fieldset[2]/div[4]/label");
        btnRegister= By.xpath("//form/fieldset[3]/button");
        linkSignIn= By.xpath("//form/div[2]/a");
        pageTitle=By.xpath("//main/div/div[1]/div/div[1]/h2");
    }

    public By getOptionEmail() {
        return optionEmail;
    }

    public By getOptionPhoneNumber() {
        return optionPhoneNumber;
    }

    public By getInputEmail() {
        return inputEmail;
    }

    public By getInputPhoneNumber() {
        return inputPhoneNumber;
    }

    public By getOptionUSD() {
        return optionUSD;
    }

    public By getOptionEUR() {
        return optionEUR;
    }

    public By getOptionmBTC() {
        return optionmBTC;
    }

    public By getOptionmETH() {
        return optionmETH;
    }

    public By getInputPassword() {
        return inputPassword;
    }

    public By getInputPasswordConfirmation() {
        return inputPasswordConfirmation;
    }

    public By getComboAgree() {
        return comboAgree;
    }

    public By getBtnRegister() {
        return btnRegister;
    }

    public By getLinkSignIn() {
        return linkSignIn;
    }

    public By getPageTitle() {
        return pageTitle;
    }
}
