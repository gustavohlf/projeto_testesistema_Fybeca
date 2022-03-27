package system;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;
import java.util.concurrent.TimeUnit;


class Fybeca {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void before() {
        driver = DriverManager.getDriver();
        wait = DriverManager.getDriverWait();
        driver.manage().window().maximize();
    }

    @AfterEach
    void after() {
        DriverManager.quitDriver();
    }

    @Disabled("...")
    @Test
    void projeto() throws InterruptedException {
        System.out.println("***** PROJETO *****");

        driver.get("https://www.fybeca.com/");

        WebElement clickMenu = driver.findElement(By.className("header-categories-icon"));
        clickMenu.click();

        WebElement categoryChoice = driver.findElement(By.cssSelector("#bienestar"));
        categoryChoice.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement subCategoryChoice = driver.findElement(By.cssSelector("#energia_y_vitalidad"));
        subCategoryChoice.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String mensagemPLP = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[3]/div/p")).getText();
        //System.out.println(mensagemPLP);
        Assert.assertEquals(mensagemPLP,"Encuentra nuestra variedad de productos que mejorarán tu energía y vitalidad");

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div/div[2]/div[2]/div[3]/div/div/div[4]/div/div[2]/button"));
        addToCart.click();

        WebElement goToCart = driver.findElement(By.cssSelector(".btn.btn-outline-secondary.w-100.mr-3"));
        goToCart.click();

        WebElement goToCheckout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[10]/div/a"));
        goToCheckout.click();

        driver.findElement(By.id("login-form-email")).sendKeys("jepysy@boximail.com");
        driver.findElement(By.id("login-form-password")).sendKeys("Abcd1234!");

        WebElement clickToLogin = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/form[1]/button/span"));
        clickToLogin.click();

        String messageAddress = driver.findElement(By.xpath("//*[@id=\"shipmentSelector-default\"]/div[1]/div/div/label/span[2]")).getText();
        //System.out.println(messageAddress);
        Assert.assertEquals(messageAddress,"Noruega 156, Quito, Pichincha EC");

        }
    }
