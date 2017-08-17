
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.user" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <body>
        <h1>Summary</h1>
        <%
            user roshan = (user)request.getAttribute("roshan");
        %>
        
       NIC :  <%=roshan.getNIC()%></br></br>
       Full Name :  <%=roshan.getfName()%></br></br>
       Email :  <%=roshan.getEmail()%></br></br>
    </body>
</html>
