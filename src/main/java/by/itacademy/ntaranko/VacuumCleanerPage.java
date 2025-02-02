package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VacuumCleanerPage {
    private final By VACUUM_CLEANER = By.xpath("//div[@class=\"catalog-form__description catalog-form__description_primary catalog-form__description_base-additional catalog-form__description_font-weight_semibold catalog-form__description_condensed-other\"]");
    private WebDriver driver;

    public VacuumCleanerPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getVacuumCleanersList() {
        List<WebElement> vacuumCleanerList = driver.findElements(VACUUM_CLEANER);
        List<String> resultList = new ArrayList<>();
        for (WebElement element : vacuumCleanerList) {
            resultList.add(element.getText());
        }

        return resultList;
    }
}
