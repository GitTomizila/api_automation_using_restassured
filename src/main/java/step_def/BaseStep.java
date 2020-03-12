package step_def;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


import java.net.MalformedURLException;
import java.net.URL;

public class BaseStep {

    String ServiceURL;
    String MakePostEndpoint;
     String MakeCommentEndpoint;
     String CreateUserEndpoint;
     public String MakePostPayLoad;
    public String MakeCommentLocation;
     public Headers headers;
    private Response response;
   private String endpointPath;
    public DocumentContext requestBodyJson;

    public BaseStep() {

        //endpoints
        ServiceURL = "https://jsonplaceholder.typicode.com";
        MakePostEndpoint = ServiceURL + "/posts/";
        MakeCommentEndpoint = ServiceURL + "/comments/";
        CreateUserEndpoint = ServiceURL + "/users?id=";

        //path

        MakePostPayLoad = "/templates/MakeAPostTem.json";
        MakeCommentLocation = "/templates/MakeACommentTemplate.json";

    }



        public void setHeaders(Headers value) {
            resetHeaders();
            headers = value;
        }
        public void resetHeaders(){
            headers = null;
        }

        public void setHeadersWithContentType(){
        headers = new Headers(
                new Header("Content-Type", "application/json"));
        setHeaders(headers);
        }

        public Response getCall() throws MalformedURLException {
        response = RestAssured.given().log().all()
                .relaxedHTTPSValidation()
                .headers(headers)
                .when()
                .get(getURL())
                .then()
                .log().all()
                .extract()
                .response();

                return response;
        }
    public Response getPostCall() throws MalformedURLException {
        response = RestAssured.given().log().all()
                .relaxedHTTPSValidation()
                .headers(headers)
                .body(requestBodyJson.jsonString())
                .when()
                .post(getURL())
                .then()
                .log().all()
                .extract()
                .response();

        return response;
    }

    private URL getURL() throws MalformedURLException {

        return new URL(endpointPath);
    }

    public void setEndpointPath(String endpointPath){
        this.endpointPath = endpointPath;
    }

    public Response getResponse(){
        return response;
    }

    public DocumentContext loadJsonTemplate(String path){
         requestBodyJson = JsonPath.parse(this.getClass().getResourceAsStream(path));
         return requestBodyJson;
    }

}
