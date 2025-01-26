package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getTitleLoginText() {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(LoginPageLocators.TITLE_LOGIN));
    }

    public void fillFieldEmail(String email) {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(LoginPageLocators.FIELD_EMAIL)).sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(LoginPageLocators.FIELD_PASSWORD)).sendKeys(password);
    }

    public void clickButtonLogin() {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(LoginPageLocators.BUTTON_LOGIN)).click();
    }
}
