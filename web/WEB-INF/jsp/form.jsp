<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>

    <body>
        <div class="container">
            <div class="row">
                <h1>INGRESSE SUS DATOS</h1>
                
                <form:form method="post" commandName="persona">
                    
                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    
                    <p>
                        <form:label path="nombre">Nombre</form:label>
                        <form:input path="nombre" cssClass="form-control"/>
                        <form:errors path="nombre" element="div" cssClass="alert alert-danger"></form:errors>
                    </p>
                    <p>
                        <form:label path="apellido">Apellido</form:label>
                        <form:input path="apellido" cssClass="form-control"/>
                        <form:errors path="apellido" element="div" cssClass="alert alert-danger"></form:errors>
                    </p>
                    <p>
                        <form:label path="pais">Pais</form:label>
                        <form:select path="pais" cssClass="form-control">
                            <form:option value="0">Seleccione su Pais</form:option>
                            <form:options items="${paisLista}"></form:options>
                        </form:select>
                    </p>
                    <hr/>
                    <input type="submit" value="Enviar" class="form-control" />
                </form:form>
            </div>
        </div>

    </body>
</html>
