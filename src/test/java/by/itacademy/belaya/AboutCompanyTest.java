package by.itacademy.belaya;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyTest {

    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://blog.onliner.by/about");
    }

    @Test
    @DisplayName("Заголовок страницы содержит Информация о компании")
    public void testHeadingAboutCompany(){
        HomePage homePage = new HomePage(driver);
        AboutCompanyPage aboutCompanyPage = new AboutCompanyPage(driver);
        Assertions.assertEquals("Информация о компании",aboutCompanyPage.getTitleAboutCompanyText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
