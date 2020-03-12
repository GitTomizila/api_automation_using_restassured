package rest_assured_test;

import io.restassured.http.ContentType;
import org.junit.Test;
import org.kohsuke.rngom.digested.DValuePattern;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;


public class RestAssuredTest {

    public void getParticularPost() {
        given().contentType(ContentType.JSON).when().get("https://jsonplaceholder.typicode.com/posts?id=1")
                .then().statusCode(200)
                .body("title", hasItem("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("body", hasItem("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));

    }


    @Test
    public void showingHowToLogARestAssured() {
        given().contentType(ContentType.JSON).log().all()
                .when().get("https://jsonplaceholder.typicode.com/posts?id=1")
                .then().statusCode(200)
                .body("title", hasItem("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("body", hasItem("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"))
                .log().all();

    }


    public void runAPostRequest() {
        HashMap<String, String> postContent = new HashMap<>();
        postContent.put("userId", "234038");
        postContent.put("title", "Leaning API testing with restAssured");
        postContent.put("body", "mi vilda");

        given().contentType(ContentType.JSON)
                .with().body(postContent)
                .when().post("https://jsonplaceholder.typicode.com/posts")
                .then().statusCode(201)
                .body("title", is("Leaning API testing with restAssured"))
                .body("body", is("mi vilda"));
    }
}
