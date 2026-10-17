package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String now = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"vi\">");
            out.println("<head><meta charset=\"UTF-8\"><title>Hello Servlet</title></head>");
            out.println("<body style=\"font-family:Arial,sans-serif;text-align:center;margin-top:80px;background:#f8fafc\">");
            out.println("<h1 style=\"color:#1b2a7a\">Chào mừng bạn đến với Servlet đầu tiên!</h1>");
            out.println("<p>Thời gian hệ thống hiện tại: <strong>" + now + "</strong></p>");
            out.println("<p><a href=\"index.jsp\">Quay lại trang chủ JSP</a></p>");
            out.println("</body></html>");
        }
    }
}
