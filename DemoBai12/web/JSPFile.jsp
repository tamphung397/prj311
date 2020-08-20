<%-- 
    Document   : JSPFile
    Created on : Aug 14, 2020, 8:38:46 PM
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
        <h1>Hello World!</h1>
        <!--Add static content-->
        <%@ include file = "file1.txt"  %>
        <br/>
        <!--Add dynamic content-->
        <jsp:include page="file2.txt"></jsp:include>
            <br/>
            <!--Import file-->
        <% out.print(new java.util.Date());%>
        <br/>
        <%@page import="java.util.Date" %>
        <%= new Date()%>
        <br/>
        <%@page import="demo.Bai15" %>
        <%  out.print(new Bai15().Demo()); %>
    </body>
</html>
