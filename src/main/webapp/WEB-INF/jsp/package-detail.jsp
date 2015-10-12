<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<h1>${package.packageNumber}</h1>

<c:forEach items="${package.applications}" var="application">

	<h1>${application.name}</h1>
	<p>${application.version}</p>

	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${application.parameters}" var="parameter1">
				<tr>
					<td>${parameter1.parameterName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</c:forEach>
