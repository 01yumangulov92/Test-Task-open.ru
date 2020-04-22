package steps;

import Methods.MethodPOST;
import io.cucumber.java.en.Then;
import java.util.Map;

public class MethodPOSTDefs {

    MethodPOST testAPI = new MethodPOST();

    @Then("test api with endpoint - {string}")
    public void testApi(String endpoint, Map<String, String> body) {
        testAPI.matchChecking(endpoint, body);

    }
}
