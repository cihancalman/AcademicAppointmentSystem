package model;

public class Student extends User {

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "student";
    }

}
