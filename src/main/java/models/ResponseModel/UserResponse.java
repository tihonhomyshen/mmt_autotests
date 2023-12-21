package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    public PersonResponse person;
    public float rating;
    public int totalSystems;
    public int totalExplorers;
    public List<SystemResponse> systems;
    public List<FeedbackResponse> feedback;
}
