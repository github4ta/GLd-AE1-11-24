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
        By xPath = By.xpath(HomePageLocators.TITLE_LOGIN);
        WebElement webElement = driver.findElement(xPath);
        return webElement.getText();
    }

    public void fillFieldEmail(String email) {
        By xPath = By.xpath(HomePageLocators.FIELD_EMAIL);
        WebElement webElement = driver.findElement(xPath);
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

