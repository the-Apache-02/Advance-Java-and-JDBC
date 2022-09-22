/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author risha
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int(12) auto_increment primary key,name varchar(200),email varchar(200),mobileNumber varchar(200),password varchar(200),address varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),unique(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,password,address,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','admin','India','What is your favourite Place?','Istanbul','true')";
            String categoryTable = "create table category(id int auto_increment primary key,category varchar(200))";
            String newproduct = "create table product(id int(12) auto_increment primary key,name varchar(200),category varchar(200),price varchar(200))";
            String BillTable = "create table bill(id int primary key,name varchar(200),email varchar(200),mobileNumber varchar(200),date varchar(50),total varchar(50),createdBy varchar(200))";
            DbOperations.setDataorDelete(userTable, "User Table created Successfully");
            DbOperations.setDataorDelete(adminDetails, "Admin Details added Successfully");
            DbOperations.setDataorDelete(categoryTable, "Category table created Successfully");
            DbOperations.setDataorDelete(newproduct, "Product table created Successfully");
            DbOperations.setDataorDelete(BillTable, "BIll table created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
