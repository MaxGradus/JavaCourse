package ru.javacourse.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**Суть примера - в первом сервлете мы получаем параметр из запроса и помещаем его
 * 1) в сессию 2) в контекст. Затем во втором сервлете мы получаем атрибут (который мы сами же и положили)
 * 1) из сессии 2) из контекста. И выводим их на страницу
 * После того как параметры будут переданы сервлету GetInfo2, попробуй открыть новую сессию - т.е.
 * запусти еще один браузер и перейди по ссылке http://localhost:8080/servlet-session/GetInfo2
 * Отсюда вывод: Сервлет сессия одна единственная для каждого пользователя, а сервлет контекст один для всех пользователей!
 * */

public class GetInfo1 extends HttpServlet {

    public static final String PARAMETER_SESSION = "paremeterSession";
    public static final String PARAMETER_CONTEXT = "paremeterContext";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Получаем параметр из запроса
        String param = request.getParameter("parameter");
        // Запоминаем параметр в сессии
        HttpSession session = request.getSession(true); // true - значит если сессия не была создана, то она будет создана
        session.setAttribute(PARAMETER_SESSION, param);

        getServletContext().setAttribute(PARAMETER_CONTEXT, param);

        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetInfo1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetInfo1</h1>");
            out.println("<a href='GetInfo2'>Show parameter</a>");
            out.println("</body>");
            out.println("</html>");
        } finally { 
            out.close();
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 
}
