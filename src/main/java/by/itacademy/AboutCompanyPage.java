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
        By titleAboutCompanyText = By.xpath(AboutCompanyPageLocators.TITLE_ABOUT_COMPANY);
        WebElement webElement = driver.findElement(titleAboutCompanyText);
        String actual = webElement.getText();
         return actual;
    }
}
