package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExplorerDataResponse {
    public int personId;
    public String firstName;
    public String lastName;
    public String patronymic;
    public int explorerId;
    public int courseId;
    public int groupId;
}
