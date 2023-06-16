package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] agrs) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(10000);


        WebElement XS = driver.findElement(By.xpath("//span[@class='checkmark']"));
        System.out.println(XS.getText());
        XS.click();
        WebElement Star = driver.findElement(By.xpath("//a[@class='github-button']"));
        System.out.println(Star.getText());
        Star.click();

        driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(10000);
        WebElement addcard= driver.findElement(By.xpath("//div[@class='sc-124al1g-2 dwOYCh']//button[@class='sc-124al1g-0 jCsgpZ']"));
        System.out.println(addcard);
        addcard.click();
        WebElement Freeship= driver.findElement(By.xpath("//div[@class='sc-124al1g-3 bHJSNa']"));
        System.out.println(Freeship);
        WebElement nameproduct= driver.findElement(By.xpath("//p[@class='sc-124al1g-4 eeXMBo']"));
        System.out.println(nameproduct);
        WebElement pricep= driver.findElement(By.xpath("//div[@class='sc-124al1g-5 fTQxRg']"));
        System.out.println(pricep);

        driver = new ChromeDriver();
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