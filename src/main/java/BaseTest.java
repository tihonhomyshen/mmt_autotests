import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import steps.Steps;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class BaseTest implements Steps{

    @BeforeMethod
    public void configureRestAssured()
    {
        RestAssured.baseURI = "http://localhost:4401/api/v1/";
        RestAssured.requestSpecification = given()
                .contentType(ContentType.JSON);
    }

}