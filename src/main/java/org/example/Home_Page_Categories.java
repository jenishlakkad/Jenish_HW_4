//Q3

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page_Categories {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver=new ChromeDriver();   //Obj of Chrome Driver
        driver.get("https://demo.nopcommerce.com/");   // Giving command to drive to go to given URL
        driver.manage().window().maximize();    //Command for maximizing Screen
        String categorie1=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[@href=\"/computers\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie1);   //Printing out categorie1
        String categorie2=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a[@href=\"/electronics\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie2);    //Printing out categorie2
        String categorie3=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a[@href=\"/apparel\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie3);    //Printing out categorie3
        String categorie4=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]/a[@href=\"/digital-downloads\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie4);     //Printing out categorie4
        String categorie5=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]/a[@href=\"/books\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie5);     //Printing out categorie5
        String categorie6=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]/a[@href=\"/jewelry\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie6);     //Printing out categorie6
        String categorie7=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]/a[@href=\"/gift-cards\"]")).getText();//making variable to store text and Command to get text from website to here
        System.out.println(categorie7);     //Printing out categorie7
        driver.quit();   //Command to close browser
    }
}
