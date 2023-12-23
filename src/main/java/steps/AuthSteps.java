package steps;

import io.qameta.allure.Step;
import models.RequestModel.LoginRequest;
import models.ResponseModel.LoginResponse;
import models.ResponseModel.LogoutResponse;
import models.ResponseModel.RejectEducationResponse;

import static io.restassured.RestAssured.given;

public class AuthSteps {
    @Step("Логин")
    public LoginResponse login(LoginRequest loginRequest){
        return given()
                .when()
                .body(loginRequest)
                .post("auth/login")
                .then()
                .assertThat().log().all()
                .statusCode(200).extract().response().body().jsonPath().getObject("accessToken", LoginResponse.class);
    }

    @Step("Выход")
    public LogoutResponse logout(){
        return given()
                .when()
                .body("string")
                .post("auth/logout")
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().as(LogoutResponse.class);
    }
}
