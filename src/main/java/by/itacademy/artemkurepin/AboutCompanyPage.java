package by.itacademy.artemkurepin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyPage {
    private ChromeDriver driver;

    public AboutCompanyPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getTitleAboutCompanyText() {
        return driver.findElement(By.xpath(AboutCompanyPageLocators.TITLE_ABOUT_COMPANY)).getText();
    }
}
