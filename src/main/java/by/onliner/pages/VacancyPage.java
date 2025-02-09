package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacancyPage {

    private WebDriver driver;

    public VacancyPage() {
        this.driver = Singleton.getDriver();
    }

    private final By TITLE_TEXT_LOCATOR = By.xpath("//h1[text()='Вакансии']");

    public String getTitleText(){
        return driver.findElement(TITLE_TEXT_LOCATOR).getText();
    }
}
