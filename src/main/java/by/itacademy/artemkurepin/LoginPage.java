package by.itacademy.artemkurepin;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public LoginPage() {
        this.driver=new ChromeDriver();
    }
    public void driverQuit(){
        this.driver.quit();
    }

}
