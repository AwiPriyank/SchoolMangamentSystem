package SchoolMangementSystem;

public class Teacher {
    int id;
    String name;
    String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Subject: " + subject;
    }
}
