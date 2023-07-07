package Mpp.Lab2.prob2A;

public class StudentGradeReportFactory {
    public static Student creatStudent(String name){
        if(name == null)
            throw new IllegalArgumentException("Student name cannot be null");
        Student student = new Student(name);

        GradeReport gradeReport = new GradeReport(student);

        student.setGradeReport(gradeReport);

        return student;
    }
}
