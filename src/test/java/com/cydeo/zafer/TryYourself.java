package com.cydeo.zafer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TryYourself {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.definehediye.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //System.out.println("driver.getPageSource() = " + driver.getPageSource());
        //System.out.println("driver.findElement(By.linkText(\"Yeni Kayıt\")) = " + driver.findElement(By.linkText("Yeni Kayıt")).getText());
        WebElement newUser = driver.findElement(By.linkText("Yeni Kayıt"));
        System.out.println("newUser.isDisplayed() = " + newUser.isDisplayed());
        System.out.println("zafer");


    }
}
