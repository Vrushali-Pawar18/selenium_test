package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver","C:\\Users\\Windows 10\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");


// Disable noisy logs from the WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://mitwpu.pod.ai/");

        Thread.sleep(10000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("1032190750@mitwpu.edu.in");

        String str = "#page-container > div > div > div > div.login-page__container.login-page__container--translate-mobile.js-login-form > div > div.user-form-container.clearfix > form > div.w-100.app-input-wrapper.relative.ng-pristine.ng-untouched.ng-valid.ng-isolate-scope.ng-empty > input";
        driver.findElement(By.cssSelector(str)).sendKeys("Vrushali@18");

        String str1 = "#page-container > div > div > div > div.login-page__container.login-page__container--translate-mobile.js-login-form > div > div.user-form-container.clearfix > form > button";
        driver.findElement(By.cssSelector(str1)).click();

    }
}