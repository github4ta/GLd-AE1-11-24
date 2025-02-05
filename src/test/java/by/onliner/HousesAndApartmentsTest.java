package by.onliner;

import by.onliner.pages.HousesAndApartmentsPage;
import by.onliner.singleton.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HousesAndApartmentsTest {
    private String actual;

    @Test
    public void testGetSellText() {
        actual = new HousesAndApartmentsPage().open().getSellText();
        Assertions.assertEquals("Продажа", actual);
    }

    @Test
    public void testGetRentText() {
        actual = new HousesAndApartmentsPage().open().getRentText();
        Assertions.assertEquals("Аренда", actual);
    }

    @AfterEach
    public void afterEach() {
        Singleton.quit();
    }


}
