package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeeperDataResponse {
    public int personId;
    public String firstName;
    public String lastName;
    public String patronymic;
    public int keeperId;
}
