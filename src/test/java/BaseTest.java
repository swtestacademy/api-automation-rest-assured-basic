import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import util.TestUtil;

public class BaseTest {

    public Response res = null; //Response
    public JsonPath jp  = null; //JsonPath

    //Instantiate a Helper Test Methods (testUtils) Object
    TestUtil testUtil = new TestUtil();

    @BeforeClass
    public void setup() {
        //Test Setup
        utils.RestAssuredUtil.setBaseURI(); //Setup Base URI
        utils.RestAssuredUtil.setBasePath("api"); //Setup Base Path
        utils.RestAssuredUtil.setContentType(ContentType.JSON); //Setup Content Type
    }

    @AfterClass
    public void afterTest() {
        //Reset Values
        utils.RestAssuredUtil.resetBaseURI();
        utils.RestAssuredUtil.resetBasePath();
    }
}
