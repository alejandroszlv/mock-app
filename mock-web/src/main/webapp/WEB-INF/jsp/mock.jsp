<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mock Page</title>
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        
        <h3>${dto.name}</h3>
        <%@include file="../jspf/nav-main.jspf" %>
        
        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>
