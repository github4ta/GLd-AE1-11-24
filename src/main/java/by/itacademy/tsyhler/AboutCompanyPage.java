package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.itacademy.tsyhler.AboutCompanyPageLocators.TITLE_ABOUT_COMPANY;

public class AboutCompanyPage {
    private WebDriver driver;

    public AboutCompanyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleAboutCompanyText() {
        return driver.findElement(By.xpath(TITLE_ABOUT_COMPANY)).getText();
    }
}
