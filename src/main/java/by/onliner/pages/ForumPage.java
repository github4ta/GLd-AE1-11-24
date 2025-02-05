package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForumPage {
    private final By CLICK_TITLE_FORUM = By.xpath("(//span[@class=\"b-main-navigation__text\"])[7]");
    private final By TEXT_FORUM = By.xpath("//h1[@class='m-title']");

    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForum() {
        driver.findElement(CLICK_TITLE_FORUM).click();
    }

    public String getTextForum(){
        return driver.findElement(TEXT_FORUM).getText();
    }
}
