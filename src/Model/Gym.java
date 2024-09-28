package Model;

import Repository.FileManager;
import View.Validation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Gym {

    private Map<String, Course> courses;
    private FileManager fileManager;
    private Validation valid;

    public Gym() {
        courses = new HashMap<>();
        fileManager = new FileManager();
        valid = new Validation();

        // Create Workout object for each Course
        Workout absWorkout = new Workout(
                "Focus on abdominal muscles",
                new HashSet<>(Arrays.asList("Crunches", "Leg Raise", "Plank")),
                Arrays.asList("Low carb", "Protein rich meals"),
                Map.of("Monday", Arrays.asList("Crunches", "Leg Raise"),
                        "Wednesday", Arrays.asList("Plank", "Bicycle Crunch"))
        );

        Workout legWorkout = new Workout(
                "Focus on leg muscles",
                new HashSet<>(Arrays.asList("Squats", "Lunges", "Leg Press")),
                Arrays.asList("Balanced diet", "High fiber meals"),
                Map.of("Tuesday", Arrays.asList("Squats", "Lunges"),
                        "Thursday", Arrays.asList("Leg Press", "Calf Raises"))
        );

        Workout armWorkout = new Workout(
                "Focus on arm muscles",
                new HashSet<>(Arrays.asList("Push-ups", "Bicep Curls", "Tricep Dips")),
                Arrays.asList("High protein", "Healthy fats"),
                Map.of("Wednesday", Arrays.asList("Push-ups", "Bicep Curls"),
                        "Friday", Arrays.asList("Tricep Dips", "Pull-ups"))
        );

        Workout calorieBurningWorkout = new Workout(
                "Burn calories",
                new HashSet<>(Arrays.asList("Running", "Jump Rope", "Burpees")),
                Arrays.asList("Balanced meals", "High fiber, low sugar"),
                Map.of("Monday", Arrays.asList("Running", "Jump Rope"),
                        "Friday", Arrays.asList("Burpees", "Cycling"))
        );

        Workout yogaWorkout = new Workout(
                "Relax and increase flexibility with Yoga",
                new HashSet<>(Arrays.asList("Sun Salutation", "Tree Pose", "Warrior Pose")),
                Arrays.asList("Detox diet", "Vegetarian meals"),
                Map.of("Sunday", Arrays.asList("Sun Salutation", "Tree Pose"),
                        "Saturday", Arrays.asList("Warrior Pose", "Bridge Pose"))
        );

        // Create Coach objects
        Coach coachAbs = new Coach("Coach A", "Abs");
        Coach coachLegs = new Coach("Coach B", "Legs");
        Coach coachArms = new Coach("Coach C", "Arms");
        Coach coachCalories = new Coach("Coach D", "Burning Calories");
        Coach coachYoga = new Coach("Coach E", "Yoga");

        // Create Course objects
        Course absCourse = new Course("C01", "Abs Course", 500.0, "2 months", coachAbs, absWorkout);
        Course legCourse = new Course("C02", "Legs Course", 450.0, "2 months", coachLegs, legWorkout);
        Course armCourse = new Course("C03", "Arms Course", 400.0, "1.5 months", coachArms, armWorkout);
        Course calorieBurningCourse = new Course("C04", "Calorie-Burning Course", 550.0, "3 months", coachCalories, calorieBurningWorkout);
        Course yogaCourse = new Course("C05", "Yoga Course", 600.0, "3 months", coachYoga, yogaWorkout);

        courses.put(absCourse.getCourseId(), absCourse);
        courses.put(legCourse.getCourseId(), legCourse);
        courses.put(armCourse.getCourseId(), armCourse);
        courses.put(calorieBurningCourse.getCourseId(), calorieBurningCourse);
        courses.put(yogaCourse.getCourseId(), yogaCourse);
    }

    // main method to test the code
    public static void main(String[] args) {
        Gym g = new Gym();
        System.out.println("List of Courses:");
        g.courses.forEach((key, value) -> {
            System.out.println("ID: " + key + ", Course Name: " + value.getCourseName());
        });
    }
}
