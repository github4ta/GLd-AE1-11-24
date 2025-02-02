package by.itacademy.belaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutCompanyPage {
    private WebDriver driver;

    public AboutCompanyPage(WebDriver driver) {
    }

    public String getTitleAboutCompanyText() {
        By byXPath = By.xpath(AboutCompanyPageLocators.TITLE_ABOUT_COMPANY);
        WebElement webElement = driver.findElement(byXPath);
        return webElement.getText();
    }
}
