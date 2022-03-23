package com.utkproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class loginOnOneview {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.setProperty("webdriver.chrome.driver","F:\\chromewebdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/account/login?ret=%2Fwishlist");
//        driver.findElement(By.id("txtRollNo")).sendKeys("1901270100059");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("7007663578");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("rytnix1510");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[4]/button")).click();

    }
}
