package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

        public String getTitleLoginText() {
        By titleLoginText = By.xpath(LoginPageLocators.TITLE_LOGIN);
        WebElement webElement = driver.findElement(titleLoginText);
        String actual = webElement.getText();
        return actual;
    }

    public void fillFieldEmail(String email) {
        By fieldEmail = By.xpath(LoginPageLocators.FIELD_EMAIL);
        WebElement webElement = driver.findElement(fieldEmail);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        By fieldPassword = By.xpath(LoginPageLocators.FIELD_PASSWORD);
        WebElement webElement = driver.findElement(fieldPassword);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        By buttonLogin = By.xpath(LoginPageLocators.BUTTON_LOGIN);
        WebElement webElement = driver.findElement(buttonLogin);
        webElement.click();
    }
}
