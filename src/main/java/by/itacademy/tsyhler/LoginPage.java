package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.itacademy.tsyhler.LoginPageLocators.*;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        return driver.findElement(By.xpath(LoginPageLocators.TITLE_LOGIN)).getText();
    }

    public void fillFieldEmail(String email) {
        driver.findElement(By.xpath(FIELD_EMAIL)).sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        driver.findElement(By.xpath(FIELD_PASSWORD)).sendKeys(password);
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
    }
}
