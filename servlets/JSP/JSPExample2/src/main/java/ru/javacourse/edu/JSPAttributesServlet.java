/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.javacourse.edu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***/


public class JSPAttributesServlet extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

/**http://localhost:8080/JSPAttributesServlet*/

        request.setAttribute("name", "Georgy");
        request.setAttribute("surname", "Gobozov");

/**если раскоментировать код внизу, то при обращении к http://localhost:8080/form.jsp
 * мы попадем на форму, заполнив поля параметры  попадут через сервлет на страницу index.jsp*/

//        String name = request.getParameter("name");
//        String surname= request.getParameter("surname");
//
//        request.setAttribute("name", name);
//        request.setAttribute("surname", surname);

        RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);

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
