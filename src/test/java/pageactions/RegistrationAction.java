package pageactions;

import org.openqa.selenium.WebDriver;

public class RegistrationAction extends MainPageAction{

    private RegistrationAction registrationAction;

    public RegistrationAction(WebDriver driver) {
        super(driver);
        registrationAction = new RegistrationAction(driver);
    }

}
