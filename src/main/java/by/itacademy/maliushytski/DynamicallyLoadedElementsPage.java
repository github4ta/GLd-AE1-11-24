package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicallyLoadedElementsPage {
    private static final By DYNAMICALLY_LOADED_PAGE_ELEMENTS_PAGE = By.xpath("//h3[text()='Dynamically Loaded Page Elements']");
    private static final By EXAMPLE_ONE = By.xpath("//a[@href='/dynamic_loading/1']");
    private static final By EXAMPLE_TWO = By.xpath("//a[@href='/dynamic_loading/2']");
    private static final By START_BUTTON = By.xpath("//button[text()='Start']");
    private static final By HIDDEN_HELLO_WORLD_TEXT = By.xpath("//h4[.='Hello World!']");
    private static final By LOADING_TEXT = By.xpath("//div[@id='loading']");

    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicallyLoadedElementsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(DYNAMICALLY_LOADED_PAGE_ELEMENTS_PAGE);
    }

    public DynamicallyLoadedElementsPage selectExample(String example) {
        WebElement element;
        switch (example.toLowerCase()) {
            case "example one" -> element = driver.findElement(EXAMPLE_ONE);
            case "example two" -> element = driver.findElement(EXAMPLE_TWO);
            default -> throw new IllegalStateException("Unexpected value: " + example.toLowerCase());
        }
        element.click();
        return this;
    }

    public DynamicallyLoadedElementsPage clickStartButton() {
        WebElement element = driver.findElement(START_BUTTON);
        element.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LOADING_TEXT));
        return this;
    }

    public boolean isHelloWorldVisible() {
        WebElement element = driver.findElement(HIDDEN_HELLO_WORLD_TEXT);
        return element.isDisplayed();
    }
}
