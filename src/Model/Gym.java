package Model;

import Reponsitory.FileManager;
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
        Workout workoutBung = new Workout(
                "Tập trung vào cơ bụng",
                new HashSet<>(Arrays.asList("Crunches", "Leg Raise", "Plank")),
                Arrays.asList("Low carb", "Protein rich meals"),
                Map.of("Monday", Arrays.asList("Crunches", "Leg Raise"),
                        "Wednesday", Arrays.asList("Plank", "Bicycle Crunch"))
        );

        Workout workoutChan = new Workout(
                "Tập trung vào cơ chân",
                new HashSet<>(Arrays.asList("Squats", "Lunges", "Leg Press")),
                Arrays.asList("Balanced diet", "High fiber meals"),
                Map.of("Tuesday", Arrays.asList("Squats", "Lunges"),
                        "Thursday", Arrays.asList("Leg Press", "Calf Raises"))
        );

        Workout workoutTay = new Workout(
                "Tập trung vào cơ tay",
                new HashSet<>(Arrays.asList("Push-ups", "Bicep Curls", "Tricep Dips")),
                Arrays.asList("High protein", "Healthy fats"),
                Map.of("Wednesday", Arrays.asList("Push-ups", "Bicep Curls"),
                        "Friday", Arrays.asList("Tricep Dips", "Pull-ups"))
        );

        Workout workoutCalo = new Workout(
                "Đốt cháy calo",
                new HashSet<>(Arrays.asList("Running", "Jump Rope", "Burpees")),
                Arrays.asList("Balanced meals", "High fiber, low sugar"),
                Map.of("Monday", Arrays.asList("Running", "Jump Rope"),
                        "Friday", Arrays.asList("Burpees", "Cycling"))
        );

        Workout workoutYoga = new Workout(
                "Thư giãn và dẻo dai với Yoga",
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
        Course courseAbs = new Course("C01", "Abs Course", 500.0, "2 months", coachAbs, workoutBung);
        Course courseLegs = new Course("C02", "Legs Course", 450.0, "2 months", coachLegs, workoutChan);
        Course courseArms = new Course("C03", "Arms Course", 400.0, "1.5 months", coachArms, workoutTay);
        Course courseCalories = new Course("C04", "Calorie-Burning Course", 550.0, "3 months", coachCalories, workoutCalo);
        Course courseYoga = new Course("C05", "Yoga Course", 600.0, "3 months", coachYoga, workoutYoga);

        courses.put(courseAbs.getCourseId(), courseAbs);
        courses.put(courseLegs.getCourseId(), courseLegs);
        courses.put(courseArms.getCourseId(), courseArms);
        courses.put(courseCalories.getCourseId(), courseCalories);
        courses.put(courseYoga.getCourseId(), courseYoga);
    }
    // hàm main test code
    public static void main(String[] args) {
        Gym g = new Gym();
        System.out.println("List Courses:");
        g.courses.forEach((key, value) -> {
            System.out.println("ID: " + key + ", Course Name: " + value.getCourseName());
        });
    }

}
