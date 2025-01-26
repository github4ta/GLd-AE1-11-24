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
        String xPath = "//div[@class=\'auth-bar__item auth-bar__item--text\'";
        WebElement webElement = driver.findElement(By.xpath(xPath));
        return webElement.getText();
    }

    public void fillFieldEmail(String email) {
        String xPath = "//input[@placeholder=\'Ник или e-mail\']";
        WebElement webElement = driver.findElement(By.xpath(xPath));
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        String xPath = "//input[@placeholder=\'Пароль\']";
        WebElement webElement = driver.findElement(By.xpath(xPath));
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        String xPath = "//button[@type=\'submit\']";
        WebElement loginButton = driver.findElement(By.xpath(xPath));
        loginButton.click();
    }
}

