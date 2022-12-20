package com.example.demo4;


import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    public Connection databaseLink;


    public Connection getconnection (){
        String databasename="demo_db";
        String databaseuser="demo";
        String databasepassword="putyoutpassword";
        String url="jdbc:mysql://localhost:3306"+ databasename ;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseuser,databasepassword);

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }

        return databaseLink;
}

}

