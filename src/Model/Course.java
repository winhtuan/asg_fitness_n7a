package Model;

import java.time.LocalDate;

public class Course {

    private String courseId;
    private String courseName;
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;
    private Coach coach;
    private Exercise exercise;

    public Course() {
    }

    public Course(String courseId, String courseName, double price, LocalDate startDate, LocalDate endDate, Coach coach, Exercise exercise) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.coach = coach;
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + ", startDate=" + startDate + ", endDate=" + endDate + ", coach=" + coach + ", exercise=" + exercise + '}';
    }
    
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

}
