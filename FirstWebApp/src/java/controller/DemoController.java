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
@WebServlet(name = "DemoController", urlPatterns = {"/DemoController"})
public class DemoController extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        try {
            String firstValueRaw = request.getParameter("firstvalue"); //String
            String secondValueRaw = request.getParameter("secondvalue");
            String caculateRaw = request.getParameter("calculator");

            int firstValue = Integer.parseInt(firstValueRaw);
            int secondValue = Integer.parseInt(secondValueRaw);
            int result = 0;
            if (caculateRaw.equals("plus")) {
                result = firstValue + secondValue;
            } else if (caculateRaw.equals("minus")) {
                result = firstValue - secondValue;
            }
            
            out.println(result);
        } catch (Exception e) {
           out.println("Enter the number.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
