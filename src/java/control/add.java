/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CategoryDAO;
import dao.CustomerDAO;
import dao.ProductDAO;
import dao.SupplierDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Customer;
import model.Product;
import model.Supplier;

/**
 *
 * @author DO THANH TRUNG
 */
public class add extends BaseAuthentication {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Customer c = (Customer) session.getAttribute("account");
        if (c == null) {
            request.setAttribute("name", null);
        } else {
            //get customer
            request.setAttribute("name", new CustomerDAO().getAccount(c.getAccount(), c.getPassword()));
        }
        //list supplier
        request.setAttribute("sups", new SupplierDAO().getSups());
        //list cate
        request.setAttribute("cates", new CategoryDAO().getCategoris());
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pname = request.getParameter("pname");
        int sname = Integer.parseInt(request.getParameter("sname"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        int noi = Integer.parseInt(request.getParameter("noi"));
        String img = request.getParameter("image");
        int cname = Integer.parseInt(request.getParameter("cname"));
        String des = request.getParameter("description");

        Supplier s = new Supplier();
        s.setSupplierID(sname);
        Category c = new Category();
        c.setCategoryID(cname);

        Product p = new Product();
        p.setProductName(pname);
        p.setSupplier(s);
        p.setQuantity(quantity);
        p.setPrice(price);
        p.setNumberOfImport(noi);
        p.setImagePath(img);
        p.setCategory(c);
        p.setDescription(des);

        ProductDAO pdao = new ProductDAO();
        pdao.insertProduct(p);
        response.sendRedirect("listProduct");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
