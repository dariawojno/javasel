package org.vistula.selenium.test.praca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPanelBase {
    protected WebDriver driver;

    @BeforeClass
    public static void setDriver() { WebDriverManager.chromedriver().setup(); }

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://demo.testarena.pl/zaloguj");
    }
    @After
    public void quite(){
        driver.quit();
    }
}
