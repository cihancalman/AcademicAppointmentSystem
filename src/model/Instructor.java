package model;

public class Instructor extends User {
    private String title;

    public Instructor(int id, String name, String email, String title) {
        super(id, name, email);
        this.title = title;
    }

    @Override
    public String getRole() {
        return "instructor";
    }

    public String getTitle() {
        return title;
    }
}
