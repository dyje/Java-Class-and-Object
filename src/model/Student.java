package model;

public class Student {
    public String name;
    public int age;
    public String gender;
    public int id_No;

    public Student(String name, int age, String gender, int id_No) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id_No = id_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Jesse";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 24;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId_No() {
        return id_No;
    }

    public void setId_No(int id_No) {
        this.id_No = id_No;
    }
}
