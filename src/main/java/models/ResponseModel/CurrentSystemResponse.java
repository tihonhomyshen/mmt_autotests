package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentSystemResponse {
        public int explorerId;
        public int courseThemeId;
        public String courseThemeTitle;
        public int courseId;
        public String courseTitle;
        public KeeperDataResponse keeper;
        public int groupId;
        public int progress;
        public int unfulfilledHomeworksNumber;
}
