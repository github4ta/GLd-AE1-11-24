package by.itacademy.bordiyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        By xPath = By.xpath(LoginPageLocators.TITLE_LOGIN);
        WebElement webElement = driver.findElement(xPath);
        return webElement.getText();
    }

    public void fillFieldEmail(String email) {
        By xPath = By.xpath(LoginPageLocators.FIELD_EMAIL);
        WebElement webElement = driver.findElement(xPath);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        By xPath = By.xpath(LoginPageLocators.FIELD_PASSWORD);
        WebElement webElement = driver.findElement(xPath);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        By xPath = By.xpath(HomePageLocators.BUTTON_LOGIN);
        WebElement loginButton = driver.findElement(xPath);
        loginButton.click();
    }

    public String getAllForums(){
        return driver.findElement(By.cssSelector(LoginPageLocators.ALL_FORUMS)).getText();
    }
}

