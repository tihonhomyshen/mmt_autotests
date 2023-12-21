package steps;
import io.qameta.allure.Step;
import models.ResponseModel.*;

import static io.restassured.RestAssured.given;

public class InfoSteps {
    @Step("Получить информацию о пользователе по Id")
    public UserResponse getUserInfoById(int personId, String as, String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .get("person-app/people/" + personId + "?as=" + as)
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().as(UserResponse.class);
    }

    @Step("Получить информацию о хранителе")
    public KeeperResponse getKeeperInfo(String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .get("person-app/people/keeper-profile")
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().as(KeeperResponse.class);
    }
    @Step("Получить информацию о исследователе")
    public ExplorerResponse getExplorerInfo(String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .get("person-app/people/explorer-profile")
                .then()
                .assertThat().log().all()
                .statusCode(200)
                .extract().response().body().as(ExplorerResponse.class);
    }
}
