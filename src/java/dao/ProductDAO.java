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
import model.Product;
import model.Supplier;

/**
 *
 * @author DO THANH TRUNG
 */
public class ProductDAO extends BaseDAO {

    //get product
    public Product getProduct(int id) {
        String sql = "select * from Product where ProductID = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setPrice(rs.getDouble("Price"));
                p.setNumberOfImport(rs.getInt("NumberOfImport"));
                p.setNumberOfSell(rs.getInt("NumberOfSell"));
                p.setImagePath(rs.getString("ImagePath"));

                Supplier s = new Supplier();
                s.setSupplierID(rs.getInt("SupplierID"));

                Category c = new Category();
                c.setCategoryID(rs.getInt("CategoryID"));
                p.setSupplier(s);
                p.setCategory(c);

                p.setDescription(rs.getString("Description"));
                return p;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //paging product
    public ArrayList<Product> getListProducts(int pageindex, int pagesize, String s) {
        String check = "";
        String sql = "";
        ArrayList<Product> listProducts = new ArrayList<>();
        try {
            if (!s.equalsIgnoreCase(check)) {
                sql = "SELECT * FROM Product \n"
                        + "where [ProductName] like '%" + s + "%'\n"
                        + "ORDER BY ProductID\n"
                        + "OFFSET ? ROWS\n"
                        + "FETCH NEXT ? ROWS ONLY";
            } else {
                sql = "SELECT * FROM Product \n"
                        + "ORDER BY ProductID\n"
                        + "OFFSET ? ROWS\n"
                        + "FETCH NEXT ? ROWS ONLY";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, (pageindex - 1) * pagesize);
            statement.setInt(2, pagesize);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));

                Supplier sup = new Supplier();
                sup.setSupplierID(rs.getInt("SupplierID"));
                p.setSupplier(sup);

                p.setQuantity(rs.getInt("Quantity"));
                p.setPrice(rs.getDouble("Price"));
                p.setNumberOfImport(rs.getInt("NumberOfImport"));
                p.setNumberOfSell(rs.getInt("NumberOfSell"));
                p.setImagePath(rs.getString("ImagePath"));

                Category c = new Category();
                c.setCategoryID(rs.getInt("CategoryID"));
                p.setCategory(c);
                p.setDescription(rs.getString("Description"));

                listProducts.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProducts;
    }
    
//    public ArrayList<Product> getListProductsByID(int pageindex, int pagesize, String id) {
//        String check = "";
//        String sql = "";
//        ArrayList<Product> listProducts = new ArrayList<>();
//        try {
//            if (!id.equalsIgnoreCase(check)) {
//                sql = "SELECT * FROM Product \n"
//                        + "where [ProductID] = " + id + "\n"
//                        + "ORDER BY ProductID\n"
//                        + "OFFSET ? ROWS\n"
//                        + "FETCH NEXT ? ROWS ONLY";
//            } else {
//                sql = "SELECT * FROM Product \n"
//                        + "ORDER BY ProductID\n"
//                        + "OFFSET ? ROWS\n"
//                        + "FETCH NEXT ? ROWS ONLY";
//            }
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1, (pageindex - 1) * pagesize);
//            statement.setInt(2, pagesize);
//            ResultSet rs = statement.executeQuery();
//            while (rs.next()) {
//                Product p = new Product();
//                p.setProductID(rs.getInt("ProductID"));
//                p.setProductName(rs.getString("ProductName"));
//
//                Supplier sup = new Supplier();
//                sup.setSupplierID(rs.getInt("SupplierID"));
//                p.setSupplier(sup);
//
//                p.setQuantity(rs.getInt("Quantity"));
//                p.setPrice(rs.getDouble("Price"));
//                p.setNumberOfImport(rs.getInt("NumberOfImport"));
//                p.setNumberOfSell(rs.getInt("NumberOfSell"));
//                p.setImagePath(rs.getString("ImagePath"));
//
//                Category c = new Category();
//                c.setCategoryID(rs.getInt("CategoryID"));
//                p.setCategory(c);
//                p.setDescription(rs.getString("Description"));
//
//                listProducts.add(p);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listProducts;
//    }

    //count product by name -> get number page
    public int countProduct(String s) {
        String sql = "";
        //String check = "";
        try {
            if (!s.equalsIgnoreCase("check")) {
                sql = "SELECT COUNT(*) as total FROM Product where ProductName like '%" + s + "%'";
            } else {
                sql = "SELECT COUNT(*) as total FROM Product ";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //get product join supplier
    public ArrayList<Product> getAllProduct() {
        String sql = "select p.ProductID, p.ProductName, s.CompanyName, p.Quantity, p.Price, p.NumberOfImport, p.NumberOfSell, p.ImagePath, c.CategoryName, p.Description from Product p inner join Supplier s\n"
                + "on p.SupplierID = s.SupplierID inner join Categories c \n"
                + "on p.CategoryID = c.CategoryID ";
        ArrayList<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setPrice(rs.getDouble("Price"));
                p.setNumberOfImport(rs.getInt("NumberOfImport"));
                p.setNumberOfSell(rs.getInt("NumberOfSell"));
                p.setImagePath(rs.getString("ImagePath"));

                Supplier s = new Supplier();
                s.setCompanyName(rs.getString("CompanyName"));

                Category c = new Category();
                c.setCategoryName(rs.getString("CategoryName"));
                p.setSupplier(s);
                p.setCategory(c);
                p.setDescription(rs.getString("Description"));
                products.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

//    public ArrayList<Product> getTop3Product() {
//        String sql = "select top 3 * from Product";
//        ArrayList<Product> products = new ArrayList<>();
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();
//            while (rs.next()) {
//                Product p = new Product();
//                p.setProductID(rs.getInt("ProductID"));
//                p.setProductName(rs.getString("ProductName"));
//                p.setQuantity(rs.getInt("Quantity"));
//                p.setPrice(rs.getDouble("Price"));
//                p.setNumberOfImport(rs.getInt("NumberOfImport"));
//                p.setNumberOfSell(rs.getInt("NumberOfSell"));
//                p.setImagePath(rs.getString("ImagePath"));
//
//                Supplier s = new Supplier();
//                s.setSupplierID(rs.getInt("SupplierID"));
//
//                Category c = new Category();
//                c.setCategoryID(rs.getInt("CategoryID"));
//                p.setSupplier(s);
//                p.setCategory(c);
//                p.setDescription(rs.getString("Description"));
//                products.add(p);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return products;
//    }
    //add product
    public int insertProduct(Product p) {
        int n = 0;
        try {
            String sql = "INSERT INTO [dbo].[Product]\n"
                    + "           ([ProductName]\n"
                    + "           ,[SupplierID]\n"
                    + "           ,[Quantity]\n"
                    + "           ,[Price]\n"
                    + "           ,[NumberOfImport]\n"
                    + "           ,[NumberOfSell]\n"
                    + "           ,[ImagePath]\n"
                    + "           ,[CategoryID]\n"
                    + "           ,[Description])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,0\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, p.getProductName());
            statement.setInt(2, p.getSupplier().getSupplierID());
            statement.setInt(3, p.getQuantity());
            statement.setDouble(4, p.getPrice());
            statement.setInt(5, p.getNumberOfImport());
            statement.setString(6, p.getImagePath());
            statement.setInt(7, p.getCategory().getCategoryID());
            statement.setString(8, p.getDescription());
            n = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;

    }

    public int updateProduct(Product p) {
        int n = 0;
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [ProductName] = ?\n"
                    + "      ,[SupplierID] = ?\n"
                    + "      ,[Quantity] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[NumberOfImport] = ?\n"
                    + "      ,[CategoryID] = ?\n"
                    + "      ,[Description] = ?\n"
                    + " WHERE ProductID = ?";
            PreparedStatement state = connection.prepareStatement(sql);
            state.setString(1, p.getProductName());
            state.setInt(2, p.getSupplier().getSupplierID());
            state.setInt(3, p.getQuantity());
            state.setDouble(4, p.getPrice());
            state.setInt(5, p.getNumberOfImport());
            state.setInt(6, p.getCategory().getCategoryID());
            state.setString(7, p.getDescription());
            state.setInt(8, p.getProductID());
            n = state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    //update NumberOfImport && NumberOfSell
    public int updateNos(Product p) {
        int n = 0;
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [NumberOfImport] = ?\n"
                    + "      ,[NumberOfSell] = ?\n"
                    + " WHERE ProductID = ?";
            PreparedStatement state = connection.prepareStatement(sql);
            state.setInt(1, p.getNumberOfImport());
            state.setInt(2, p.getNumberOfSell());
            state.setInt(3, p.getProductID());
            n = state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int deleteProduct(int id) {
        int n = 0;
        try {
            String sql = "DELETE FROM [dbo].[Product]\n"
                    + "      WHERE ProductID = ?";
            PreparedStatement state = connection.prepareStatement(sql);
            state.setInt(1, id);
            n = state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public ArrayList<Product> getListProductsByName(String txtSearch) {
        ArrayList<Product> listProducts = new ArrayList<>();
        String query = "select * from Product where ProductName like ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,"%"+txtSearch+"%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));

                Supplier sup = new Supplier();
                sup.setSupplierID(rs.getInt("SupplierID"));
                p.setSupplier(sup);

                p.setQuantity(rs.getInt("Quantity"));
                p.setPrice(rs.getDouble("Price"));
                p.setNumberOfImport(rs.getInt("NumberOfImport"));
                p.setNumberOfSell(rs.getInt("NumberOfSell"));
                p.setImagePath(rs.getString("ImagePath"));

                Category c = new Category();
                c.setCategoryID(rs.getInt("CategoryID"));
                p.setCategory(c);
                p.setDescription(rs.getString("Description"));

                listProducts.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProducts;
    }

    public static void main(String[] args) {
        //new ProductDAO().countProduct();
//        ArrayList<Product> produ = new ProductDAO().getAllProduct();
//        System.out.println(produ.size());
//        Supplier s = new Supplier();
//        s.setSupplierID(4);
//        Category c = new Category();
//        c.setCategoryID(5);
//        Product p = new Product(33, "Air Jordan ", s, 60, 544, 60, "diorjdlow.png", c, "Shoe for sadas");
//
//        new ProductDAO().updateProduct(p);
    }

}
