package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaraholkaPage {
    private WebDriver driver;

    private final String BARAHOLKA_TITLE = "//h1[@class='m-title-i']";

    public BaraholkaPage() {
        this.driver = Singleton.getDriver();
    }

    public String getBaraholkaTitleText() {
        return driver.findElement(By.xpath(BARAHOLKA_TITLE)).getText();
    }
}
