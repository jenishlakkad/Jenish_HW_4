//Q1)

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver=new ChromeDriver();  //Obj of Chrome Driver
        driver.manage().window().maximize();    //Command for maximizing Screen
        driver.get("https://demo.nopcommerce.com/");   // Giving command to drive to go to given URL
        Actions action=new Actions(driver);     //obj to hover mouse
        WebElement element=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[@href=\"/computers\"]"));   //Command to hover mouse on required element
        action.moveToElement(element).build().perform();  //Command to make actions
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));   //Obj to set duration
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/ul[@class=\"sublist first-level\"]/li[1]/a[@href=\"/desktops\"]")));
        //Command to wait 5 sec( if network is slow or low
        WebElement element1=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/ul[@class=\"sublist first-level\"]/li[1]/a[@href=\"/desktops\"]"));
        action.moveToElement(element1);
        action.click().build().perform();
        String regMsg1=driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).getText();  //making variable to store text and Command to get text from website to here
        System.out.println(regMsg1);   //Printing out regMsg1
        String regMsg2=driver.findElement(By.xpath( "//h2[@class=\"product-title\"]/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(regMsg2);   //Printing out regMsg2
        String regMsg3=driver.findElement(By.xpath(  "//h2[@class=\"product-title\"]/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(regMsg3);    //Printing out regMsg3
        driver.quit();    //Command to close browser
    }
}


