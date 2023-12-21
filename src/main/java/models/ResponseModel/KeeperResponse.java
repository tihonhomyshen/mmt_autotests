package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeeperResponse {
    public PersonResponse person;
    public float rating;
    public int totalSystems;
    public int totalExplorers;
    public List<SystemResponse> systems;
    public CurrentGroupResponse currentGroup;
    public List<Object> studyRequests;
    public List<Object> approvedRequests;
    public List<Object> finalAssessments;
    public List<Object> reviewRequests;
}
