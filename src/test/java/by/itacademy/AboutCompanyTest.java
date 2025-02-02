package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyTest {
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Проверка , что заголовок страницы есть текст Информация о компании")
    public void getText() {
        AboutCompanyPage aboutCompanyPage = new AboutCompanyPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickFooterLinkAboutCompany();
        Assertions.assertEquals("Информация о компании", aboutCompanyPage.getTitleAboutCompanyText());
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}

