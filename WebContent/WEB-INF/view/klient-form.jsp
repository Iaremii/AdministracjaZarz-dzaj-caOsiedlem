<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nowe zamowienie</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-zamowienie-style.css">
	
<style type="text/css">
.error {
	color: red
	
}	</style>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Stworzenie nowego klienta</h2>
		</div>
	</div>
	<div id="container">

		<form:form action="saveOsoba" modelAttribute="osoba"
			method="POST">
			<table>
				<tbody>

					<tr>
						<td><label>Imie</label></td>
						<td><form:input path="imie" /></td>
						<td><form:errors path="imie" cssClass="error" /></td>
						
					</tr>
					<tr>
						<td><label>Nazwisko</label></td>
						<td><form:input path="nazwisko" /></td>
						<td><form:errors path="nazwisko" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label>Telefon</label></td>
						<td><form:input path="telefon" /></td>
						<td><form:errors path="telefon" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label>Ulica</label></td>
						<td><form:input path="ulica" /></td>
						<td><form:errors path="ulica" cssClass="error" /></td>
						
					</tr>
					<tr>
						<td><label>Numer Domu</label></td>
						<td><form:input path="nrDomu" /></td>
						<td><form:errors path="nrDomu" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label>Numer Mieszkania</label></td>
						<td><form:input path="nrMieszkania" /></td>
						<td><form:errors path="nrMieszkania" cssClass="error" /></td>

					</tr>
					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Zapisz" class="save" /></td>
					
					</tr>
					
				</tbody>
			</table>
		</form:form>
		

		<p>
			<a href="${pageContext.request.contextPath}/zamowienie/list">
				Wróc do listy zamowien</a>

		</p>
		<p>
			<a href="${pageContext.request.contextPath}/zamowienie/showKlients?PracaId=1">
				Wróc do listy klientow</a>

		</p>

	</div>

</body>
</html>