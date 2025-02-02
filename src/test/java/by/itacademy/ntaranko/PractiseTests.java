package by.itacademy.ntaranko;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseTests {
    WebDriver driver = new ChromeDriver();


    @Test
    public void practiceAction1() {
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WebElement gender = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[1]"));
        new Actions(driver).moveToElement(gender, 55, 0).click().perform();

        driver.quit();
    }

    @Test
    public void practiceAction2() {
        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        new Actions(driver).moveToElement(searchField).click()
                .sendKeys("adidas").sendKeys(Keys.ENTER).perform();

        driver.quit();
    }
}
