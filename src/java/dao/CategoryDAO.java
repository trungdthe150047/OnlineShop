/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author DO THANH TRUNG
 */
public class CategoryDAO extends BaseDAO {

    public ArrayList<Category> getCategoris() {
        ArrayList<Category> cates = new ArrayList<>();
        try {
            String sql = "select * from Categories";
            //create statement
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Category cate = new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
//                s.setCategoryID(rs.getInt("CategoryID"));
//                s.setCategoryName(rs.getString("CategoryName"));
//                s.setDescription(rs.getString("Description"));

                cates.add(cate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cates;
    }

    public static void main(String[] args) {
//        ArrayList<Category> sups = new ArrayList<>();
//        sups = new CategoryDAO().getCategoris();
//        System.out.println(sups.size());
    }
}
