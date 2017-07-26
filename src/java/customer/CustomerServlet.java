/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import data.CustomerDB;
import data.ZipCodeDB;
import entities.Customer;
import entities.ZipCode;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Roderick Burkhardt
 */
public class CustomerServlet extends HttpServlet
{

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
            throws ServletException, IOException
    {
        String goodUrl = "./index.jsp";
        String badUrl = "./registration.jsp";
        String url = "";
        
        HttpSession session = request.getSession();
        
        String firstname = (String) session.getAttribute("firstname");
        String lastname = (String) session.getAttribute("lastname");
        String address1 = (String) session.getAttribute("address1");
        String address2 = (String) session.getAttribute("address2");
        String zip = (String) session.getAttribute("zip");
        String email = (String) session.getAttribute("email");
        String usrtel = (String) session.getAttribute("usrtel");
        String pw = (String) session.getAttribute("pw");
        String pw2 = (String) session.getAttribute("pw2");
        
        if (firstname != null || lastname != null || address1 != null ||
                zip != null || email != null || pw != null || pw2 != null)
        {
            if (pw == pw2)
            {
                System.out.println("got here");
                ZipCode custZip = ZipCodeDB.getZipCodeData(Integer.decode(zip));
                Customer newCust = new Customer();
                newCust.setCustFname(firstname);
                newCust.setCustLname(lastname);
                newCust.setCustAddress1(address1);
                newCust.setCustAddress2(address2);
                newCust.setZip(custZip);
                newCust.setCustPhone(usrtel);
                newCust.setCustEmail(email);
                newCust.setCustPassword(pw);
                
                CustomerDB.insertCustomer(newCust);
                
                url = goodUrl;
            }
            else
            {
                url = badUrl;
            }
            
            request.getRequestDispatcher(url).forward(request, response);
        }
        else
        {
            request.getRequestDispatcher(badUrl).forward(request, response);
        }
        
    }

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
            throws ServletException, IOException
    {
        doPost(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }

}
