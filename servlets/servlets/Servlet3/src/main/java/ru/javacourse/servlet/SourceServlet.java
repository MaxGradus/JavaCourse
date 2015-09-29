package ru.javacourse.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SourceServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        if(request.getParameter("redirect")!=null) { // проерка, если параметр равен "redirect" то тогда происходит переход на TargetServlet
            response.sendRedirect("TargetServlet");
        } else { // если параметра redirect нет, то переходим к TargetServlet(тот же ресурс)
            getServletContext().getRequestDispatcher("/TargetServlet").forward(request, response);
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

}
