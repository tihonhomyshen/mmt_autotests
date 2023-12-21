package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentGroupResponse {
    public int groupId;
    public int courseId;
    public int keeperId;
    public String courseTitle;
    public List<ExplorerDataResponse> explorers;
}
