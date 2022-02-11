package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderLayout {

    @FindBy(how= How.XPATH,using = "//header/div/div[2]/div[2]/a[1]")
    private WebElement btnSigIn;

    @FindBy(how= How.XPATH,using = "//header/div/div[2]/div[2]/a[2]")
    private WebElement btnRegistration;

    private WebDriver driver;

    public  HeaderLayout(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getBtnSigIn() {
        return btnSigIn;
    }

    public WebElement getBtnRegistration() {
        return btnRegistration;
    }

}
