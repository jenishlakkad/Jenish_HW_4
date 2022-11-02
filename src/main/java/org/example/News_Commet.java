//Q2

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;


public class News_Commet {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver =new ChromeDriver();
        //Obj of Chrome Driver
        String timeStamp=new SimpleDateFormat("ddHHmmss").format(new java.util.Date());   //Storing Obj(of Date Formate) in Variable(String)

        driver.get("https://demo.nopcommerce.com/");   // Giving command to drive to go to given URL
        driver.manage().window().maximize();    //Command for maximizing Screen
//        JavascriptExecutor js = (JavascriptExecutor) driver;   //Obj to call an inbuild class(JavascriptExecutor) :- for hovering mouse
//        js.executeScript("window.scrollBy(0,1570)", "");  //Command to how much scroll down
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/a[@href=\"/nopcommerce-new-release\"]")).click();  //Command to Click on Details button
        driver.findElement(By.className("enter-comment-title")).sendKeys("News"+timeStamp);  // Command to write text on 'Title' field and also concatenating timeStamp(variable) to aad Change in text field
        driver.findElement(By.className("enter-comment-text")).sendKeys("Today is a Beautiful day");    //Command to write text on 'Comment' field
        driver.findElement(By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]")).click();   //Command to click on 'New Comment'(button)
        String news=driver.findElement(By.className("result")).getText();   //making variable to store text and Command to get text from website to here
        System.out.println(news);   // Printing out above variable
        driver.quit();  //Command to quit browser

    }
}
