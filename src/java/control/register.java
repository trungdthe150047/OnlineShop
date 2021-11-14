/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
public class register extends HttpServlet {

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
        request.getRequestDispatcher("register.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        String account = request.getParameter("account");
        String password = request.getParameter("passWord");
        String confirm = request.getParameter("confirm");
        String name = request.getParameter("name");
        boolean gender = request.getParameter("gender").equals("male");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        Date dob = Date.valueOf(request.getParameter("dob"));
        String address = request.getParameter("address");
        
        if(!password.equals(confirm)){
            response.sendRedirect("register.jsp");
        }

        Customer c = new Customer(account, password, name, gender, phoneNumber, email, dob, address);
        CustomerDAO cdao = new CustomerDAO();
        cdao.insertAccRole(c);
        cdao.insert(c);
        
        Customer clogin = cdao.getAccount1(account, password);
        session.setAttribute("account", clogin);        
        response.sendRedirect("homepage");
        //response.sendRedirect("login");
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
