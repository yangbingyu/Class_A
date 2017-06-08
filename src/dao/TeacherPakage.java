package dao;

import domain.Course;
import domain.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2017/5/31.
 */
public class TeacherPakage {

    public List<Course> ObtainAllCourse(){
        Conn conn = new Conn();
        Connection connection = conn.getConn();
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Course> list = new ArrayList<>();
        Course course;
        String sql = "";


        return null;
    }

    public List<Student> TmanageS(){
        List<Student> list=new ArrayList<Student>();
        ResultSet rs=null;
        PreparedStatement ps=null;
        try {
            Conn conn=new Conn();
            Connection connection=conn.getConn();
            String sql="select X_Student.X_Student_No,X_Student_Name from X_Student\n" +
                    "  left join X_Electives\n" +
                    "    on X_Student.X_Student_No = X_Electives.X_Student_No\n" +
                    "where X_Student.X_Student_No not IN (SELECT X_Student.X_Student_No FROM X_Student,X_Electives WHERE X_Student.X_Student_No = X_Electives.X_Student_No);\n";
            ps=connection.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Student student=new Student();
                student.setStudent_No(rs.getString(4));
                student.setStudent_Name(rs.getString(1));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<Student> TS(){
        List<Student> list=new ArrayList<Student>();
        ResultSet rs=null;
        PreparedStatement ps=null;
        try {
            Conn conn=new Conn();
            Connection connection=conn.getConn();
            String sql="SELECT X_Student.X_Student_No,X_Student_Name FROM X_Student,X_Electives WHERE X_Student.X_Student_No = X_Electives.X_Student_No";
            ps=connection.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Student student=new Student();
                student.setStudent_No(rs.getString(4));
                student.setStudent_Name(rs.getString(1));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
