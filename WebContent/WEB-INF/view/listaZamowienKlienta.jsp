<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Mieszkanow</title>
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
	<h5>Wszystkich zamowien klienta ID : ${id} </h5>

	<div id="container">

		<table>
			<tr>
				<th>Data zlozenia</th>
				<th>Data rozpoczecia</th>
				<th>Data zakonczenia</th>
				<th>Stan zamowienia</th>
				<th>Wymagania dodatkowe</th>
				<th>Praca Domowa</th>

			</tr>
			<c:forEach var="temp" items="${zamowienie}">
				<tr>
					
					<td>${temp.dataZlozenia}</td>
					<td>${temp.dataRozpoczecia}</td>
					<td>${temp.dataZakonczenia}</td>
					<td>${temp.stan}</td>
					<td>${temp.wymaganieDodatkowe}</td>
					<td>${temp.pracaDomowa.nazwa}</td>
					
				</tr>

			</c:forEach>
		</table>
		<br> <br>
		
		
	</div>


</body>
</html>