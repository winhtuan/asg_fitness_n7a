package Model;

public class Users extends Person {

    private double height;
    private double weight;

    public Users() {
    }

    public Users(String personId, String personName, String phoneNumber, String sex, int age, double height, double weight) {
        super(personId, personName, phoneNumber, sex, age);
        this.height = height;
        this.weight = weight;
    }

    public double calBMI() {
        return weight / Math.pow(height, 2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
