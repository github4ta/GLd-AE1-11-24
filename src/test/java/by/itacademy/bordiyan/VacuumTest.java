package by.itacademy.bordiyan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VacuumTest {
    private String url = "http://catalog.onliner.by/vacuumcleaner";
    
    public void testVacuumtest(){
    WebDriver driver = new ChromeDriver();
       driver.get(url);
       VacuumPage vacuumPage = new VacuumPage(driver);
        List<String> actual = vacuumPage.getListVacuums();
        System.out.println(actual);
    }
}
