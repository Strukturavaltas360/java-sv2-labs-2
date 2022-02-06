package activity;

import java.util.*;
import java.util.stream.Collectors;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = new ArrayList<>(activities);
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        Map<ActivityType, Report> reportMap = new LinkedHashMap<>();
        Arrays.stream(ActivityType.values())
                .forEach(activityType -> reportMap.put(activityType, new Report(activityType, 0)));
        for (Activity activity: activities) {
            Report report = reportMap.get(activity.getType());
            reportMap.put(activity.getType(), new Report(activity.getType(), activity.getDistance() + report.getDistance()));
        }
        return new ArrayList<>(reportMap.values());
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getClass() == ActivityWithTrack.class)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getClass() == ActivityWithoutTrack.class)
                .count();
    }
}
