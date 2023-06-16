package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] agrs) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(10000);
        WebElement Add = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/main/div/div[5]/button"));
        System.out.println(Add.getText());
        Add.click();

        WebElement Cart = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div"));
        System.out.println(Cart.getText());

        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/button"));
        System.out.println(Checkout.getText());
        Checkout.click();
    }
}