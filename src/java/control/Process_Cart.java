/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;
import model.Product_Cart;

/**
 *
 * @author DO THANH TRUNG
 */
public class Process_Cart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean check = false;
        //int id = Integer.parseInt(request.getParameter("productID"));
        HttpSession session = request.getSession(true);
        if (session.getAttribute("cart") == null) {
            ArrayList<Product_Cart> pcart = new ArrayList<>();
            //ArrayList<Product_Cart> pcart1 = new ArrayList<>();
            Product p = new ProductDAO().getProduct(Integer.parseInt(request.getParameter("productID")));
            Product_Cart pc = new Product_Cart();
            //Product_Cart pc1 = new Product_Cart();
            pc.setProduct(p);
            pc.setQuantity(1);
            pcart.add(pc);
            session.setAttribute("cart", pcart);
        } else {
            ArrayList<Product_Cart> pcart = (ArrayList<Product_Cart>) session.getAttribute("cart");
            for (Product_Cart product_Cart : pcart) {
                if (product_Cart.getProduct().getProductID() == Integer.parseInt(request.getParameter("productID"))) {
                    product_Cart.setQuantity(product_Cart.getQuantity() + 1);
                    check = true;
                }
            }
            if (!check) {
                Product p = new ProductDAO().getProduct(Integer.parseInt(request.getParameter("productID")));
                Product_Cart pc = new Product_Cart();
                pc.setProduct(p);
                pc.setQuantity(1);
                pcart.add(pc);
            }
            session.setAttribute("cart", pcart);
        }
        response.sendRedirect("homepage");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
