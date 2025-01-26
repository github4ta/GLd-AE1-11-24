package by.itacademy.artemkurepin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public LoginPage() {
        this.driver = new ChromeDriver();
    }

    public void driverQuit() {
        this.driver.quit();
    }

    public String getTitleLoginText() {
        WebElement webElement = driver.findElement(By.xpath(LoginPageLocators.TITLE_LOGIN));
        return webElement.getText();
    }

    public void fillFieldEmail(String email) {
        WebElement webElement = driver.findElement(By.xpath(LoginPageLocators.FIELD_EMAIL));
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String pass) {
        WebElement webElement = driver.findElement(By.xpath(LoginPageLocators.FIELD_PASSWORD));
        webElement.sendKeys(pass);
    }

    public void clickButtonLogin() {
        WebElement webElement = driver.findElement(By.xpath(LoginPageLocators.BUTTON_LOGIN));
        webElement.click();
    }
}
