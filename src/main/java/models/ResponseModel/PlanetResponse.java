package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanetResponse {
    public int planetId;
    public String planetName;
    public int planetNumber;
    public int systemId;
}
