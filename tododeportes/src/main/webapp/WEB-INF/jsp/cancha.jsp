<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cancha Management</title>
</head>
<body>
<h1>Datos cancha</h1>
<form:form action="cancha.do" method="POST" commandName="cancha">
	<table>
		<tr>
			<td>Cancha id</td>
			<td><form:input path="canchaId" /></td>
		</tr>
		<tr>
			<td>Nombre</td>
			<td><form:input path="nombre" /></td>
		</tr>
		<tr>
			<td>Ubicacion</td>
			<td><form:input path="ubicacion" /></td>
		</tr>
		<tr>
			<td>Tipo</td>
			<td><form:input path="tipo" /></td>
		</tr>
				<tr>
			<td>Subtipo</td>
			<td><form:input path="subtipo" /></td>
		</tr>
				<tr>
			<td>Estado</td>
			<td><form:input path="estado" /></td>
		</tr>
				<tr>
			<td>Valor</td>
			<td><form:input path="valor" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Insertar" />
				<input type="submit" name="action" value="Editar" />
				<input type="submit" name="action" value="Borrar" />
				<input type="submit" name="action" value="Buscar" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>Nombre</th>
	<th>Ubicacion</th>
	<th>Tipo</th>
	<th>Subtipo</th>
	<th>Estado</th>
	<th>Valor</th>
	<c:forEach items="${canchaList}" var="cancha">
		<tr>
			<td>${cancha.canchaId}</td>
			<td>${cancha.nombre}</td>
			<td>${cancha.ubicacion}</td>
			<td>${cancha.tipo}</td>
			<td>${cancha.subtipo}</td>
			<td>${cancha.estado}</td>
			<td>${cancha.valor}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>