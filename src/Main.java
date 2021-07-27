import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jesse", 24, "Male", 201410381);

        student.setName(student.name);
        student.setAge(student.age);
        student.setGender(student.gender);
        student.setId_No(student.id_No);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Male: " + student.getGender());
        System.out.println("Id Number: " + student.getId_No());

    }
}