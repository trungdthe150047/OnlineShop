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
import model.BillDetail;

/**
 *
 * @author DO THANH TRUNG
 */
public class BillDetailDAO extends BaseDAO {

    public ArrayList<BillDetail> getBillDetail(String oid) {
        ArrayList<BillDetail> billdetail = new ArrayList<>();
        try {
            String sql = "select b.OrderID, b.OrderDate, c.CustomerID, c.PhoneNumber, c.Address, c.Name,\n"
                    + "                        b.CustomerID, b.PhoneNumber, b.Address, p.ProductID, p.ProductName,\n"
                    + "						p.Price, bd.quantity, bd.TotalMoney, ct.CategoryName\n"
                    + "                        from [dbo].[Order] b inner join Customer c on b.CustomerID = c.CustomerID \n"
                    + "                        join BillDetail bd on bd.OrderID = b.OrderID\n"
                    + "                        join Product p on p.ProductID = bd.ProductID\n"
                    + "                        join Categories ct on ct.CategoryID = p.CategoryID\n"
                    + "                        where b.OrderID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, oid);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                BillDetail bd = new BillDetail(rs.getInt(1), rs.getInt(2),
                        rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
                billdetail.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billdetail;
    }

    public int insertBillDetail(BillDetail bd) {
        int n = 0;
        try {
            String sql = "insert into BillDetail values(?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bd.getProductID());
            statement.setInt(2, bd.getOrderID());
            statement.setInt(3, bd.getQuantity());
            statement.setDouble(4, bd.getPrice());
            statement.setDouble(5, bd.getTotalMoney());
            n = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public static void main(String[] args) {
//        BillDetailDAO dao = new BillDetailDAO();
//        ArrayList<BillDetail> bd = dao.getBillDetail(1);
//        for (BillDetail o : bd) {
//            System.out.println(o);
//        }
    }
}
