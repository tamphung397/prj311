<%-- 
    Document   : Bai16
    Created on : Aug 15, 2020, 5:48:28 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
        It's from the original page
        <%--<jsp:forward page="forward.jsp"></jsp:forward >--%>
        <%
              // request.getRequestDispatcher("forward.jsp").forward(request, response);
               response.sendRedirect("redirect.jsp");
        %>
    </body>
</html>
