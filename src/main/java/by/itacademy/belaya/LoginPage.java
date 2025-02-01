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
        By byXPath = By.xpath(LoginPageLocators.TITLE_LOGIN);
        WebElement webElement = driver.findElement(byXPath);

        return webElement.getText();
    }

    public void fillFieldEmail(String email) {
        By byXPath = By.xpath(LoginPageLocators.FIELD_EMAIL);
        WebElement webElement = driver.findElement(byXPath);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        By byXPath = By.xpath(LoginPageLocators.FIELD_PASSWORD);
        WebElement webElement = driver.findElement(byXPath);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        By byXpath = By.xpath(LoginPageLocators.BUTTON_LOGIN);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}
