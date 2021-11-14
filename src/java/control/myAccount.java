/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;

/**
 *
 * @author DO THANH TRUNG
 */
public class myAccount extends BaseAuthentication {

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
        String rol = "";
        request.setAttribute("name", new CustomerDAO().getAccount1(c.getAccount(), c.getPassword()));
        for (int i = 0; i < c.getRoles().size(); i++) {
            rol = c.getRoles().get(i).getName();
        }
        System.out.println(rol);
        request.setAttribute("role", rol);
        request.setAttribute("role1", "admin");
        request.getRequestDispatcher("myAccount.jsp").forward(request, response);

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
        int cid = Integer.parseInt(request.getParameter("cid"));
        String account = request.getParameter("account");
        String name = request.getParameter("name");
        boolean gender = request.getParameter("gender").equals("male");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        Customer cus = new Customer(cid, account, name, gender, phone, email);
        new CustomerDAO().updateCustomer(cus);
        response.sendRedirect("myAccount");
        
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
