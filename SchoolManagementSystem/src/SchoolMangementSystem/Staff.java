package SchoolMangementSystem;

class Staff {
    int staffId;
    String staffName;
    String position; 
    String department;
    

    public Staff(int staffId, String staffName, String position, String department) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff ID: " + staffId + ", Name: " + staffName + ", Position: " + position + ", Department: " + department;
    }
}
