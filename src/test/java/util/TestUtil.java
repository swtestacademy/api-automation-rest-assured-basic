package util;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.ArrayList;
import org.testng.Assert;

public class TestUtil {
    //Verify the http response status returned. Check Status Code is 200?
    public void checkStatusIs200(Response res) {
        Assert.assertEquals(res.getStatusCode(), 200, "Status Check Failed!");
    }

    //Get Clients
    public <T> ArrayList<T> getClients(JsonPath jp) {
        return jp.get();
    }
}
