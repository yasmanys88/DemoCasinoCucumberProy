package pageactions;

import org.openqa.selenium.WebDriver;
import pageobjects.HeaderLayout;

public class HeaderLayoutAction extends MainPageAction{
    private HeaderLayout headerLayout;

    public HeaderLayoutAction(WebDriver driver) {
        super(driver);
        headerLayout=new HeaderLayout();
    }

    public void clickBtnSigIn(){
        getElement(headerLayout.getBtnSigIn()).click();
    }

    public void clickBtnRegistration(){
        getElement(headerLayout.getBtnRegistration()).click();
    }

    public boolean homepage(){
        return getElement(headerLayout.getUser_info__wrapper()).isDisplayed();
    }
}
