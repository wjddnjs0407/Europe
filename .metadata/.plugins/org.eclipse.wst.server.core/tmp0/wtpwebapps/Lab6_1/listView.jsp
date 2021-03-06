<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>List View</title>
</head>
<body>
<script type ="text/javascript">
	function deleteConfirm(number){
		if(confirm("Do you want to remove?") == true)
			location.href="DeleteAction.do?number=" + number;
		else
				return;
	}
</script>
	mode : ${mode}
	
	<jsp:include page="menu.jsp" />
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">Periodic Element List</h1>
		</div>
	</div>
	
	<table class="table table-hover">
		<tr>
			<td>Number</td>
			<td>Name</td>
			<td>Symbol</td>
			<td>Weight</td>
			<td>NumberOfNeutrons</td>
			<td>NumberOfProtons</td>
			<td>NumberOfElectrons</td>
			<td>Period</td>
			<td>Group</td>
			<td>Phase</td>
			<td></td>
		</tr>
			<c:forEach var="pe" items="${pList}">
			<tr>
				<td>${pe.getNumber()}</td>
				<td>${pe.getName()}</td>
				<td>${pe.getSymbol()}</td>
				<td>${pe.getWeight()}</td>
				<td>${pe.getNumberOfNeutrons()}</td>
				<td>${pe.getNumberOfProtons()}</td>
				<td>${pe.getNumberOfElectrons()}</td>
				<td>${pe.getPeriod()}</td>
				<td>${pe.getGroup()}</td>
				<td>${pe.getPhase()}</td>
				<td>
					<c:if test="${mode == null }">
					<p><a href="DetailViewAction.do?number=${pe.getNumber()}" class="btn btn-secondary" role="button">detail &raquo;</a>
					</c:if>
					<c:if test="${mode eq 'edit' }">
					<p><a href="EditViewAction.do?number=${pe.getNumber()}" class="btn btn-secondary" role="button">edit &raquo; </a>
					</c:if>
					<c:if test="${mode eq 'delete' }">
					<p><a href="#" onclick="deleteConfirm('${pe.getNumber()}')" class="btn btn-secondary" role="button">delete &raquo;</a>
					</c:if>
				</td>
			</tr>
			</c:forEach>
	</table>
</body>
</html>