package elvayundrarindyana.ujianketiga.pageobject;

import elvayundrarindyana.ujianketiga.pageobject.drivers.DriverSingleton;
import elvayundrarindyana.ujianketiga.pageobject.pages.WebTablesLogin;
import elvayundrarindyana.ujianketiga.pageobject.pages.WebTablesRegister;
import elvayundrarindyana.ujianketiga.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
        int detik = 1;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        delay(detik);
        driver.findElement(By.linkText("Dismiss")).click();
        System.out.println("Dismiss");

        delay(detik);
        driver.get("https://shop.demoqa.com/my-account/");
        System.out.println("Register&Login");

        delay(detik);
        js.executeScript("window.scrollBy(0,450)");

        delay(detik);
        WebTablesRegister webTables1 = new WebTablesRegister();
        webTables1.registrationForm("dian", "dian@gmail.com", "qwerty0987654321Elva");
        System.out.println("Register");

        delay(detik);
        WebTablesLogin webTables2 = new WebTablesLogin();
        webTables2.registrationForm("dian", "qwerty0987654321Elva");
        System.out.println("Login");

        //   delay(detik);
        //  driver.findElement(By.linkText("exact:Lost your password?")).click();
        //   System.out.println("Reset Password");

        //  delay(detik);
        //   WebTablesLogin webTables3 = new WebTablesLogin();
        //   webTables3.registrationForm2("yuhuu@gmail.com");
        //    System.out.println("Isi lupa password");

        delay(detik);
        driver.get("https://shop.demoqa.com/product/black-cross-back-maxi-dress/");
        System.out.println("Add Card");

        js.executeScript("window.scrollBy(0,700)");

        delay(detik);
        WebElement elementSelect = driver.findElement(By.id("pa_color"));
        Select pa_color = new Select(elementSelect);
        pa_color.selectByIndex(1);
        delay(detik);
        pa_color.selectByVisibleText("Beige");
        System.out.println("pilih warna");

        delay(detik);
        WebElement elementSelect1 = driver.findElement(By.id("pa_size"));
        Select pa_size = new Select(elementSelect1);
        pa_size.selectByIndex(1);
        delay(detik);
        pa_size.selectByVisibleText("Medium");
        System.out.println("pilih ukuran");

        delay(detik);
        driver.findElement(By.xpath("//div[@id='product-1162']/div/div[2]/form/div/div[2]/div/div/button[2]/i")).click();
        System.out.println("klik +");
        delay(detik);
        driver.findElement(By.xpath("//div[@id='product-1162']/div/div[2]/form/div/div[2]/button")).click();
        System.out.println("tambah 1 product");
        delay(detik);
        driver.findElement(By.xpath("//li[@id='nav-menu-item-cart']/a/span/span[2]/span/bdi")).click();
        System.out.println("Klik add to cart");

        delay(detik);
        driver.get("https://shop.demoqa.com/cart/");
        System.out.println("Mengarahkan ke cart");

        driver.quit();
    }
    static void delay(int detik){
        // delay
        try {
            Thread.sleep(100 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}