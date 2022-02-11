package pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtil;

import java.time.Duration;

public class MainPageAction {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public MainPageAction(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(TestUtil.EXPLICIT_WAIT));
    }

    public WebElement getElement(By locator) {
        WebElement element = null;
        try {
            waitForElementPresent(locator);
            element = driver.findElement(locator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return element;
    }

    public void waitForElementPresent(By locator){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPageTitle(WebElement elem){
        return elem.getText();
    }

}
