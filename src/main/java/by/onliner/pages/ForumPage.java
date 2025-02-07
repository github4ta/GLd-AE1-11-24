package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForumPage {
    private final By CLICK_TITLE_FORUM = By.xpath("(//span[@class=\"b-main-navigation__text\"])[7]");
        private WebDriver driver;

    public ForumPage() {
        this.driver = Singleton.getDriver();
    }

    public void clickForum() {
        driver.findElement(CLICK_TITLE_FORUM).click();
    }

        public void open(){
        driver.get("https://www.onliner.by/");
    }
}
