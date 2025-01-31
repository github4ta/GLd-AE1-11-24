package by.itacademy.bordiyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VacuumPage {
    private final By VACUUM = new By.ByXPath("//div[@class=\"catalog-form__description catalog-form__description_other catalog-form__description_small catalog-form__description_condensed-other\"]");
    private WebDriver driver;

    public VacuumPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getListVacuums() {
        List<WebElement> vacuumlist = driver.findElements(VACUUM);
        List<String> result = new ArrayList<>();
        for (WebElement webElement : vacuumlist) {
            result.add(webElement.getText());
        }
        return result;
    }
}
