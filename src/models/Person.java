package models;

public abstract class Person {
    private String namePerson;
    private int agePerson;
    private String phoneNumber;
    private String sex;
    private String email;
    private String identityNumber;

    public Person(String namePerson, int agePerson, String phoneNumber, String sex, String email, String identityNumber) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.email = email;
        this.identityNumber = identityNumber;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
