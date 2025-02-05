package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorialСontacts {
    private final By HEADING_TEXT = By.xpath("//h1[text()='Контакты редакции. Манифест. Спецпроекты. Правила использования материалов']");

        private WebDriver driver;

    public EditorialСontacts() {
        this.driver = Singleton.getDriver();
    }

    public String getHeadingText(){
        return driver.findElement(HEADING_TEXT).getText();
    }
}
