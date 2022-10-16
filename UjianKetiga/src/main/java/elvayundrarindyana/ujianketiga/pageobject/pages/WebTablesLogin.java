package elvayundrarindyana.ujianketiga.pageobject.pages;

import elvayundrarindyana.ujianketiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesLogin {
    private WebDriver driver;

    public WebTablesLogin() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "rememberme")
    WebElement rememberme;

    @FindBy(name = "login")
    WebElement login;

    @FindBy(name = "user_login")
    WebElement user_login;

    @FindBy(name = "resetpassword")
    WebElement resetpassword;

    //Page Object
    public void registrationForm(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        rememberme.click();
        login.click();
    }
        public void registrationForm2 (String user_login){
            this.user_login.sendKeys(user_login);
            resetpassword.click();

        }
    }
