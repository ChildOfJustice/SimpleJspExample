package com.example.TestJsp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LP", value = "/landing-page")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "You are now on the landing page!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if(request.getParameter("redirect") != null && request.getParameter("redirect").equals("true")){
            //response.sendRedirect("https://www.google.com");
            response.sendRedirect("/test-some-jsp");
        }




        String name = request.getParameter("name");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("Your name is: " + name);
        out.println("</body></html>");
        //        response.setContentType("text/html");
//


    }

    public void destroy() {
    }
}