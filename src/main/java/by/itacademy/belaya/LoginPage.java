package by.itacademy.belaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        String xPath = LoginPageLocators.TITLE_LOGIN;
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        String actual = webElement.getText();

        return actual;
    }
}
