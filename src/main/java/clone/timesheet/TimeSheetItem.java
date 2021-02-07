package clone.timesheet;

import methoverloading.Time;

import java.time.LocalDate;
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

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public TimeSheetItem(TimeSheetItem tsi) {
        this.employee = tsi.getEmployee();
        this.project = tsi.getProject();
        this.from = tsi.getFrom();
        this.to = tsi.getTo();
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem tsi, LocalDate localDate) {
        TimeSheetItem newtsi = new TimeSheetItem(tsi);
        newtsi.from = LocalDateTime.of(localDate, newtsi.from.toLocalTime());
        newtsi.to = LocalDateTime.of(localDate, newtsi.to.toLocalTime());
        return newtsi;
    }



}
