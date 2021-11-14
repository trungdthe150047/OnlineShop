/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Feature;
import model.Role;

/**
 *
 * @author DO THANH TRUNG
 */
public class CustomerDAO extends BaseDAO {

    public int insert(Customer cus) {
        int n = 0;
        try {
            String sql = "INSERT INTO [dbo].[Customer]\n"
                    + "           ([Account]\n"
                    + "           ,[Password]\n"
                    + "           ,[Name]\n"
                    + "           ,[Gender]\n"
                    + "           ,[PhoneNumber]\n"
                    + "           ,[Email]\n"
                    + "           ,[DOB]\n"
                    + "           ,[Address])\n"
                    + "     VALUES\n"
                    + "           (?,\n"
                    + "           ?,\n"
                    + "           ?,\n"
                    + "           ?,\n"
                    + "           ?,\n"
                    + "           ?,\n"
                    + "           ?,\n"
                    + "           ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cus.getAccount());
            statement.setString(2, cus.getPassword());
            statement.setString(3, cus.getCustomerName());
            statement.setBoolean(4, cus.isGender());
            statement.setString(5, cus.getPhoneNumber());
            statement.setString(6, cus.getEmail());
            statement.setDate(7, cus.getDOB());
            statement.setString(8, cus.getAddress());
            n = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    //add account_role as customer
    public int insertAccRole(Customer cus) {
        int n = 0;
        try {
            String sql = "INSERT INTO [dbo].[Account_Role]\n"
                    + "           ([Account]\n"
                    + "           ,[RoleID])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cus.getAccount());
            //role customer
            statement.setInt(2, 2);
            n = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    //get account with role && feature
    //customer -- account_role -- role -- role_feature -- feature
    public Customer getAccount1(String username, String password) {
        try {
            String sql = "SELECT a.CustomerID, a.Account,a.Password,a.Address,a.PhoneNumber, a.DOB,a.Email, r.RoleID,r.RoleName,f.FeatureID,f.url,a.Name FROM\n"
                    + "                    Customer a LEFT JOIN Account_Role ar ON a.Account = ar.Account\n"
                    + "                    LEFT JOIN [Role] r ON ar.RoleID = r.RoleID\n"
                    + "                    LEFT JOIN Role_Feature rf ON r.RoleID = rf.RoleID\n"
                    + "                    LEFT JOIN Feature f ON rf.FeatureID = f.FeatureID\n"
                    + "                    WHERE a.Account = ? AND a.password = ? \n"
                    + "  ORDER BY a.Account, r.RoleID ASC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            //no account
            Customer account = null;
            Role r = new Role();
            r.setId(-1);
            while (rs.next()) {
                if (account == null) {
                    account = new Customer();
                    account.setCustomerID(rs.getInt("CustomerID"));
                    account.setAccount(rs.getString("Account"));
                    account.setPassword(rs.getString("Password"));
                    account.setCustomerName(rs.getString("Name"));
                    account.setAddress(rs.getString("Address"));
                    account.setDOB(rs.getDate("DOB"));
                    account.setPhoneNumber(rs.getString("PhoneNumber"));
                    account.setEmail(rs.getString("Email"));
                }

                //else (account != null)
                //get roleID && roleName
                int roleID = rs.getInt("RoleID");
                if (roleID != r.getId()) {
                    r = new Role();
                    r.setId(roleID);
                    r.setName(rs.getString("RoleName"));
                    account.getRoles().add(r);
                }
                //get featureID && url
                Feature f = new Feature();
                f.setId(rs.getInt("FeatureID"));
                f.setUrl(rs.getString("url"));
                r.getFeatures().add(f);
            }
            return account;

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //get customer
    public Customer getAccount(String userName, String pass) {
        String sql = "select * from Customer \n"
                + "where Account = ? and Password = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userName);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Customer c = new Customer();
                c.setCustomerID(rs.getInt("CustomerID"));
                c.setAccount(rs.getString("Account"));
                c.setPassword(rs.getString("Password"));
                c.setCustomerName(rs.getString("Name"));
                c.setDOB(rs.getDate("DOB"));
                c.setEmail(rs.getString("Email"));
                c.setAddress(rs.getString("Address"));
                c.setPhoneNumber(rs.getString("PhoneNumber"));

                return c;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int updateCustomer(Customer cus) {
        int n = 0;
        try {
            String sql = "update Customer set Name=?"
                    + ", Gender=?"
                    + ", PhoneNumber=?"
                    + ", Email=?"
                    + " where CustomerID=?";
            PreparedStatement state = connection.prepareStatement(sql);
            state.setString(1, cus.getCustomerName());
            state.setBoolean(2, cus.isGender());
            state.setString(3, cus.getPhoneNumber());
            state.setString(4, cus.getEmail());
            state.setInt(5, cus.getCustomerID());
            n = state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public static void main(String[] args) {
        Customer c = new CustomerDAO().getAccount1("long", "123456");
        System.out.println(c);
//        for (int i = 0; i < c.getRoles().size(); i++) {
//            System.out.println(c.getRoles().get(i).getName());
//        }

    }
}
