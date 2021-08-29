package yuldashev.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class MyOwnServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionParam = request.getParameter("action");

        if(actionParam != null){
            //response.sendRedirect("https://www.google.com");

            switch (actionParam){
                case "redirect":
                    response.sendRedirect("/someJsp.jsp");
                    break;

                case "forward":
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/someJsp.jsp");
                    dispatcher.forward(request, response);
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
