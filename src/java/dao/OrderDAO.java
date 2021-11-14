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
import model.Order;
import model.Supplier;

/**
 *
 * @author DO THANH TRUNG
 */
public class OrderDAO extends BaseDAO {

    //add in4 customer to Bill 
    public int insertOrder(Order or) {
        int n = 0;
        try {
            String sql = "INSERT INTO [dbo].[Order]\n"
                    + "           ([CustomerID]\n"
                    + "           ,[ProductID]\n"
                    + "           ,[OrderDate]\n"
                    + "           ,[TotalMoney]\n"
                    + "           ,[Address]\n"
                    + "           ,[PhoneNumber])\n"
//                    + "           ,[Quantity])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,GETDATE()\n"
                    + "           ,?\n"
                    + "           ,?\n"
//                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, or.getCustomerID());
            statement.setInt(2, or.getProductID());
            statement.setDouble(3, or.getTotalMoney());
            statement.setString(4, or.getAddress());
            statement.setString(5, or.getPhoneNumber());
//            statement.setInt(6, or.getQuantity());
            n = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public ArrayList<Order> getOrder() {
        ArrayList<Order> list = new ArrayList<>();
        try {
            String sql = "select * from [dbo].[Order]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Order o = new Order(rs.getInt(1), rs.getInt(2), rs.getInt(3), 
                        rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7));
//                o.setCustomerID(rs.getInt(1));
//                o.setProductID(rs.getInt(2));
//                o.setOrderDate(rs.getDate(3));                
//                o.setTotalMoney(rs.getDouble(4));
//                o.setAddress(rs.getString(5));
//                o.setPhoneNumber(rs.getString(6));
                list.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
//        Order o = new Order(5, 10, 200, "hcm", "123123123");
//        new OrderDAO().insertOrder(o);
        OrderDAO o = new OrderDAO();
        ArrayList<Order> list = o.getOrder();
        for (Order o1 : list) {
            System.out.println(o1);
        }
    }
}
