package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        return driver.findElement(By.xpath(LoginPageLocators.TITLE_LOGIN)).getText();
    }

    public void fillFieldEmail(String email) {
        driver.findElement(By.xpath(LoginPageLocators.FIELD_EMAIL)).sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        driver.findElement(By.xpath(LoginPageLocators.FIELD_PASSWORD)).sendKeys(password);
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(LoginPageLocators.BUTTON_LOGIN)).click();
    }
}
