/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NewProduct;

/**
 *
 * @author risha
 */
public class ProductDao {

    public static void save(NewProduct product) {
        String query = "insert into product(name,category,price) values('" + product.getName() + "','" + product.getCategory() + "','" + product.getPrice() + "')";
        DbOperations.setDataorDelete(query, "Product Added Successfully.");
    }

    public static ArrayList<NewProduct> getAllRecords() {
        ArrayList<NewProduct> list = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getdata("select *from product");
            while (rs.next()) {
                NewProduct product = new NewProduct();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                list.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static void update(NewProduct product) {
        String query = "update product set name='" + product.getName() + "',category='" + product.getCategory() + "',price='" + product.getPrice() + "' where id='" + product.getId() + "'";
        DbOperations.setDataorDelete(query, "Product Updated Successfully");
    }

    public static void delete(String id) {
        String query = "delete from product where id='" + id + "'";
        DbOperations.setDataorDelete(query, "Product deleted Successfully");
    }

    public static ArrayList<NewProduct> getAllRecordsByCategory(String category) {
        ArrayList<NewProduct> arrayList = new ArrayList<>();
        try {
            String query = "select *from product where category='" + category + "'";
            ResultSet rs = DbOperations.getdata(query);
            while (rs.next()) {
                NewProduct newp = new NewProduct();
                newp.setName(rs.getString("name"));
                arrayList.add(newp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<NewProduct> filterProductByName(String name, String category) {
        ArrayList<NewProduct> arrayList = new ArrayList<>();
        try {
            String query = "select *from product where name like '%" + name + "%' and category='" + category + "'";
            ResultSet rs = DbOperations.getdata(query);
            while (rs.next()) {
                NewProduct newp = new NewProduct();
                newp.setName(rs.getString("name"));
                arrayList.add(newp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static NewProduct getProductByName(String name) {
        NewProduct product = new NewProduct();
        try {
            ResultSet rs = DbOperations.getdata("select *from product where name='" + name + "'");
            while (rs.next()) {
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
}
