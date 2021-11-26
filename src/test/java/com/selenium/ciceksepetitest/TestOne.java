package com.selenium.ciceksepetitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestOne {

    public static WebDriver driver;
    public static String url = "https://www.ciceksepeti.com/";

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
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/a/span")).click();
        System.out.println("PopUp Closed");
    }
    @Test(priority = 3)
    public void help() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/a")).click();
        Thread.sleep(1000);
        System.out.println("Help Go Completed");
    }
    @Test(priority = 4)
    public void bestHelpQuestion() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div[4]/a[1]")).click();
        Thread.sleep(1000);
        System.out.println("Best Help Question Go Completed");
    }

    @Test(priority = 5)
    public void productSearch() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"product-search-0\"]/input")).click();
        WebElement txtbx_search = driver.findElement(By.xpath("//*[@id=\"product-search-0\"]/input"));
        txtbx_search.sendKeys("bilgisayar");
        driver.findElement(By.xpath("//*[@id=\"product-search-0\"]/button/span")).click();
        System.out.println("Product Search Completed");
    }
    @Test(priority = 6)
    public void productFilter() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[1]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div[1]/ul/li[1]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div[2]/button")).click();
        Thread.sleep(2000);
        driver.close();
        System.out.println("Product Filter Completed");
    }

}
