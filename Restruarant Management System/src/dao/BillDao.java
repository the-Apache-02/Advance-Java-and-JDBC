/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author risha
 */
public class BillDao {

    public static String getId() {
        int id = 1;
        try {
            String Query = "select max(id) from bill";
            ResultSet rs = DbOperations.getdata(Query);
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Bill bill) {
        String query = "insert into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getEmail() + "','" + bill.getMobileNumber() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreatedBy() + "')";
        DbOperations.setDataorDelete(query, "Bill details added Successfully");
    }

    public static ArrayList<Bill> getAllRecordsByInc(String id) {
        ArrayList<Bill> array = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getdata("select *from bill where id like '%" + id + "%'");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setEmail(rs.getString("email"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                array.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return array;
    }

public static ArrayList<Bill> getAllRecordsByDec(String id) {
        ArrayList<Bill> array = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getdata("select *from bill where id like '%" + id + "%' order by id DESC");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setEmail(rs.getString("email"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                array.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return array;
    }
}
