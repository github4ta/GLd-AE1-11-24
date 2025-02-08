package by.onliner.pages.linnik;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageManifesto {

    public static By TEXT_MANIFESTO = By.xpath("//h1[text()='Манифест']");

    private WebDriver driver;

    public PageManifesto() {
        this.driver = Singleton.getDriver();
    }

    public String getTextManifesto() {
        return driver.findElement(TEXT_MANIFESTO).getText();
    }
}