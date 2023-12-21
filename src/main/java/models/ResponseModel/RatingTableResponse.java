package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingTableResponse {
    public int personId;
    public String firstName;
    public String lastName;
    public String patronymic;
    public double rating;
    public List<GalaxyResponse> galaxies;
}
