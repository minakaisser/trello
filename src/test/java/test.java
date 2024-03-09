import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class test {
    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                .cookie("ajs_anonymous_id", "\"5e5dd804-fce4-39a1-3a64-f1ce8476fdf4\"")
                .cookie("dsc", "b386f934e140bef788a0d445a8443933a1abcb69c2e2b04cc9c5fc358ddebfdc")
                .cookie("atl_xid.ts", "1709989388315")
                .cookie("atl_xid.current", "%5B%7B%22type%22%3A%22xc%22%2C%22value%22%3A%22a573a845-206b-4b7b-8b81-618aaeba892c%22%2C%22createdAt%22%3A%222024-03-09T13%3A03%3A08.306Z%22%7D%5D")
                // Add other cookies similarly
                .when()
                .get("https://trello.com/1/members/me/notificationGroups?limit=10&skip=10&read_filter=unread&card_fields=id%2Cbadges%2CcardRole%2CcheckItemStates%2Cclosed%2Ccover%2CdateLastActivity%2Cdesc%2CdescData%2Cdue%2CdueComplete%2CdueReminder%2Cemail%2CidAttachmentCover%2CidBoard%2CidChecklists%2CidLabels%2CidList%2CidMembers%2CidMembersVoted%2CidShort%2CisTemplate%2CmanualCoverAttachment%2Cname%2Cpos%2CshortLink%2CshortUrl%2Cstart%2Csubscribed%2Curl&card_board_fields=id%2Cname%2Cprefs%2Csubscribed%2Curl");

        // Process the response as needed
        System.out.println(response.getBody().asString());
    }
}
