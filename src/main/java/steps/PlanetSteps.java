package steps;
import io.qameta.allure.Step;
import models.ResponseModel.*;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PlanetSteps {

    @Step("Получить планету по Id")
    public PlanetResponse getPlanetById(int planetId, String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .get("planet-app/planets/" + planetId)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PlanetResponse.class);
    }

    @Step("Получить планеты по Id системы")
    public List<PlanetResponse> getPlanetsBySystemId(int systemId, String accessToken){
        return given()
                .when()
                .header("Authorization: Bearer", accessToken)
                .get("planet-app/systems/" + systemId+ "/planets")
                .then()
                .assertThat().log().all()
                .statusCode(200).extract().response().body().jsonPath().getList("", PlanetResponse.class);
    }


}
