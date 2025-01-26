package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageLocators {
    private WebDriver driver;
    public static final String TITLE_LOGIN = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    public static final String FIELD_EMAIL = "//input[@placeholder='Ник или e-mail']";
    public static final String FIELD_PASSWORD = "//input[@type='password']";
    public static final String BUTTON_LOGIN = "//button[@type='submit']";

    public LoginPageLocators(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        return driver.findElement(By.xpath(TITLE_LOGIN)).getText();
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
