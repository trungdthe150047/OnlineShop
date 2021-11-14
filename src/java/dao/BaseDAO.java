/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THANH TRUNG
 */
public class BaseDAO {
    protected Connection connection;

    public BaseDAO() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectPRJ301";
            String user = "sa";
            String pass = "123456";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public static ResultSet getData(String sql) {
//        ResultSet rs = null;
//        Statement state;
//        try {
//            state = connection.createStatement(
//                    ResultSet.TYPE_SCROLL_SENSITIVE,
//                    ResultSet.CONCUR_UPDATABLE);
//            rs = state.executeQuery(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return rs;
//    }

    public static void main(String[] args) {
        new BaseDAO();
        System.out.println("connected");
    }
}
