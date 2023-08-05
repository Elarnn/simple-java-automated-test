package org.elarnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;
    // Constructor to initialize field
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div/div[2]/div[4]/deferred-side-panel")
    private WebElement userMenu;

    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div/div[2]/div[4]/deferred-side-panel/user-drawer-side-panel/div/modal-dialog/div[2]/nav/nav-list/ul/li[23]/a/span")
    private WebElement logoutButton;

    @FindBy (xpath = "/html/body/div[1]/div[1]/header/div/div[2]/div[4]/deferred-side-panel/user-drawer-side-panel/div/modal-dialog/div[1]/div/div[1]/div/div[2]/div/span/span")
    private WebElement profileName;
    // method to check is correct username
    public String getUserName() {
        String userName = profileName.getText();
        return userName;
    }
    // click method on profile menu
    public void entryMenu() {
        userMenu.click();
    }
    // click method to logout
    public void userLogout() {
        logoutButton.click();
    }
}
