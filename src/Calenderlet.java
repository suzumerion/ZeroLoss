package controller;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalendarServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        LocalDate today = LocalDate.now();

        request.setAttribute("today", today);

        RequestDispatcher dispatcher =
                request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}