package Model;

public class Coach extends Person {

    private String coachId;
    private String specialization;

    public Coach() {
    }

    public Coach(String coachId, String specialization, String fullName, String phoneNumber, boolean sex, int age) {
        super(fullName, phoneNumber, sex, age);
        this.coachId = coachId;
        this.specialization = specialization;
    }

    public Coach(String coachId, String specialization) {
        this.coachId = coachId;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    @Override
    public String toString() {
        return "Coach{" + "coachId=" + coachId + '}';
    }

}
