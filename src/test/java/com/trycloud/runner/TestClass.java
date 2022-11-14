//package com.trycloud.runner;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.experimental.theories.Theories;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestClass {
//    public static void main(String[] args) throws InterruptedException {
//
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://qa2.trycloud.net/index.php/login");
//        WebElement email = driver.findElement(By.id("user"));
//        email.sendKeys("User7");
//        WebElement pass = driver.findElement(By.id("password"));
//        pass.sendKeys("Userpass123");
//        driver.findElement(By.id("submit-form")).click();
//
//        Thread.sleep(8000);
//        List moduleNames = new ArrayList();
//        List<WebElement > elements = driver.findElements(By.xpath("//ul[@id='appmenu']//a"));
//        for (WebElement element:elements) {
//            //System.out.println("text "+ element.getAttribute("aria-label"));
//            moduleNames.add(element.getAttribute("aria-label"));
//        }
//
//
//        System.out.println(moduleNames);
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
