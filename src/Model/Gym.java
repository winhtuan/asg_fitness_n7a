package Model;

import Data.FileManager;
import View.Validation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Gym {
    private List<Course> courses;
    private FileManager fileManager;
    private Validation valid;

    public Gym() {
        courses = new ArrayList<>();
        fileManager = new FileManager();
        valid = new Validation();
        
    }
    
    public static void main(String[] args) {
        Gym g = new Gym();
        
    }
    
    public void displayCourse(){
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
