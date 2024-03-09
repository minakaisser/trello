package POM;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HomePage {
Actions act = new Actions(BaseClass.driver);
public void navigatetoWebsite()
 {
     BaseClass.driver.get("https://trello.com/");
     BaseClass.driver.manage().window().maximize();
 }
 public void enterLogin() throws InterruptedException {
     BaseClass.driver.findElement(By.xpath("//*[@id=\"BXP-APP\"]/header[1]/div/div[1]/div[2]/a[1]")).click();
     Thread.sleep(3000);
 }
 public void login(String user) throws InterruptedException {
    BaseClass.driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(user);
     Thread.sleep(3000);
     BaseClass.driver.findElement(By.xpath("//*[@id=\"login-submit\"]/span")).click();
     Thread.sleep(3000);
     BaseClass.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mina2023");
     Thread.sleep(3000);
     BaseClass.driver.findElement(By.xpath("//*[@id=\"login-submit\"]/span")).click();
     Thread.sleep(3000);
 }
 public void createboard() throws InterruptedException {
     BaseClass.driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[3]/button/span/span")).click();
     Thread.sleep(2000);
     BaseClass.driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div/nav/ul/li[1]/button/p")).click();
     Thread.sleep(2000);
     BaseClass.driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/div[1]/label/input")).sendKeys("TestBoard");
     Thread.sleep(2000);
     BaseClass.driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/button")).click();
     Thread.sleep(2000);
 }
     public void seeInv() throws InterruptedException {
         Thread.sleep(3000);
     BaseClass.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div/button")).click();
     Thread.sleep(3000);
     }
     public void deleteBoard() throws InterruptedException {
    Thread.sleep(3000);
    BaseClass.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li[1]")).click();
         Thread.sleep(3000);
         WebElement e = BaseClass.driver.findElement(By.xpath("//*[@id=\"popover-boundary\"]/div/nav/div[1]/div/div/div[2]/div/div[3]/ul/div[2]/li/a\n"));
         act.moveToElement(e).perform();
         BaseClass.driver.findElement(By.xpath("//*[@id=\"popover-boundary\"]/div/nav/div[1]/div/div/div[2]/div/div[3]/ul/div[2]/li/div[2]/div[1]/button")).click();
         Thread.sleep(6000);
        BaseClass.driver.findElement(By.xpath("/html/body/div[6]/div/section/div/div")).click();
        Thread.sleep(3000);
         BaseClass.driver.findElement(By.xpath("/html/body/div[6]/div/section/div/button")).click();
         Thread.sleep(3000);

     }
 }