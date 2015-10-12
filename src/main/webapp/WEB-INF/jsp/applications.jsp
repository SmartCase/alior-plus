<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

Produkcja
<table class="table table-bordered table-hover table-striped">
	<thead>
		<tr></tr>
		<tr>
			<th>Application Name</th>
			<th>Application Version</th>
			<th>Application Environment</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${applications}" var="application">
			<tr>
				<td>${application.name}</td>
				<td>${application.version}</td>
				<td>${application.environment}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

