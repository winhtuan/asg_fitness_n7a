package Model;

import Reponsitory.FileManager;
import View.Validation;
import java.util.HashMap;
import java.util.Map;

public class Gym {

    private Map<String, String> courses;
    private FileManager fileManager;
    private Validation valid;

    public Gym() {
        courses = new HashMap<>();
        fileManager = new FileManager();
        valid = new Validation();

    }

    public static void main(String[] args) {
        Gym g = new Gym();

    }

}
