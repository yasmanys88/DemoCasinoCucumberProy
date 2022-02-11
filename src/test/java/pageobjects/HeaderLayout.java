package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderLayout {

    private By btnSigIn;
    private By btnRegistration;

    public  HeaderLayout(){
        btnSigIn= By.xpath("//header/div/div[2]/div[2]/a[1]");
        btnRegistration= By.xpath("//header/div/div[2]/div[2]/a[2]");
    }

    public By getBtnSigIn() {
        return btnSigIn;
    }

    public By getBtnRegistration() {
        return btnRegistration;
    }

    public By getUser_info__wrapper() {
        return By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div");
    }
}
