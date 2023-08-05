package org.elarnn;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */

public class AppTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        // path to driver Microsoft Edge WebDriver
        System.setProperty("webdriver.edge.driver", ConfProperties.getProperty("edgedriver"));

        // object of driver Microsoft Edge
        driver = new EdgeDriver();
        // object of GitHub login page
        loginPage = new LoginPage(driver);
        // object of GitHub profile page
        profilePage = new ProfilePage(driver);

        // open in full window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // link to the site
        driver.get(ConfProperties.getProperty("loginpage"));

    }
    // method to authentification
    @Test
    public void loginTest() {
        //value login/password takes from file conf.properties
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickLoginButton();

        profilePage.entryMenu();
        // get login
        String user = profilePage.getUserName();
        //and equal it with login from conf file
        Assert.assertEquals(ConfProperties.getProperty("username"), user);
    }
    // method to logout
    @AfterClass
    public static void tearDown() {
        profilePage.userLogout();
        driver.quit();
    }
}
