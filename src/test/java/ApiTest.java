import POM.BaseClass;
import POM.HomePage;
import POM.ProfilePage;
import groovyjarjarantlr4.v4.runtime.atn.SemanticContext;
import io.restassured.matcher.RestAssuredMatchers;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.WebDriver;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ApiTest  {
    String user1="minakaisser83@gmail.com";
    String user2="nashedmina66@gmail.com";
    WebDriver driver;



    @Test
    @Order(2)
    public void userSeeInv() throws InterruptedException {
        given() .cookie("ajs_anonymous_id", "\"5e5dd804-fce4-39a1-3a64-f1ce8476fdf4\"")
                .cookie("dsc", "b386f934e140bef788a0d445a8443933a1abcb69c2e2b04cc9c5fc358ddebfdc")
                .cookie("atl_xid.ts", "1709989388315")
                .cookie("atl_xid.current", "%5B%7B%22type%22%3A%22xc%22%2C%22value%22%3A%22a573a845-206b-4b7b-8b81-618aaeba892c%22%2C%22createdAt%22%3A%222024-03-09T13%3A03%3A08.306Z%22%7D%5D")
                .header("accept", "*/*")
                .contentType("application/json").pathParam("limit", "10").pathParam("skip", "10");
        when().get("https://trello.com/1/members/me/notificationGroups").then().log().body().assertThat().statusCode(200);
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
