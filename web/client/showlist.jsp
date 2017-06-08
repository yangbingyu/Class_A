<%@ page import="domain.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.TeacherPakage" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/6/6
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选课学生</title>
</head>
<body>
<%
    TeacherPakage teacherPakage=new TeacherPakage();
    List<Student> listall=new ArrayList<Student>();
    listall=teacherPakage.TmanageS();//list给迭代器的时候需要先赋值
    Iterator<Student> iter=listall.iterator();
%>
<table border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
    </tr>
    <%
        while (iter.hasNext()){
            Student student=iter.next();
    %>
    <tr>
        <td><%=student.getStudent_No()%></td>
        <td><%=student.getStudent_Name()%></td>
    </tr>
    <%
        }
    %>
</table>
<%
    List<Student> list=new ArrayList<Student>();
    list=teacherPakage.TS();//list给迭代器的时候需要先赋值
    Iterator<Student> it=list.iterator();
%>
<table border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
    </tr>
    <%
        while (it.hasNext()){
            Student student=it.next();
    %>
    <tr>
        <td><%=student.getStudent_No()%></td>
        <td><%=student.getStudent_Name()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
