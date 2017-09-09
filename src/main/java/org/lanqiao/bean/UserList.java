package org.lanqiao.bean;

/**
 * Created by user on 2017/9/2.
 */
public class UserList {
     String uname;
     String password;
     String sex;
     int  age;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserList(String uname, String password, String sex, int age) {
        this.uname = uname;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }

    public UserList() {
    }
}
