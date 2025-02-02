package by.itacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTextHelloWorld(){
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DynamicLoadingLocators.HELLO_WORLD));
        return driver.findElement(DynamicLoadingLocators.HELLO_WORLD1).getText();
    }
    public String getTextHelloWorld2(){
        return driver.findElement(DynamicLoadingLocators.HELLO_WORLD2).getText();
    }
}
