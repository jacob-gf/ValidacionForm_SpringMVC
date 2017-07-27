<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

    </head>

    <body>
        <h1>Resultados del formulario</h1>
        
        <ul>
            <li>Nombre : <c:out value="${nombre}"/></li>
            <li>Apellido : <c:out value="${apellido}"/></li>
            <li>Pais : <c:out value="${pais}"/></li>s
        </ul>
    </body>
</html>
