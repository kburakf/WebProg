<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <form action="home" method="post">
    Username : <input type="text" name="username" size="32"> <br>
    Password : <input type="password" name="password" size="32">

    <input type="submit" value="send">
  </form>
  <% String id = session.getId();%>

  <p> Your session id= <%= id%> </p>

  </body>
</html>