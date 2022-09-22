/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author risha
 */
public class UserDao {

//    public static void main(String[] args) {
//        UserDao user=new UserDao();
//
//    }
    public static void save(User user) {
        String query = "insert into user(name,email,mobileNumber,password,address,securityQuestion,answer,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getPassword() + "','" + user.getAddress() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";

        DbOperations.setDataorDelete(query, "Registered Successfully wait for Admin Approval");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getdata("select *from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            String query = "select *from user where email='" + email + "'";
            ResultSet rs = DbOperations.getdata(query);
            if (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getUpdatePassword(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getdata("select *from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void Update(String email, String newPassword) {
        String query = "update user set password='" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataorDelete(query, "Password changed Successfully");
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getdata("select *from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "' where email='" + email + "'";
        DbOperations.setDataorDelete(query, "Status updated Successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperations.getdata("select *from user where email='" + email + "' and password='" + oldPassword + "'");
            if (rs.next()) {
                Update(email, newPassword);
            } else {
                JOptionPane.showMessageDialog(null, "Old Password is wrong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void changeSecurityQuestion(String email, String password, String securityQues, String ans) {
        try {
            ResultSet rs = DbOperations.getdata("select *from user where email='" + email + "' and password='" + password + "'");
            if (rs.next()) {
                Update(email, securityQues, ans);
            } else {
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        } catch (Exception e) {
        }
    }

    public static void Update(String email, String securityQue, String ans) {
        String query = "update user set securityQuestion='" + securityQue + "',answer='" + ans + "' where email='" + email + "'";
        DbOperations.setDataorDelete(query, "Security Question changed Successfully");
    }
}
