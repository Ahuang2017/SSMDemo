package org.lanqiao.bean;

/**
 * Created by user on 2017/9/4.
 */
public class Student {
    private  int studentId;
    private  String  studentName;
    private  int classId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Student(int studentId, String studentName, int classId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", classId=" + classId +
                '}';
    }
}
