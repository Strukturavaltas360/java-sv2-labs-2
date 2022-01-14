package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {
    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem tsi) {
        this.employee = tsi.employee;
        this.project = tsi.project;
        this.from = tsi.from;
        this.to = tsi.to;
    }

    TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee) {
        TimeSheetItem copy = new TimeSheetItem(timeSheetItem);
        copy.setEmployee(newEmployee);
        return copy;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }
}
