package POM;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class ProfilePage {
    WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(20));
    public void grantAccess() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li/a/div")));
        BaseClass.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li/a/div")).click();
        Thread.sleep(3000);
        BaseClass.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/div/div/span[2]/button[1]/span[2]")).click();
        Thread.sleep(3000);
        BaseClass.driver.findElement(By.xpath("//*[@id=\"layer-manager-overlay\"]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/input")).sendKeys("nashedmina66");
        Thread.sleep(3000);
        BaseClass.driver.findElement(By.xpath("//*[@id=\"layer-manager-overlay\"]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div")).click();
        Thread.sleep(3000);
        BaseClass.driver.findElement(By.xpath("//*[@id=\"layer-manager-overlay\"]/div/div/div/div/div/div[2]/div[2]/div[1]/button")).click();
        Thread.sleep(3000);
    }
}
