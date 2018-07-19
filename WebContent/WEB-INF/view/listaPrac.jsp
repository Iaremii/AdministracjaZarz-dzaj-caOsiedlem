<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Prac</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
</head>
<body>

	<div id="wrapper">

		<div id="header">
			<h3>Administracja zarzadzania osiedlem</h3>
		</div>

	</div>
	<h5>Lista wszystkich oferowanych prac :</h5>

	<div id="container">

		<table>
			<tr>
				<th>Nazwa</th>
				<th>Opis</th>
				<th>Jednostka</th>
				<th>Koszt za jednostke</th>
				<th>Wybor</th>
			</tr>
			<c:forEach var="temp" items="${lista}">
				<tr>

					<c:url var="getPracaLink" value="/zamowienie/showKlients">
						<!-- <c:param name="PracaId" value="${temp.idPracaDomowa}" /> -->
					</c:url>


					<td>${temp.nazwa}</td>
					<td>${temp.opis}</td>
					<td>${temp.jednostka}</td>
					<td>${temp.kosztJednostkowy}</td>
					<td><a href="${getPracaLink}">[Wybrac]</a></td>



				</tr>

			</c:forEach>
		</table>
		<br> <br>
		<p>
			<a href="${pageContext.request.contextPath}/zamowienie/list">
				Wróc do listy zamowien</a>

		</p>

	</div>


</body>
</html>