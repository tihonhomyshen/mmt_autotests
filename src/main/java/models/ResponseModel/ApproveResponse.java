package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApproveResponse {
    public int responseId;
    public int requestId;
    public int keeperId;
    public String responseDate;
    public int statusId;
}
