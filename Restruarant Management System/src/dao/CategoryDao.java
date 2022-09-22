/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;

/**
 *
 * @author risha
 */
public class CategoryDao {

    public static void save(Category category) {
        String query = "insert into category(category) values('" + category.getCategory() + "')";
        DbOperations.setDataorDelete(query, "Category added Successfully");
    }

    public static ArrayList<Category> getCategory() {
        ArrayList<Category> arrayList = new ArrayList<Category>();
        try {
            ResultSet rs = DbOperations.getdata("select *from category");
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setCategory(rs.getString("category"));
                arrayList.add(category);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
public static void deleteCategory(int id){
String query="delete from category where id='"+id+"'";
DbOperations.setDataorDelete(query, "Category deleted successfully");
}
}
