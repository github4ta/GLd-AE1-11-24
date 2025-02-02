package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CatalogTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Текст соответствует названию Смартфон Apple iPhone 16 Pro Max 256GB (пустынный титан)")
    public void getText() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class=\"auth-button auth-button_expletive auth-button_base auth-form__button\"]")).click();
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickMenuLinkCatalog();
        catalogPage.clickMenuLinkApple();
        catalogPage.clickMenuLinkSmartphone();
      //  catalogPage.clickMenuLinkCatalogAndMenuLinkAppleAndMenuLinkSmartphoneAndGetTitleAppleSmartphoneText();
      //  Assertions.assertEquals("Смартфон Apple iPhone 16 Pro Max 256GB (пустынный титан)", CatalogPageLocators.TITLE_APPLE_SMARTPHONE);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}