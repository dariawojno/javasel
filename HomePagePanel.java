package org.vistula.selenium.test.praca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePanel {
    public WebDriver driver;

    @FindBy(id = "email");
    private WebElement email;

    @FindBy(id = "password");
    private WebElement password;

    @FindBy(id = "login");
    private WebElement login;

    public HomePagePanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void login (String text) {
        email.sendKeys(text);
        password.sendKeys(text);
        login.click();
    }


}

