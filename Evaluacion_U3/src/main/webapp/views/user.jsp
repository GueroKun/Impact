
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
    <jsp:include page="/layouts/head.jsp"/>

</head>
<body>

<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
    <div class="container-fluid">
        <span class="navbar-brand mb-0 h1">Bienvenido "${user.username}"</span>
        <form action="/api/auth/logout">
            <button class="btn btn-success">Cerrar sesión</button>
        </form>
    </div>
</nav>


<div class="row">
    <div class="col text-center mt-5">
        <h2>Incidentes</h2>
        <p>Ya quiero pasar XD</p>
        <div class="card">
            <div class="card-header">
                <div class="row">
                    <div class="col">Listado de incidentes</div>
                    <div class="col text-end">
                        <a href="/leak/view-create" class="btn btn-outline-success btn-sm">
                            REGISTRAR
                        </a>
                    </div>
                </div>
            </div>
            <div class="card-body">
                <table class="table table-stripped">
                    <thead>
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Titulo</th>
                    <th>Descripcion</th>
                    <th>Estado</th>
                    </thead>
                    <tbody>
                    <s:forEach var="leak" items="${leaks}" varStatus="s">
                        <tr>
                            <td>
                                <s:out value="${s.count}"/>
                            </td>
                            <td>
                                <s:out value="${leak.name}"/>
                            </td>
                            <td>
                                <s:out value="${leak.title}"/>
                            </td>
                            <td>
                                <s:out value="${leak.description}"/>
                            </td>
                            <td>
                                <s:out value="${leak.status}"/>
                            </td>
                        </tr>
                    </s:forEach>
                    <tr>
                        <td colspan="6">
                            Sin registros
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/layouts/footer.jsp"/>
</body>
</html>
