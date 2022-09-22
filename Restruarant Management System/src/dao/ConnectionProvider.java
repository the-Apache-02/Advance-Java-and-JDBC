/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author risha
 */
public class ConnectionProvider {

    public static Connection getCon() {
        Connection con=null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "Selin");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
