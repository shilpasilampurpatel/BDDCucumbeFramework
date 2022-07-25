//package stepDefinitions;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.junit.Assert;
//import java.net.URI;
//import java.net.URISyntaxException;
//
//public class GETAPIRestassured {
//
//    private final String Base_URL="";
//    private Response response;
//    private Scenario scenario;
//
//    @Before
//    public void before(Scenario scenario)
//    {
//        this.scenario=scenario;
//    }
//
//    @Given("Get call to {String}")
//    public void getcalltourl(String url) throws URISyntaxException {
//        RestAssured.baseURI=Base_URL;
//        RequestSpecification requestSpecification=RestAssured.given();
//        response=requestSpecification.when().get(new URI(url));
//    }
//
//    @Then("Response is {String}")
//    public void resposeIsStatuscode(String Statuscode) {
//        int actualresponsecode=response.then().extract().statusCode();
//        Assert.assertEquals(Statuscode,actualresponsecode);
//    }
//}
//
