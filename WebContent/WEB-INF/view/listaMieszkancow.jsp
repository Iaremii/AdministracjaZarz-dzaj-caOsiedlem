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
	<h5>Lista klientow :</h5>

	<div id="container">

		<table>
			<tr>
				<th>Imie</th>
				<th>Nazwisko</th>
				<th>Ttelefon</th>
				<th>Ulica</th>
				<th>NrDomu</th>
				<th>NrMieszkania</th>
				<th>Opcje</th>
			</tr>

			<c:forEach var="temp" items="${lista}">
				<tr>

					<c:url var="getKlientLink" value="/zamowienie/showFormForAdd">
						<c:param name="OsobaId" value="${temp.idOsoba}" />
						<c:param name="PracaId" value="${id}" />
					</c:url>
					<c:url var="getZamowienia" value="/zamowienie/listaZamowienKlienta">
						<c:param name="OsobaId" value="${temp.idOsoba}" />
					</c:url>


					<td>${temp.imie}</td>
					<td>${temp.nazwisko}</td>
					<td>${temp.telefon}</td>
					<td>${temp.ulica}</td>
					<td>${temp.nrDomu}</td>
					<td>${temp.nrMieszkania}</td>

					<td><a href="${getKlientLink}">[Wybrac]</a>
					<a href="${getZamowienia}">[zamowienia]</a></td>



				</tr>

			</c:forEach>
		</table>
		<br> <br>
		<input type="button" value="Dodaj klienta"
			onclick="window.location.href='stworzenieKlienta'; return false;"
			class="add-button" />
		<p>
			<a href="${pageContext.request.contextPath}/zamowienie/showWorks">
				Wróc do listy prac</a> <br> <a
				href="${pageContext.request.contextPath}/zamowienie/list"> Wróc
				do listy zamówien</a>


		</p>

	</div>


</body>
</html>