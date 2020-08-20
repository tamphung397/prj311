<%-- 
    Document   : newjsp
    Created on : Aug 11, 2020, 1:49:42 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello JSP</title>
    </head>
    <body>
        <h1>Hello JSP!</h1>
        <%--<%! public int x = 22; %>--%> 
        <%--<%= new Integer(22)%>--%>
        <!--<br>-->
        <%--<%= new String("aaa")%>--%>
        <!--<br>-->
        <%--<%= new java.util.Date()%>--%>
        <%
//        int x = 25;
//    
//        if(x > 25){
//            out.println("lon hon 25");
//        }else{
//            out.println("nho hon 25");
//        }

            for (int i = 0; i < 10; i++) {
//            out.println("<br/>");
                out.println(i);
                out.println("<br/>");

            }

        %>

        

        <%!
            String message() {
             
                return "I love JSP";
            }
        %>
        <%= message()%>

        <%response.sendRedirect("https://w3layouts.com/");  %>

    </body>
</html>
