package atm;

public class Student {
    private String fullName;
    private int student_id;
    private int grade;


    Student(String fullName, int student_id, int grade){
        this.fullName = fullName;
        this.student_id = student_id;
        this.grade = grade;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getGrade() {
        return grade;
    }

    public String getFullName() {
        return fullName;
    }
}
