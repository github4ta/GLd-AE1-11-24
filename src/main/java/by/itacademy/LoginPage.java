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
        String xPath = LoginPageLocators.TITLE_LOGIN;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;
    }

    public void fillFieldEmail(String email) {
        String xPath = LoginPageLocators.FIELD_EMAIL;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        String xPath = LoginPageLocators.FIELD_PASSWORD;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        String xPath = LoginPageLocators.BUTTON_LOGIN;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}
