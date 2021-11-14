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
import model.Supplier;

/**
 *
 * @author DO THANH TRUNG
 */
public class SupplierDAO extends BaseDAO {

    public ArrayList<Supplier> getSups() {
        ArrayList<Supplier> sups = new ArrayList<>();
        try {
            String sql = "select * from Supplier";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Supplier s = new Supplier();
                s.setSupplierID(rs.getInt("SupplierID"));
                s.setCompanyName(rs.getString("CompanyName"));
                s.setContactName(rs.getString("ContactName"));
                s.setCity(rs.getString("City"));
                s.setPostalCode(rs.getString("PostalCode"));
                s.setPhone(rs.getString("Phone"));
                sups.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sups;
    }

    public static void main(String[] args) {
//        ArrayList<Supplier> sups = new ArrayList<>();
//        sups = new SupplierDAO().getSups();
//        System.out.println(sups.size());
    }
}
