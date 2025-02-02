package by.itacademy;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NotebookPage {
    private final By NOTEBOOK = By.xpath("//div[@class=\"catalog-form__description catalog-form__description_primary catalog-form__description_base-additional catalog-form__description_font-weight_semibold catalog-form__description_condensed-other\"]");
    private WebDriver driver;

    public NotebookPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getListOfNotebook() {
        List<WebElement> notebookList = driver.findElements(NOTEBOOK);
        List<String> result = new ArrayList<>();
        for (WebElement webElement : notebookList){
            result.add(webElement.getText());
        }
        return result;
    }
}
