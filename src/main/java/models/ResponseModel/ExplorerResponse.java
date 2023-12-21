package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExplorerResponse {
    public PersonResponse person;
    public double rating;
    public int totalSystems;
    public CurrentSystemResponse currentSystem;
    public List<InvestigatedSystemResponse> investigatedSystems;
    public List<RatingTableResponse> ratingTable;
    public List<Object> homeworkRequests;
}
