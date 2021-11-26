package com.selenium.ciceksepetitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestTwo {

    public static WebDriver driver;
    public static String url = "https://www.ciceksepeti.com/Arama?c=13173&query=bilgisayar";

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs_fu\\Documents\\Selenium\\ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test(priority = 1)
    public void open() throws InterruptedException {
        //open url
        driver.get(url);
        System.out.println("Open Test Successful");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void closePopUp() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[1]/a/span")).click();
        System.out.println("PopUp Closed");
    }

    @Test(priority = 3)
    public void randomSelect() throws InterruptedException {
        List<WebElement> select = driver.findElements(By.xpath("/html/body/main/div/div[4]"));
        Random rand = new Random();
        int list = rand.nextInt(select.size());
        select.get(list).click();
        Thread.sleep(1000);
        System.out.println("Product Select Completed");
    }

    @Test(priority = 4)
    public void productBasket() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[5]/div[13]/div[5]/button/span")).click();
        System.out.println("Product Basket Completed");
    }

    @Test(priority = 5)
    public void continueShopping() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"shoppingCartForm\"]/div/div/div[2]/a")).click();
        Thread.sleep(1000);
        System.out.println("Continue Shopping Completed");
    }
    @Test(priority = 6)
    public void goBasketAndRemove() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/nav/ul/li[3]/a/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"shoppingCartForm\"]/div/div/div[1]/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"modalBox\"]/div/div/div[3]/button[2]")).click();
        System.out.println("Go Basket And Remove Completed");
        Thread.sleep(2000);
        driver.close();
    }

}
