package optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class TrainingCompany {
    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        if (courses == null || courses.isEmpty()) {
            throw new IllegalArgumentException("List must be not empty!");
        }
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> result = courses.stream()
                .filter(course -> course.getPrice() < maxPrice)
                .sorted(Comparator.comparing(Course::getPrice))
                .findFirst();
        return result.orElseThrow(() -> new IllegalArgumentException("No such course."));

    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        OptionalInt result = courses.stream()
                .filter(course -> course.getName() == name && course.getLevel() == level)
                .mapToInt(Course::getPrice)
                .findFirst();
        return result.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> result = courses.stream()
                .filter(course -> course.getLevel() == level)
                .map(Course::getName)
                .findFirst();
        return result.orElse("Sorry, there is no course at this level.");
    }

    public List<Course> getCourses() {
        return courses;
    }
}
