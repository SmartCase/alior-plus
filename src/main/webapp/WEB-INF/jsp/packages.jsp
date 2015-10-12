<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<table class="table table-bordered table-hover table-striped">
	<thead>
		<tr>
			<th>Package number</th>
			<th>Package Date</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${packages}" var="package">
			<tr>
				<td>
				<a href='<spring:url value="/packages/${package.id}.html" />'>
				${package.packageNumber}
				</a>
				</td>
				<td>${package.packageDate}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>