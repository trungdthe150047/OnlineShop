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
import model.Product_Cart;

/**
 *
 * @author DO THANH TRUNG
 */
public class homepage extends HttpServlet {

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
        double cost = 0;
        HttpSession session = request.getSession(true);
        Customer c = (Customer) session.getAttribute("account");
        if (c == null) {
            request.setAttribute("name", null);
        } else {
            request.setAttribute("name", new CustomerDAO().getAccount(c.getAccount(), c.getPassword()));
        }

        ArrayList<Product_Cart> pcart = (ArrayList<Product_Cart>) session.getAttribute("cart");

        if (pcart == null) {
            request.setAttribute("total", 0);
            request.setAttribute("list", null);
        } else {
            for (int i = 0; i < pcart.size(); i++) {
                cost += pcart.get(i).getProduct().getPrice();
            }
            request.setAttribute("list", pcart);
            request.setAttribute("totalcost", cost);
            request.setAttribute("total", pcart.size());
        }

        request.setAttribute("img4", new ProductDAO().getProduct(5));
        request.setAttribute("img3", new ProductDAO().getProduct(4));
        request.setAttribute("img", new ProductDAO().getProduct(2));
        request.setAttribute("img2", new ProductDAO().getProduct(3));
        request.setAttribute("gucciCardigan", new ProductDAO().getProduct(6));
        request.setAttribute("gucciEmbroidered", new ProductDAO().getProduct(7));
        request.setAttribute("versaceIlusSneaker", new ProductDAO().getProduct(8));
        request.setAttribute("reversibleDragonSukajan", new ProductDAO().getProduct(9));
        request.setAttribute("GucciShortDress", new ProductDAO().getProduct(10));
        request.setAttribute("OversizeTshirtWomen", new ProductDAO().getProduct(11));
        request.setAttribute("wideLegJeans", new ProductDAO().getProduct(12));
        request.setAttribute("GucciSlideWomen", new ProductDAO().getProduct(13));
        request.setAttribute("JordanLightSmokeGrey", new ProductDAO().getProduct(14));
        request.setAttribute("GucciBeeStars", new ProductDAO().getProduct(15));
        request.setAttribute("VansCutnPaste", new ProductDAO().getProduct(16));
        request.setAttribute("airforce1", new ProductDAO().getProduct(17));
        request.setAttribute("deptoong", new ProductDAO().getProduct(18));
        request.setAttribute("depbacho", new ProductDAO().getProduct(19));
        request.setAttribute("chaco", new ProductDAO().getProduct(20));

        request.getRequestDispatcher("homePage.jsp").forward(request, response);
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
