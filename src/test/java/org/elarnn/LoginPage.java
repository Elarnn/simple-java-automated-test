package org.elarnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
// Constructor to initialize field
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy (xpath = "//*[@id=\"login_field\"]")
    private WebElement loginField;

    @FindBy (xpath = "//*[@id=\"login\"]/div[4]/form/div/input[13]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    // input method  login in login field
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }
    // input method password in password field
    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }
    // click method on login button
    public void clickLoginButton() {
        loginButton.click();
    }
}
