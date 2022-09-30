package com.haydendurham.schedulebuilder;

public class Lecture {
    private String title;
    private String days;
    private String time;
    private String instructor;
    private String location;
    private String date;
    private int credits;
    private String subject;
    private int course;
    private int section;

    public Lecture(String title, String days, String time, String instructor, String location, String date, int credits, String subject, int course, int section) {
        this.title = title;
        this.days = days;
        this.time = time;
        this.instructor = instructor;
        this.location = location;
        this.date = date;
        this.credits = credits;
        this.subject = subject;
        this.course = course;
        this.section = section;
    }

    public Lecture() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
