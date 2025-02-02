package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyTest {
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath("//a[@id=\"submit-button\"]")).click();
    }

    @Test
    @DisplayName("AboutCompany contains Информация о компании in header")
    public void test1() {
        HomePage homePage = new HomePage(driver);
        homePage.clickFooterLinkAboutCompany();

        AboutCompanyPage aboutCompanyPage = new AboutCompanyPage(driver);
        String result = aboutCompanyPage.getTitleAboutCompanyText();

        Assertions.assertEquals("Информация о компании", result);
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
