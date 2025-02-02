package by.itacademy.ntaranko;

import org.openqa.selenium.By;

public class HerokuAppLocators {
    public static final By CHECKBOX_A = By.cssSelector("input[type=\"checkbox\"]");
    public static final By BUTTON_REMOVE_ADD = By.cssSelector("[onclick=\"swapCheckbox()\"]");
    public static final By MESSAGE = By.cssSelector("p#message");
    public static final By BUTTON_ENABLE_DISABLE_FIELD = By.cssSelector("button[onclick=\"swapInput()\"]");
    public static final By FIELD_INPUT_TEXT = By.cssSelector("input[type=\"text\"]");
}
