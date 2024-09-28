package Model;

public class Person {

    private String personId;
    private String personName;
    private String phoneNumber;
    private String sex;
    private int age;

    public Person() {
    }

    public Person(String personName, String sex) {
        this.personName = personName;
        this.sex = sex;
    }

    public Person(String personName) {
        this.personName = personName;
    }

    public Person(String personId, String personName, String phoneNumber, String sex, int age) {
        this.personId = personId;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String fullName) {
        this.personName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
