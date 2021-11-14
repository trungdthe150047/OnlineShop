/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Product_Cart;

/**
 *
 * @author DO THANH TRUNG
 */
public class cart extends HttpServlet {

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
        String option = request.getParameter("option");
        int id = Integer.parseInt(request.getParameter("id"));
        String service = request.getParameter("service");
        HttpSession session = request.getSession(true);
        double cost = Double.parseDouble(request.getParameter("cost"));
        ArrayList<Product_Cart> pcart = (ArrayList<Product_Cart>) session.getAttribute("cart");
        request.setAttribute("list", pcart);
        if (pcart == null) {
            request.setAttribute("totalcost", 0);
            request.setAttribute("list", null);
        } else {
            for (int i = 0; i < pcart.size(); i++) {
                if (!option.equalsIgnoreCase("")) {
                    if (option.equalsIgnoreCase("up")) {
                        if (pcart.get(i).getProduct().getProductID() == id) {
                            pcart.get(i).setQuantity(pcart.get(i).getQuantity() + 1);
                            for (int j = 0; j < pcart.size(); j++) {
                                if (pcart.get(j).getProduct().getProductID() != id) {
                                    cost += pcart.get(j).getProduct().getPrice() * pcart.get(j).getQuantity();
                                }
                            }

                        }
                    }
                    if (option.equalsIgnoreCase("down")) {
                        if (pcart.get(i).getQuantity() != 1) {
                            if (pcart.get(i).getProduct().getProductID() == id) {
                                pcart.get(i).setQuantity(pcart.get(i).getQuantity() - 1);
                                for (int j = 0; j < pcart.size(); j++) {
                                    if (pcart.get(j).getProduct().getProductID() != id) {
                                        cost += pcart.get(j).getProduct().getPrice() * pcart.get(j).getQuantity();
                                    }
                                }

                            }
                        }
                    }
                } else {
                    cost += pcart.get(i).getProduct().getPrice();
                }
            }

            request.setAttribute("list", pcart);
            request.setAttribute("totalcost", cost);

        }
        session.setAttribute("tocost", cost);
        Customer c = (Customer) session.getAttribute("account");
        if (c == null) {
            request.setAttribute("name", null);
        } else {
            request.setAttribute("name", new CustomerDAO().getAccount(c.getAccount(), c.getPassword()));
        }
        request.getRequestDispatcher("cart.jsp").forward(request, response);
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
