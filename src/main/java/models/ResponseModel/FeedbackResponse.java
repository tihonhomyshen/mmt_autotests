package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackResponse {
    public int personId;
    public String firstName;
    public String lastName;
    public String patronymic;
    public int explorerId;
    public int courseId;
    public String courseTitle;
    public int rating;
    public String comment;
}
