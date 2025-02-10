import by.onliner.pages.linnik.PageManifesto;
import by.onliner.singleton.Singleton;
import org.junit.jupiter.api.*;

public class TestManifesto {
    @BeforeEach
    public void beforeEach() {
        new PageManifesto().open();
    }

    @Test
    @DisplayName("Checking the beginning of the Manifesto title")
    public void checkText() {
        Assertions.assertEquals("Манифест", new PageManifesto().getTextManifesto());
    }

    @AfterEach
    public void closeSite() {
        Singleton.quit();
    }
}
