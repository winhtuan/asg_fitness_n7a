package Model;

public class Course {

    private String courseId;
    private String courseName;
    private double price;
    private String time;
    private Coach coach;
    private Workout exercise;

    public Course() {
    }

    public Course(String courseId, String courseName, double price, String time, Coach coach, Workout exercise) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
        this.time = time;
        this.coach = coach;
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + ", time=" + time + ", coach=" + coach + ", exercise=" + exercise + '}';
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Workout getExercise() {
        return exercise;
    }

    public void setExercise(Workout exercise) {
        this.exercise = exercise;
    }

}
