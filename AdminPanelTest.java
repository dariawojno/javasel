package org.vistula.selenium.test.praca;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdminPanelTest {
    private WebDriver driver;
    @BeforeClass
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }


    @Test

    public void loginTest() {
        HomePagePanel homePagePanel = new HomePagePanel(driver);
        driver = new ChromeDriver();
        driver.get("http://demo.testarena.pl/zaloguj");
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login"));

        email.sendKeys("administrator@testarena.pl");
        password.sendKeys("sumXQQ72$L");
        login.click();

        WebElement panel = driver.findElement(By.cssSelector(".header_admin"));
        panel.click();
        WebElement addProject = driver.findElement(By.cssSelector("a[href='http://demo.testarena.pl/administration/add_project']"));
        addProject.click();
        WebElement title = driver.findElement(By.cssSelector("#name"));
        String randomTitle = RandomStringUtils.randomAlphabetic(10);
        title.sendKeys(randomTitle);
        title.click();
        WebElement prefix = driver.findElement(By.cssSelector("#prefix"));
        String randomPrefix = RandomStringUtils.randomAlphabetic(10);
        prefix.sendKeys(randomPrefix);
        prefix.click();
        WebElement submit = driver.findElement(By.cssSelector("#save"));
        submit.click();
        WebElement projects = driver.findElement(By.cssSelector(".activeMenu"));
        projects.click();
        WebElement searchProject = driver.findElement(By.cssSelector("#search"));
        searchProject.sendKeys(randomTitle);
        searchProject.click();
        WebElement searchButton = driver.findElement(By.cssSelector("#j_searchButton"));
        searchButton.click();



    }

}

