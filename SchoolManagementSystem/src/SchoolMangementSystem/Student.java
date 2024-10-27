package SchoolMangementSystem;

public class Student {
    int id;
    String name;
    String subjects;
    String email;
    int age;
    String Address;
    String mobileNumber;
   
   
    public Student(int id, String name, String subjects, String email, int age, String address, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.email = email;
        this.age = age;
        Address = address;
        this.mobileNumber = mobileNumber;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", email=" + email + ", age=" + age
                + ", Address=" + Address + ", mobileNumber=" + mobileNumber + "]";
    }
   
   


}
