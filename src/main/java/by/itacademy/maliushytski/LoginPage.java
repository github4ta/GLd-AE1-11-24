package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        By titleLoginText = By.xpath(LoginPageLocators.TITLE_LOGIN);
        WebElement titleLoginTextElement = driver.findElement(titleLoginText);
        return titleLoginTextElement.getText();
    }

    public LoginPage fillFieldEmail(String email) {
        By emailField = By.xpath(LoginPageLocators.FIELD_EMAIL);
        WebElement emailFieldElement = driver.findElement(emailField);
        emailFieldElement.sendKeys(email);
        return this;
    }

    public LoginPage fillFieldPassword(String password) {
        By passwordField = By.xpath(LoginPageLocators.FIELD_PASSWORD);
        WebElement passwordFieldElement = driver.findElement(passwordField);
        passwordFieldElement.sendKeys(password);
        return this;
    }

    public LoginPage clickButtonLogin() {
        By loginButton = By.xpath(LoginPageLocators.BUTTON_LOGIN);
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
        return this;
    }
}
