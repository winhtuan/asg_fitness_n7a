package Model;

import java.util.List;
import java.util.Map;

import java.util.Set;

public class Workout {

    private String description;
    private Set<String> exercise;
    private List<String> nutrition;
    private Map<String, List<String>> schedule;

    public Workout() {
    }

    public Workout(String description, Set<String> exercise, List<String> nutrition, Map<String, List<String>> schedule) {
        this.description = description;
        this.exercise = exercise;
        this.nutrition = nutrition;
        this.schedule = schedule;
    }

    public void addExercise(String newExercise) {
        exercise.add(newExercise);
    }

    public void removeExercise(String exerciseToRemove) {
        exercise.remove(exerciseToRemove);
    }

    public Map<String, List<String>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, List<String>> schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getExercise() {
        return exercise;
    }

    public void setExercise(Set<String> exercise) {
        this.exercise = exercise;
    }

    public List<String> getNutrition() {
        return nutrition;
    }

    public void setNutrition(List<String> nutrition) {
        this.nutrition = nutrition;
    }

}
