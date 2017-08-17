
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Information</title>
    </head>
    <body>
        <h1>User Information</h1>
        <form method="POST" action="control">
            <input type="text" name="NIC" id="NIC" placeholder="NIC"/><br><br>
            <input type="text" name="fName" id="fName" placeholder="Full Name"/><br><br>
            <input type="email" name="email" id="email" placeholder="Email"/><br><br>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>

