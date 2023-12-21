import models.RequestModel.*;
import org.testng.annotations.Test;

public class PlanetTests extends BaseTest{

    @Test(description = "Получить планету по Id")
    public void getPlanetById(){
        LoginRequest loginRequest = new LoginRequest("user", "user", "KEEPER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        PLANET_STEPS.getPlanetById(1, accessToken);
    }

    @Test(description = "Получить планеты по Id системы")
    public void getPlanetsBySystemId(){
        LoginRequest loginRequest = new LoginRequest("user", "user", "KEEPER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        PLANET_STEPS.getPlanetsBySystemId(1, accessToken);
    }


}
