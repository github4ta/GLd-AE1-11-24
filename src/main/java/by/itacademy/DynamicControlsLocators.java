package by.itacademy;

import org.openqa.selenium.By;

public class DynamicControlsLocators {
    public static final By BUTTON_REMOVE = By.xpath("//button[@onclick=\"swapCheckbox()\"]");
    public static final By BUTTON_ADD = By.xpath("//button[@onclick=\"swapCheckbox()\"]");
    public static final By BUTTON_ENABLE = By.xpath("//button[@onclick=\"swapInput()\"]");
    public static final By BUTTON_DISABLE = By.xpath("//button[@onclick=\"swapInput()\"]");
    public static final By BUTTON_START = By.xpath("//button[text()=\"Start\"]");
    public static final By IT_S_GONE = By.xpath("//p[@id=\"message\"]");
    public static final By IT_S_BACK = By.xpath("//p[@id=\"message\"]");
    public static final By IT_S_ENABLED = By.xpath("//p[@id=\"message\"]");
    public static final By IT_S_DISABLED = By.xpath("//p[@id=\"message\"]");
}
