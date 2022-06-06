package com.cydeo.zafer;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task3 {

    public static void main(String[] args) throws Exception {


        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().findElement(By.xpath("//button")).click();
        Driver.getDriver().findElement(By.xpath("//input[@id='user_login']")).sendKeys(ConfigurationReader.getProperty("username")," ");
        Driver.getDriver().findElement(By.xpath("//input[@id='user_password']")).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();





    }


}
