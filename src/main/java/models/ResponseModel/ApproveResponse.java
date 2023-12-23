package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApproveResponse {
    public Long responseId;
    public Long requestId;
    public Long keeperId;
    public String responseDate;
    public Long statusId;
}
