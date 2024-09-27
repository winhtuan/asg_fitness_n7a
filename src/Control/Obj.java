package Control;

import View.Menu;


public class Obj extends Menu {

    private static String[] choices = {"", "", "", "", "", "", "", "", "", "Exit"};
    private static Obj app = new Obj("", choices);

    public Obj(String title, String[] mchon) {
        super(title, mchon);
        
    }

    public static void main(String[] args) {
        app.run();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
            }
            case 7 -> {
            }
            case 8 -> {
            }
            case 9 -> {
            }
            case 0 ->
                System.exit(0);
            default ->
                System.out.println("Invalid choice! Please try again.");
        }
    }

}
