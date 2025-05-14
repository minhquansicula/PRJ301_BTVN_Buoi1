/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
@WebServlet(name="LoginController", urlPatterns={"/process"})
public class LoginController extends HttpServlet {
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        
        if(userName.equals("admin") && passWord.equals("123")) {
            out.println("Login succesfully");
        } else {
            out.println("Login failed");
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
