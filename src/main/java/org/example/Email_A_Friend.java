//Q:=4

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_A_Friend {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver=new ChromeDriver();     //Obj of Chrome Driver
        driver.get("https://demo.nopcommerce.com/");    // Giving command to drive to go to given URL
        driver.manage().window().maximize();     //Command for maximizing Screen
        driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000024_apple-macbook-pro-13-inch_415.jpeg\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;   //Obj to call an inbuild class(JavascriptExecutor) :- for hovering mouse
        js.executeScript("window.scrollBy(0,370)", "");
        driver.findElement(By.xpath("//button[@class='button-2 email-a-friend-button']")).click();  //Command to Click on 'email a friend ' button
        driver.findElement(By.id("FriendEmail")).sendKeys("black@gmail.com");  //Command to write text in 'friendEmail' area
        driver.findElement(By.id("YourEmailAddress")).sendKeys("white@gmail.com");  //Command to write text in 'your Email Address area
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hello Everyone");    //Command to write text in personal message area
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/button[@type=\"submit\"]")).click();  //Command to Click on 'submit' button
        String email=driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul[1]/li[1]")).getText();
        System.out.print("Message:= ");  //To print out 'message:='
        System.out.println(email);       // To print out text form website
        driver.quit();         //Command to close browser



    }
}
