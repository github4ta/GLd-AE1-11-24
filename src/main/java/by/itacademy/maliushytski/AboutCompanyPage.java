package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutCompanyPage {
    private WebDriver driver;

    public AboutCompanyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleAboutCompanyText() {
        By titleAboutCompany = By.xpath(AboutCompanyPageLocators.TITLE_ABOUT_COMPANY);
        WebElement titleAboutCompanyElement = driver.findElement(titleAboutCompany);
        return titleAboutCompanyElement.getText();
    }
}
