package by.itacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class NotebookTest {
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://catalog.onliner.by/notebook");
    }

    @Test
    public void getNotebookTextTest(){
        Waits.waitFor(5);
        NotebookPage notebookPage = new NotebookPage(driver);
        List<String> actual = notebookPage.getListOfNotebook();
        System.out.println(actual);
        System.out.println(actual.size());

    }
}
