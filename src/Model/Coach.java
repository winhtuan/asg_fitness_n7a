package Model;

public class Coach extends Person {

    private String specialization;

    public Coach() {
    }

    public Coach(String specialization, String personId, String personName, String phoneNumber, String sex, int age) {
        super(personId, personName, phoneNumber, sex, age);
        this.specialization = specialization;
    }

    public Coach(String personName, String specialization) {
        super(personName);
        this.specialization = specialization;
    }

    public Coach(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
