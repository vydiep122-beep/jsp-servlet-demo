<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.LocalDateTime,java.time.format.DateTimeFormatter" %>
<%
    String currentTime = LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CodeGym JSP Demo</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin: 0;
               padding: 90px 20px; background: #f8fafc; color: #1f2937; }
        h1 { color: #1b2a7a; }
        .time { color: #f15a24; font-size: 22px; font-weight: bold; }
        a { display: inline-block; margin-top: 16px; padding: 11px 18px;
            color: white; background: #1b2a7a; border-radius: 5px; text-decoration: none; }
    </style>
</head>
<body>
    <h1>Chào mừng tới lớp học Java Web!</h1>
    <p>Đây là trang JSP chạy trên máy chủ Tomcat.</p>
    <p>Thời gian hệ thống hiện tại:</p>
    <p class="time"><%= currentTime %></p>
    <a href="hello">Đi tới HelloServlet</a>
</body>
</html>
