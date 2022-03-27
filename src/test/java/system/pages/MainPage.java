package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.util.concurrent.TimeUnit;

import static system.helpers.PagesURL.FYBECA_MAIN_PAGE;

public class MainPage {

    /*
     Representação
     */
    private WebDriver driver;
    private WebDriverWait wait;

    /*
     Construtor
     */

    public MainPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
        this.driver.manage().window().maximize();
    }

    /*
     Interação
     */

    public MainPage acessar() {
        this.driver.get(FYBECA_MAIN_PAGE);
        return this;
    }


    public String getPLPSubTitle() {
        return this.driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[3]/div/p")).getText();
    }

    public void clickMenu() {
        this.driver.findElement(By.className("header-categories-icon")).click();
    }

    public void categoryChoice() {
        this.driver.findElement(By.cssSelector("#bienestar")).click();
    }

    public void subCategoryChoice(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.findElement(By.cssSelector("#energia_y_vitalidad")).click();
    }

    public void addToCart(){
        this.driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div/div[2]/div[2]/div[3]/div/div/div[4]/div/div[2]/button")).click();
    }

    public void goToCart(){
        this.driver.findElement(By.cssSelector(".btn.btn-outline-secondary.w-100.mr-3")).click();
    }

    public void goToCheckout() {
        this.driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[10]/div/a")).click();
    }

    public void clickToLogin() {
        this.driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/form[1]/button/span")).click();
    }

    public void fazerLogin(String email, String senha) {
        this.driver.findElement(By.id("login-form-email")).sendKeys(email);
        this.driver.findElement(By.id("login-form-password")).sendKeys(senha);
    }

    public String messageAddress() {
        return this.driver.findElement(By.xpath("//*[@id=\"shipmentSelector-default\"]/div[1]/div/div/label/span[2]")).getText();
    }

}
