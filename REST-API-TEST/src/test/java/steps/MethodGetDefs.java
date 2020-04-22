package steps;

import Methods.MethodGET;
import io.cucumber.java.en.Given;


public class MethodGetDefs {

    MethodGET methodGET = new MethodGET();

    @Given("we are send get request with endpoint - {string} and check it for NotNull")
    public void weAreSendGetRequest(String endpoint) {
        methodGET.assertNotNull(endpoint);
    }
}
