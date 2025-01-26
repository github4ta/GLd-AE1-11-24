package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        String xPath = "//div[@class=\"auth-form__title auth-form__title_big auth-form__title_condensed-default\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;
    }

    public void fillFieldEmail(String email) {
        String xPath = "//input[@placeholder=\"Ник или e-mail\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        String xPath = "//input[@placeholder=\"Пароль\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        String xPath = "//button[@class=\"auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}
