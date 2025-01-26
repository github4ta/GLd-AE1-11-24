package by.itacademy.aliaksandr.linnik;

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
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        String actual = webElement.getText();
        return actual;
    }

    public void click() {
        String xPath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }

    public void fillFieldEmail(String email) {
        String xPath = "(//input[@class=\"auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full\"])[1]";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        String xPath = "(//input[@class=\"auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full\"])[2]";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        String xPath = "//button[@class=\"auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full\"]";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }
}
