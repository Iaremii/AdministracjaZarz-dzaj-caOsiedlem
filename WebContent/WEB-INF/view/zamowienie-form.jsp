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
}
</style>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Stworzenie nowego zamowienia</h2>
		</div>
	</div>
	<div id="container">

		<form:form action="saveZamowienie" modelAttribute="zamowienie"
			method="POST">
			<table>
				<tbody>
					

					<tr>
						<td><label>Data zlozenia</label></td>
						<td><form:input path="dataZlozenia" /></td>
						<td><form:errors path="dataZlozenia" cssClass="error" /></td>


					</tr>
					<tr>
						<td><label>Data Rozpoczenia</label></td>
						<td><form:input path="dataRozpoczecia" /></td>
						<td><form:errors path="dataRozpoczecia" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label>Data Zakonczenia</label></td>
						<td><form:input path="dataZakonczenia" /></td>

					</tr>
					<tr>
						<td><label>Stan</label></td>
						<td><form:input path="stan" /></td>
						<td><form:errors path="stan" cssClass="error" /></td>

					</tr>
					<tr>
						<td><label>Wymaganie dodatkowe</label></td>
						<td><form:input path="wymaganieDodatkowe" /></td>

					</tr>
					<tr>
						<td><label>Praca ID</label></td>
						<td><form:input path="pracaDomowa.idPracaDomowa" value="${pracaId}" /></td>

					</tr>
					<tr>
						<td><label>Klient ID</label></td>
						<td><form:input path="osoba.idOsoba" value="${osobaId}" /></td>

					</tr>

					
					<tr>
						<td><label></label></td>
						 <td><input type="submit" value="Zapisz" class="save" /></td>
						<!-- <td><a href="${getZam}">zapisz</a></td>-->
					</tr>
				</tbody>
			</table>
		</form:form>


		<p>
			<a href="${pageContext.request.contextPath}/zamowienie/list">
				Wróc do listy zamowien</a>

		</p>

	</div>

</body>
</html>