package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyPage {
    private WebDriver driver;

    public AboutCompanyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleAboutCompanyText() {
        String xPath = AboutCompanyPageLocators.TITLE_ABOUT_COMPANY;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;
    }
}
