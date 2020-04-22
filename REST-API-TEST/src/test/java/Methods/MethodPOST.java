package Methods;

import org.json.JSONObject;
import org.testng.Assert;
import Client.RestClient;
import java.util.Map;

public class MethodPOST {

    public void matchChecking(String endpoint, Map<String, String> body) {
        JSONObject requestBody = new JSONObject(body);
        JSONObject response = new JSONObject(RestClient.requestPOST("https://reqres.in/api/" + endpoint, requestBody)
                .getBody().asString());
        for (Map.Entry<String, Object> entry : requestBody.toMap().entrySet()) {
            Assert.assertEquals(entry.getValue(), response.get(entry.getKey()));

        }
    }

}


