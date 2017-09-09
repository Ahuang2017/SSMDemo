package org.lanqiao.bean;

import java.util.List;

/**
 * Created by user on 2017/9/4.
 */
public class Classes {
    private int classId;
    private String className;
    private  Teacher teacher;
    private List<Student> studentList;
    public Classes() {
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Classes(int classId, String className, Teacher teacher, List<Student> studentList) {
        this.classId = classId;
        this.className = className;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
