<%-- 
    Document   : login.jsp
    Created on : Sep 19, 2017, 10:11:46 AM
    Author     : 643507
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <body>
      
        <h1>Login</h1>
        <div>
            <form action="LoginServlet" method="post">
                Username: <input type="text" name="username" value="${username}" ><br>
               Password: <input type="password" name="password" ><br>
                <input type="submit" value="login">
            </form>
            
        </div>
        ${errormessage}
        
</body>
</html>
