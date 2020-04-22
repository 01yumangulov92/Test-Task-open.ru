package Client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;


public class RestClient {
    public static Response requestPOST(String path, JSONObject body){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(body.toString());
        return request.post(path);
    }

    public static Response requestGET(String path) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        return request.get(path);
    }
}
