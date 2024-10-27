package SchoolMangementSystem;


public class Class{

    int classId;
    String className;
    String teacherName;
   
    public Class(int classId, String className, String teacherName) {
        this.classId = classId;
        this.className = className;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Class ID: " + classId + ", Class Name: " + className + ", Teacher Name: " + teacherName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


}
