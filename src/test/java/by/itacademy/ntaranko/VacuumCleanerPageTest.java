package by.itacademy.ntaranko;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VacuumCleanerPageTest {

    private String url = "https://catalog.onliner.by/vacuumcleaner";

    @Test
    public void testVacuum() {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        VacuumCleanerPage vacuumCleanerPage = new VacuumCleanerPage(driver);
        List<String> actualResult = vacuumCleanerPage.getVacuumCleanersList();
        System.out.println(actualResult);
        System.out.println(actualResult.size());

        driver.quit();
    }
}
