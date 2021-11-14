/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
import dao.OrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Product_Cart;
import model.Order;

/**
 *
 * @author DO THANH TRUNG
 */
public class OrderProduct extends HttpServlet {

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
        HttpSession session = request.getSession(true);
        Customer c = (Customer) session.getAttribute("account");
        if (c == null) {
            request.setAttribute("name", null);
        } else {
            request.setAttribute("name", new CustomerDAO().getAccount1(c.getAccount(), c.getPassword()));
            response.sendRedirect("homepage");
        }
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
        HttpSession session = request.getSession(true);
        int id = Integer.parseInt(request.getParameter("id"));
        String phone = request.getParameter("number");
        String address = request.getParameter("country_name");
        ArrayList<Product_Cart> pcart = (ArrayList<Product_Cart>) session.getAttribute("cart");
        System.out.println(pcart.size());
        for (int i = 0; i < pcart.size(); i++) {
            int customerID = id;
            //int quantity = pcart.get(i).getProduct().getQuantity();
            int productID = pcart.get(i).getProduct().getProductID();
            double total = pcart.get(i).getProduct().getPrice() * pcart.get(i).getQuantity();
            String phoneNumber = phone;
            Order o = new Order(customerID, productID, total, address, phoneNumber);
            //Order o = new Order(customerID, productID, total, address, phoneNumber, quantity);
            OrderDAO odao = new OrderDAO();
            odao.insertOrder(o);
            pcart.remove(i);

        }
        response.sendRedirect("homepage");
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
