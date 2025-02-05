package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AUTO {
    public final By TEXT_AUTO_FLEA_MARKET = By.xpath("//h1[@class='vehicle-form__title vehicle-form__title_big-alter']");
    WebDriver driver;

    private AUTO(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextAuto (){
        return driver.findElement(TEXT_AUTO_FLEA_MARKET).getText();
    }

}
