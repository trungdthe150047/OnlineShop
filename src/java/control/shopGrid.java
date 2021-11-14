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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Product;

/**
 *
 * @author DO THANH TRUNG
 */
public class shopGrid extends HttpServlet{

   

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
            request.setAttribute("name", new CustomerDAO().getAccount(c.getAccount(), c.getPassword()));
        }
        //9 products / trang
        int pagesize = 9;
        String pname = request.getParameter("pname");
        //String id = request.getParameter("id");
        String page = request.getParameter("page");
        if (page == null || page.length() == 0) {
            page = "1";
        }
        //else
        int pageindex = Integer.parseInt(page);
        ProductDAO prodao = new ProductDAO();
        ArrayList<Product> products = prodao.getListProducts(pageindex, pagesize, pname);
        //ArrayList<Product> productss = prodao.getListProductsByID(pageindex, pagesize, id);
        //get number page
        int totalRecords = prodao.countProduct(pname);
        int totalpage = totalRecords % pagesize == 0 ? totalRecords / pagesize : (totalRecords / pagesize) + 1;
        
        request.setAttribute("pname", pname);
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pageindex", pageindex);
        request.setAttribute("products", products);
        //request.setAttribute("productss", productss);
        //request.setAttribute("top3", new ProductDAO().getTop3Product());

        request.getRequestDispatcher("shopGrid.jsp").forward(request, response);
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
