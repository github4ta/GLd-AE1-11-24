package by.itacademy.primako;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getTitleLoginText() {
        String xPath = "/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/div[1]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;
    }

    public void fillFieldEmail(String email) {
        String xPath = "/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.sendKeys(email);
    }

    public void fillFieldPassword(String password) {
        String xPath = "/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div/input";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        String xPath = "/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/form/div[3]/button";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}
