package com.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static  final String url="jdbc:mysql://localhost:3306/numbers";
    private static  final String user="root";
    private static final String passwrd="root";

    public static  Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,passwrd);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
