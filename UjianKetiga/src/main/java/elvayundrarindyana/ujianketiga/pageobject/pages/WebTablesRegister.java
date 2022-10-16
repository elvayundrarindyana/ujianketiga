package elvayundrarindyana.ujianketiga.pageobject.pages;

import elvayundrarindyana.ujianketiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesRegister {

        private WebDriver driver;

        public WebTablesRegister() {
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(id = "reg_username")
        WebElement reg_username;

        @FindBy(id = "reg_email")
        WebElement reg_email;

        @FindBy(id = "reg_password")
        WebElement reg_password;

        @FindBy(name = "register")
        WebElement register;

        //Page Object
        public void registrationForm(String reg_username, String reg_email, String reg_password){
            this.reg_username.sendKeys(reg_username);
            this.reg_email.sendKeys(reg_email);
            this.reg_password.sendKeys(reg_password);
            register.click();
        }
    }