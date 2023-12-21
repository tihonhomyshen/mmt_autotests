import models.RequestModel.*;
import models.ResponseModel.LoginResponse;
import org.testng.annotations.Test;

public class InfoTests extends BaseTest{
    @Test(description = "Получить информацию о пользователе по Id")
    public void getUserInfoById(){
        LoginRequest loginRequest = new LoginRequest("user", "user", "KEEPER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        INFO_STEPS.getUserInfoById(6, "keeper", accessToken);
    }
    @Test(description = "Получить информацию о хранителе")
    public void getKeeperInfo(){
        LoginRequest loginRequest = new LoginRequest("user", "user", "KEEPER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        INFO_STEPS.getKeeperInfo(accessToken);
    }

    @Test(description = "Получить информацию о исследователе")
    public void getExplorerInfo(){
        LoginRequest loginRequest = new LoginRequest("user", "user", "EXPLORER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        INFO_STEPS.getExplorerInfo(accessToken);
    }

}
