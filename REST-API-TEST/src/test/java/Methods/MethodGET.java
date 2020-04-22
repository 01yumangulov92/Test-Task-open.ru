package Methods;

import org.json.JSONObject;
import org.testng.Assert;
import Client.RestClient;

import java.util.Map;

public class MethodGET {

    public void assertNotNull (String endpoint) {
        JSONObject json = new JSONObject(RestClient.requestGET("https://reqres.in/api/" + endpoint).getBody().asString());
        for (Map.Entry<String, Object> entry : json.toMap().entrySet()) {
            Assert.assertNotNull(entry.getValue(), entry.getKey() + " isNull");
        }
        System.out.println(json);
    }
}
