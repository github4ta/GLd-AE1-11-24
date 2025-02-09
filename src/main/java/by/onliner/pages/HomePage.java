package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final By LINK_VACANCY = By.xpath("//a[@href='https://blog.onliner.by/vacancy']");

    private WebDriver driver;

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public void clickLinkVacancy() {
        driver.findElement(LINK_VACANCY).click();
    }
}
