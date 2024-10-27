package SchoolMangementSystem;

public class Attendance {
    int attenid;
    int studentId;
    int classId;
    boolean present;
    String date;

    

    public Attendance(int id, int studentId2, String date2, boolean isPresent) {
        this.attenid = id;
        this.studentId = studentId2;
        this.date = date2;
        this.present = isPresent;
    }

    @Override
    public String toString() {
        return "Attendance ID: " + attenid + ", Student ID: " + studentId + ", Class ID: " + classId + ", Present: " + present + ", Date: " + date;
    }

    public int getAttenid() {
        return attenid;
    }

    public void setAttenid(int attenid) {
        this.attenid = attenid;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    
}
