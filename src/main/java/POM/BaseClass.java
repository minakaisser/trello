package POM;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    static WebDriver driver;
    @Before
    public void startup(){
        BaseClass bc = new BaseClass();
        bc.init();
        driver = bc.getWebDriver();
    }
    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
    public void init(){
        driver = new EdgeDriver();
    }
    public WebDriver getWebDriver()
    {
        return driver;
    }
}
