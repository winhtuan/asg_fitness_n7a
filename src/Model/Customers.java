package Model;

public class Customers extends Person{

    private String customerId;
    private double height;
    private double weight;

    public Customers() {
    }

    public Customers(String customerId, String fullName, String phoneNumber, boolean sex, int age) {
        super(fullName, phoneNumber, sex, age);
        this.customerId = customerId;
    }

    public Customers(String customerId, double height, double weight, String fullName, String phoneNumber, boolean sex, int age) {
        super(fullName, phoneNumber, sex, age);
        this.customerId = customerId;
        this.height = height;
        this.weight = weight;
    }
    
    

    @Override
    public String toString() {
        return "Customers{" + "customerId=" + customerId + ", height=" + height + ", weight=" + weight + '}';
    }
    
    public double calBMI(){
        return weight / Math.pow(height, 2);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
