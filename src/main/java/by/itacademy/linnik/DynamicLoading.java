package by.itacademy.linnik;

import org.openqa.selenium.WebDriver;

public class DynamicLoading {
   private WebDriver driver;

    public DynamicLoading(WebDriver driver) {
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(Locators.BUTTON_START).click();
    }
    public String helloWorld (){
        return driver.findElement(Locators.HELLO_WORLD).getText();
    }
    public void clickStart2(){
        driver.findElement(Locators.BUTTON_START2).click();
    }
    public String helloWorld2(){
        return driver.findElement(Locators.HELLO_WORLD2).getText();
    }
}

