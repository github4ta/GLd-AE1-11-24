package by.itacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
    }

    @Test
    @DisplayName("Click M")
    public void testClick(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickGenderM();
        Waits.waitFor(4);
    }

    @Test
    @DisplayName("Click F")
    public void testClick1(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickGenderF();
        Waits.waitFor(4);
    }

    @Test
    @DisplayName("Click calculate")
    public void testClick2(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickCalculate();
        Waits.waitFor(4);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
