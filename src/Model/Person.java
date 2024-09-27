package Model;

public class Person {

    private String fullName;
    private String phoneNumber;
    private boolean sex;
    private int age;

    public Person() {
    }

    public Person(String fullName, String phoneNumber, boolean sex, int age) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

}
