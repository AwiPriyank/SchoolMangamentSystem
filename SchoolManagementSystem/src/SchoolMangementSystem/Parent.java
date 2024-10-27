package SchoolMangementSystem;

public class Parent {
    String parentId;
    String name;
    String email;
    String address;

    public Parent(int id, String name, String email, String phoneNumber, String address) {
        this.parentId = String.valueOf(id);
        this.name = name;
        this.email = email;
        this.address = address;
    }


    public String getParentId() {
        return parentId;
    }


    public void setParentId(String parentId) {
        this.parentId = parentId;
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


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Parent parentId=" + parentId + ", name=" + name + ", email=" + email
                + ", address=" + address;
    }


    public int getId() {
        return Integer.parseInt(parentId);
    }

}
