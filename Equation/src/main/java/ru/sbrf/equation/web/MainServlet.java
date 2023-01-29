package ru.sbrf.equation.web;

import ru.sbrf.equation.models.QuadraticEquation;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/send")
public class MainServlet extends HttpServlet {
    private QuadraticEquation model;
    String coefA;
    String coefB;
    String coefC;

//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init();
//
//        model = new QuadraticEquation();
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write("Enter coefficients of the quadratic equation:");
//        printWriter.close();
        request.getRequestDispatcher("/equation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if ("submit".equals(action)) {
            coefA = request.getParameter("a");
            coefB = request.getParameter("b");
            coefC = request.getParameter("c");
            model = new QuadraticEquation(coefA, coefB, coefC);

            request.getRequestDispatcher("/send.jsp").forward(request, response);
        }

//        resp.setContentType("text/html");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.write("Hello!");
//        printWriter.close();
    }
}