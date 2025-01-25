package by.itacademy.aliaksandr.linnik;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void beforeEach() {
        driver.get("https://www.onliner.by/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    public void click(final String xPath) {
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }

    public void setTest(final String xPath, final String value) {
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.sendKeys(value);
    }

    public void loginButton() {
        click("//div[@class=\"auth-bar__item auth-bar__item--text\"]");
    }

    public void forumButton() {
        click("(//span[@class=\"b-main-navigation__text\"])[7]");
    }

    public String inscription2001_2025() {
        String xPath = "//div[@class=\"footer-style__copy\"]";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        return webElement.getText();
    }

    public void AboutTheCompany() {
        click("//a[@href=\"https://blog.onliner.by/about\"]");
    }

    public void wePressAllTheButtons(String loginButton, String forumButton, String AboutTheCompany) {
        loginButton();
        forumButton();
        AboutTheCompany();
    }
}