package by.itacademy.tsyhler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyTest {

    private WebDriver driver;
    private String expectedTitleOfInformationAboutCompanyPage = "Информация о компании";

    @BeforeEach
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath("//a[@id=\"submit-button\"]")).click();
    }

    @Test
    public void informationAboutCompanyTitleIsExist() {
        HomePage homePage = new HomePage(driver);
        homePage.clickFooterLinkAboutCompany();
        AboutCompanyPage aboutCompanyPage = new AboutCompanyPage(driver);
        Assertions.assertEquals(expectedTitleOfInformationAboutCompanyPage, aboutCompanyPage.getTitleAboutCompanyText());
    }

    @AfterEach
    public void quitBrowser() {
        driver.quit();
    }
}
