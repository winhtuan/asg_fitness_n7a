package View;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Menu {

    private String title;
    private ArrayList options;
    private Validation valid;

    public Menu() {
        options = new ArrayList();
    }

    public Menu(String title, String[] mchon) {
        this.title = title;
        options = new ArrayList<>();
        for (String m : mchon) {
            options.add(m);
        }
        this.valid = new Validation();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getChoices() {
        int choice = 0;
        while (true) {
            try {
                choice = valid.getValue("Your choice: ", Integer.class);
                if (choice > 0 && choice <= this.options.size()) {
                    break;
                } else {
                    System.out.println("Please choose from 1 to " + this.options.size());
                }
            } catch (InputMismatchException e) {
                System.out.println("Please input number!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return options;

    }

    public void setChoices(ArrayList choices) {
        this.options = choices;
    }
//----------------------------------------------------

    public void display() {
        System.out.println(title);
        System.out.println("-------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("-------------------");
    }
//----------------------------------------------------

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
//----------------------------------------------------

    public abstract void execute(int ch);
//----------------------------------------------------

    public void run() {
        while (true) {
            int ch = getSelected();
            if (ch <= options.size()) {
                execute(ch);
            } else {
                break;
            }
        }
    }

}
