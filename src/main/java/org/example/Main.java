package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] agrs) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(10000);
        WebElement button = driver.findElement(By.xpath("//a[@class='sc-151bmbx-1 cwLwBP']"));
        System.out.println(button.getText());
        button.click();
    }
}