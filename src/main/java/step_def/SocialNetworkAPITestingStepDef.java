package step_def;

import com.jayway.jsonpath.DocumentContext;
import cucumber.api.java8.En;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.response.Response;
import utilities.RequestBodyService;

import java.net.MalformedURLException;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SocialNetworkAPITestingStepDef extends BaseStep implements En {
    Response responseForGetComment;
    Response responseForGetServiceURL;
    Response responseForPostCommentRequest;
    Response responseForGetPostRequest;
    Response responseForPostRequest;
    DocumentContext requestBody;
    RequestBodyService requestBodyService;




    public SocialNetworkAPITestingStepDef() {



        Given("^Service is up and running$", () -> {
            setHeadersWithContentType();
            setEndpointPath(ServiceURL);
            try {
                getCall();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            responseForGetServiceURL = getResponse();
            assertThat(responseForGetServiceURL.statusCode(), is (200));
        });

        When("^I search for \"([^\"]*)\" of a post with a GET method$", (String id) -> {
            setHeadersWithContentType();
            setEndpointPath(MakePostEndpoint +"?id="+id);
            try {
                getCall();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            responseForGetPostRequest = getResponse();

        });
        Then("^I should get the correct \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" returned$", (String id, String title, String body) -> {
            assertThat("validate id", responseForGetPostRequest.body().jsonPath().get("id").toString().contains(id), is(true));
            assertThat("validate title", responseForGetPostRequest.body().jsonPath().get("title"), hasItem(title));
            assertThat("validate body", responseForGetPostRequest.body().jsonPath().get("body"), hasItem(body));
        });
//        When("^I search for comment with \"([^\"]*)\" with GET request$", (String id) -> {
//
//            setHeadersWithContentType();
//            setEndpointPath(MakeCommentEndpoint +id);
//            try {
//                getCall();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            responseForGetComment = getResponse();
//        });
//        Then("^The correct \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are returned$", (String id, String name, String email, String body) -> {
//            assertThat("Validate id", responseForGetComment.body().jsonPath().get("id").toString().contains(id), is(true));
//            assertThat("Validate name", responseForGetComment.body().jsonPath().get("name"), hasItem(name));
//            assertThat("Validate email", responseForGetComment.body().jsonPath().get("email"), hasItem(email));
//            assertThat("Validate body", responseForGetComment.body().jsonPath().get("body"), hasItem(body));
//        });
        And("^status code of (\\d+) is returned$", (Integer arg0) -> {
            assertThat(responseForGetPostRequest.statusCode(), is(200));
        });
        When("^I create a new post with the following details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$", (String uId, String title, String body) -> {
            requestBodyService = new RequestBodyService();
//            setHeadersWithContentType();
            requestBody = loadJsonTemplate(MakePostPayLoad);
            requestBodyService.SetRequestForPostBody(requestBody, uId, title, body);
            setEndpointPath(MakePostEndpoint);
            try {
                getPostCall();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            responseForPostRequest = getResponse();
        });

        And("^status code of (\\d+) is returned for created post$", (Integer aCode) -> {
            assertThat(responseForPostRequest.statusCode(), is(aCode) );
        });
        Then("^I should ge the correct \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" returned for post request$", (String uId, String title, String body) -> {
            assertThat("Validate userId", responseForPostRequest.body().jsonPath().get("userId").toString().contains(uId), is(true));
            assertThat("Validate title", responseForPostRequest.body().jsonPath().get("title"), is(equalTo(title)));
            assertThat("Validate body", responseForPostRequest.body().jsonPath().get("body"), is(equalTo(body)));
        });


        When("^I create a new comment with the following details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\",$", (String postId, String name, String email, String body) -> {
            requestBodyService = new RequestBodyService();
//            setHeadersWithContentType();
            requestBody = loadJsonTemplate(MakeCommentLocation);
            requestBodyService.SetRequestForComment(requestBody, postId, name, email, body);
            setEndpointPath(MakeCommentEndpoint);
            try {
                getPostCall();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            responseForPostCommentRequest = getResponse();
        });
        Then("^The correct \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are returned$", (String postId, String name, String email, String body) -> {
            assertThat("Validate postId", responseForPostCommentRequest.body().jsonPath().get("postId"), is(postId));
            assertThat("Validate name", responseForPostCommentRequest.body().jsonPath().get("name"), is(equalTo(name)));
            assertThat("Validate email", responseForPostCommentRequest.body().jsonPath().get("email"), is(equalTo(email)));
            assertThat("Validate body", responseForPostCommentRequest.body().jsonPath().get("body"), is(equalTo(body)));
        });
        And("^status code of (\\d+) is returned for successful comment post$", (Integer aCode) -> {
            assertThat(responseForPostCommentRequest.statusCode(), is(aCode));
        });


    }
}
