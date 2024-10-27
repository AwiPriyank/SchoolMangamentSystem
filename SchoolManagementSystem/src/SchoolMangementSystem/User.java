package SchoolMangementSystem;

public class User {
    int id;
    String name;
    String email;
    String phoneNumber;
    int Age;
    String password;
    String category;
    boolean isActive;
   
   
    public User(int id, String name, String email, String phoneNumber, int age, String password, String category,
            boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.Age = age;
        this.password = password;
        this.category = category;
        this.isActive = isActive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", Age="
                + Age + ", password=" + password + ", category=" + category + ", isActive=" + isActive + "]";
    }
    
    
}
