/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.user;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DK_Roshan
 */

public class control extends HttpServlet{
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String nic = request.getParameter("NIC");
        String fname = request.getParameter("fName");
        String email = request.getParameter("email");
        
        user roshan = new user();
        roshan.setfName(fname);
        roshan.setEmail(email);
        roshan.setNIC(nic);
        request.setAttribute("roshan", roshan);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewResult.jsp");
        dispatcher.forward(request, response);
    }
}
