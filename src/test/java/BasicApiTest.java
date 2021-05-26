import org.testng.annotations.Test;

public class BasicApiTest extends BaseTest{

    @Test
    public void T01_StatusCodeTest() {
        //Verify the http response status returned. Check Status Code is 200?
        res = utils.RestAssuredUtil.getResponse("/gen/clients");
        jp = utils.RestAssuredUtil.getJsonPath(res);
        testUtil.checkStatusIs200(res);
    }

    @Test
    public void T02_GetClients() {
        res = utils.RestAssuredUtil.getResponse("/gen/clients");
        jp = utils.RestAssuredUtil.getJsonPath(res);
        System.out.println(testUtil.getClients(jp));
    }

   @Test
    public void T03_GetAndroidModelPackageOptions() {
       res = utils.RestAssuredUtil.getResponse("/gen/clients/android");
       jp = utils.RestAssuredUtil.getJsonPath(res);
       System.out.println("Opt: " + jp.get("modelPackage.opt"));
       System.out.println("Description: " + jp.get("modelPackage.description"));
       System.out.println("Type: " + jp.get("modelPackage.type"));
   }
}
