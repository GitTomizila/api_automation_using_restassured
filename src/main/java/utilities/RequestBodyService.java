package utilities;

import com.jayway.jsonpath.DocumentContext;
import step_def.BaseStep;

public class RequestBodyService extends BaseStep {

    public void SetRequestForPostBody(DocumentContext requestBody, String uId, String title, String body){
        requestBody.set("userId", uId);
        requestBody.set("title", title);
        requestBody.set("body", body);
    }

    public void SetRequestForComment(DocumentContext requestBody, String postId, String name, String email, String body){
        requestBody.set("postId ", postId);
        requestBody.set("name", name);
        requestBody.set("email", email);
        requestBody.set("body", body);
    }
}
