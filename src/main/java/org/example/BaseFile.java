package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BaseFile {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver=new ChromeDriver();    //Obj of Chrome Driver
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());  //Storing Obj(of Date Formate) in Variable(String)
        System.out.println(timeStamp);   //Print out timeStamp

        driver.manage().window().maximize();  //Command for maximizing Screen
        driver.get("https://demo.nopcommerce.com/");   // Giving command to drive to go to given URL
        driver.findElement(By.className("ico-register")).click();    // Command to click on button
        driver.findElement(By.id("FirstName")).sendKeys("Jenish");  // Command to write "my name"
        driver.findElement(By.id("LastName")).sendKeys("Lakkad");   // Command to write "my last name"
        driver.findElement(By.id("Email")).sendKeys("jenish"+timeStamp+"@gmail.com");   // Command to write "email ID"
        driver.findElement(By.id("Company")).sendKeys("Lakkad & Son's");   // Command to write "Company name"
        driver.findElement(By.id("Password")).sendKeys("Jenish123");   // Command to write "password"
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Jenish123");   // Command to write "confirm password"
        driver.findElement(By.id("register-button")).click();   //Command to click on "Register button" button

        String regMsg=driver.findElement(By.className("result")).getText();  //Command to get text from website
        System.out.println(regMsg);  //Print out above text
        driver.quit();  //Command to quit browser
    }

}
