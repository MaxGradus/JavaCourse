package ru.javacourse.gradle.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */

@WebServlet(name="myservlet", urlPatterns="/myurl")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println("<html>Hello Servlet<body></body></html>");
        writer.flush();
    }
}
