package Model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise {

    private String description;
    private Set<String> exercise;
    private List<String> nutrition;

    public Exercise() {
    }

    public Exercise(String description, Set<String> exercise, List<String> nutrition) {
        this.description = description;
        this.exercise = exercise;
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "Exercise{" + "description=" + description + ", exercise=" + exercise + ", nutrition=" + nutrition + '}';
    }

    public void addExercise(String newExercise) {
        exercise.add(newExercise);
    }

    public void removeExercise(String exerciseToRemove) {
        exercise.remove(exerciseToRemove);
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
