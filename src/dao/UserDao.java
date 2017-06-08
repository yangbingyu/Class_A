package dao;

import domain.Admin;
import domain.Student;
import domain.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dell on 2017/6/5.
 */
public class UserDao {
    public static Student logStudent(String Student_User,String Student_Psd){
        Student student=new Student();
        try {
            Conn conn=new Conn();
            Connection dbc=conn.getConn();
            String sql_selectS="select * from x_student where X_Student_User=? and X_Student_Pwd=?";
            PreparedStatement pst=dbc.prepareStatement(sql_selectS);
            pst.setString(1,Student_User);
            pst.setString(2,Student_Psd);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                student.setStudent_Name(rs.getString(1));
                student.setStudent_User(rs.getString(2));
                student.setStudent_Psd(rs.getString(3));
                student.setStudent_No(rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }


    public static Teacher logTeacher(String Teacher_User, String Teacher_Pwd){
        Teacher  teacher=new Teacher();
        try {
            Conn conn=new Conn();
            Connection dbc=conn.getConn();
            String sql_selectT="select * from x_teacher where X_Teacher_User=? and X_Teacher_Pwd=?";
            PreparedStatement pst=dbc.prepareStatement(sql_selectT);
            pst.setString(1,Teacher_User);
            pst.setString(2,Teacher_Pwd);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                teacher.setTeacher_Name(rs.getString(1));
                teacher.setTeacher_Pwd(rs.getString(2));
                teacher.setTeacher_User(rs.getString(3));
                teacher.setTeacher_No(rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    public static Admin logAdmin(String Manager_User, String Manager_Pwd){
        Admin admin=new Admin();
        try {
            Conn conn=new Conn();
            Connection dbc=conn.getConn();
            String sql_selectM="select * from x_manager where X_Manager_User=? and X_Manager_Pwd=?";
            PreparedStatement pst=dbc.prepareStatement(sql_selectM);
            pst.setString(1,Manager_User);
            pst.setString(2,Manager_Pwd);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                admin.setManager_User(rs.getString(1));
                admin.setManager_Pwd(rs.getString(2));
                admin.setManager_ID(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }
}

