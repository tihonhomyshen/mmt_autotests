package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GalaxyResponse {
    public int galaxyId;
    public String galaxyName;
    public String galaxyDescription;
}
