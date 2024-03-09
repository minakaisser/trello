import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.assertEquals;
import POM.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

public class Test1 extends BaseClass {
    String user1="minakaisser83@gmail.com";
    String user2="nashedmina66@gmail.com";
    WebDriver driver;

    @Test
    @Order(4)
    public void grantaccesstouser2() throws InterruptedException {

        HomePage hp = new HomePage();
        hp.navigatetoWebsite();
        hp.enterLogin();
        hp.login(user1);
        ProfilePage pp = new ProfilePage();
        pp.grantAccess();
    }
    @Test
    @Order(3)
    public void userCreateBoard() throws InterruptedException {
        HomePage hp = new HomePage();
        hp.navigatetoWebsite();
        hp.enterLogin();
        hp.login(user1);
        hp.createboard();
    }
    @Test
    @Order(2)
    public void user2SeeInv() throws InterruptedException {
        HomePage hp = new HomePage();
        hp.navigatetoWebsite();
        hp.enterLogin();
        hp.login(user2);
        hp.seeInv();
    }
    @Test
    @Order(1)
    public void deleteboard() throws InterruptedException {
        HomePage hp = new HomePage();
        hp.navigatetoWebsite();
        hp.enterLogin();
        hp.login(user1);
        hp.deleteBoard();
    }
}
