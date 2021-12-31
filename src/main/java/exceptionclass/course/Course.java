package exceptionclass.course;

public class Course {
    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        this.name = name;
        this.begin = begin;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", begin.toString(), name);
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }
}
