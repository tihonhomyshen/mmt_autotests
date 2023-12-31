import models.RequestModel.*;
import models.ResponseModel.LoginResponse;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class CourseTests extends BaseTest{

    @Test(description = "Подать заявку на обучение", priority = 1)
    public void educationRequest(){
        LoginRequest loginRequest = new LoginRequest("user2", "user2", "EXPLORER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        ArrayList<Integer> keepersId = new ArrayList<>();
        keepersId.add(11);
        CourseRequest courseRequest = new CourseRequest(1, keepersId);
        COURSE_STEPS.educationRequest(accessToken, courseRequest);
    }

    @Test(description = "Отклонить заявку на обучение", priority = 2)
    public void rejectEducationRequest(){
        LoginRequest loginRequest = new LoginRequest("user3", "user3", "EXPLORER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        ArrayList<Integer> keeperIds = new ArrayList<>();
        keeperIds.add(11);
        CourseRequest courseRequest = new CourseRequest(1, keeperIds);
        int lastRequestId = COURSE_STEPS.educationRequest(accessToken, courseRequest).getRequestId();
        AUTH_STEPS.logout();
        LoginRequest loginRequest1 = new LoginRequest("user", "user", "KEEPER");
        String accessToken1 = AUTH_STEPS.login(loginRequest1).getAccessToken();
        COURSE_STEPS.rejectEducationRequest(lastRequestId, accessToken1, new RejectRequest(1));
    }

    @Test(description = "Принять заявку на обучение", priority = 3)
    public void approveEducationRequest(){
        LoginRequest loginRequest = new LoginRequest("user4", "user4", "EXPLORER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        ArrayList<Integer> keeperIds = new ArrayList<>();
        keeperIds.add(11);
        CourseRequest courseRequest = new CourseRequest(1, keeperIds);
        int lastRequestId = COURSE_STEPS.educationRequest(accessToken, courseRequest).getRequestId();
        AUTH_STEPS.logout();
        LoginRequest loginRequest1 = new LoginRequest("user", "user", "KEEPER");
        String accessToken1 = AUTH_STEPS.login(loginRequest1).getAccessToken();
        COURSE_STEPS.approveEducation(lastRequestId, accessToken1);
    }

    @Test(description = "Принятые заявки на обучение", priority = 4)
    public void approveEducationRequests(){
        LoginRequest loginRequest = new LoginRequest("user", "user", "KEEPER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        List<Integer> keepersIds = new ArrayList<>();
        keepersIds.add(12);
        COURSE_STEPS.approveRequestsEducation(keepersIds, accessToken);
    }
    @Test(description = "Получить причины отклонения заявки", priority = 4)
    public void rejectReasonsRequests(){
        LoginRequest loginRequest = new LoginRequest("user2", "user2", "KEEPER");
        String accessToken = AUTH_STEPS.login(loginRequest).getAccessToken();
        COURSE_STEPS.rejectEducationReasons(accessToken);
    }
}
