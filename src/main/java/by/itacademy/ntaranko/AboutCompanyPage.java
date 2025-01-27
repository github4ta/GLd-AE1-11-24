package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutCompanyPage {
    private WebDriver driver;

    public AboutCompanyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleAboutCompanyText() {
        return driver.findElement(By.xpath(AboutCompanyPageLocators.TITLE_ABOUT_COMPANY)).getText();
    }
}
