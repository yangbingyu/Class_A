package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by hp on 2017/5/31.
 */
public class Conn {

    /*org.gjt.mm.mysql.Driver*/
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";//com.mysql.jdbc.Driver
    public static final String DBURL = "jdbc:mysql://localhost:3306/class_a?useUnicode=true&amp;characterEncoding=UTF-8&amp;autoReconnect=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "shixinkong.123";
    Connection connection= null;


    public Connection getConn() {
        try {
            Class.forName(DBDRIVER);
            connection =  DriverManager.getConnection(DBURL, DBUSER, DBPASS);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return connection;
    }
}
