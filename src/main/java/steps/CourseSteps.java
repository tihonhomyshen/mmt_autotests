package steps;

import io.qameta.allure.Step;
import models.RequestModel.CourseRequest;
import models.ResponseModel.*;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CourseSteps {
    @Step("Подать заявку на обучение")
    public CourseResponse educationRequest(String accessToken, CourseRequest courseRequest){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .body(courseRequest)
                .post("course-registration-app/course-requests")
                .then()
                .assertThat().log().all()
                .statusCode(201)
                .extract().response().body().as(CourseResponse.class);
    }

    @Step("Отклонить заявку на обучение")
    public RejectEducationResponse rejectEducationRequest(int requestId, String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .delete("course-registration-app/course-requests/" + requestId)
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().as(RejectEducationResponse.class);
    }

    @Step("Принять заявку на обучение")
    public ApproveResponse approveEducation(int requestId, String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .patch("course-registration-app/course-requests/" + requestId)
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().as(ApproveResponse.class);
    }

    @Step("Принятые заявки на обучение")
    public List<ApproveResponse> approveRequestsEducation(ArrayList<Integer> keepersIds, String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .patch("course-registration-app/course-requests/approved?keeperIds=" + keepersIds)
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().jsonPath().getList("", ApproveResponse.class);
    }






}
