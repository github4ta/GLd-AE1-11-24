package by.onliner;

import by.onliner.pages.MainPage;
import by.onliner.singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ServicesPageTest {
    private WebDriver driver;

    @Test
    public void testGetTitleOfServicesPage() {
        String actual = new MainPage(driver).openDriver().clickServiceSectionButton().getTitleOfServicesPage();
        Assertions.assertEquals("Заказы", actual);
        Singleton.quit();
    }
}
