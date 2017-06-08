package web;

import dao.TeacherPakage;
import domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by dell on 2017/6/6.
 */
@WebServlet(name = "addStudentServlet",urlPatterns="/web/addStudent")
public class addStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        TeacherPakage teacherPakage=new TeacherPakage();
        List<Student> studentlist=teacherPakage.TmanageS();
        request.setAttribute("list",studentlist);
        request.getRequestDispatcher("list.jsp").forward(request,response);//请求转发，前后页面共享一个request ;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
