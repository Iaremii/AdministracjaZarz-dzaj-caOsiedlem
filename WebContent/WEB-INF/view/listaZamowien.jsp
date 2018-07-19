<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista zamowien</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

	<div id="wrapper">

		<div id="header">
			<h3>Administracja zarzadzania osiedlem</h3>
		</div>

	</div>
	<h5>Lista wszystkich zamowien :</h5>



	<div id="container">

		<table>
			<tr>
				<th>Data zlozenia</th>
				<th>Data rozpoczecia</th>
				<th>Data zakonczenia</th>
				<th>Stan zamowienia</th>
				<th>Wymagania dodatkowe</th>
				<th>Praca domowa</th>
				<th>Klient</th>
				<th>Opcje</th>

			</tr>
			<c:forEach var="temp" items="${lista}">
				<tr>
					<c:url var="deleteLink" value="/zamowienie/delete">
						<c:param name="zamowienieId" value="${temp.idZamowienie}" /> 
					</c:url>
					<td>${temp.dataZlozenia}</td>
					<td>${temp.dataRozpoczecia}</td>
					<td>${temp.dataZakonczenia}</td>
					<td>${temp.stan}</td>
					<td>${temp.wymaganieDodatkowe}</td>
					<td>${temp.pracaDomowa.idPracaDomowa}</td>
					<td>${temp.osoba.nazwisko} ${temp.osoba.imie}</td>
					
					<td><a href="${deleteLink}" onclick="return confirm('Napewno chcesz usunac to zamowienia?');">Usun</a></td>
		
				</tr>

			</c:forEach>
		</table>
		<br> <br>
		<!-- 	<input type="button" value="Zloz zamowienie" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
		 -->
		<input type="button" value="Zloz zamowienie"
			onclick="window.location.href='showWorks'; return false;"
			class="add-button" />

	</div>

</body>
</html>