<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<table class="table table-bordered table-hover table-striped">
	<thead>
		<tr>
			<th>User name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>
					<a href='<spring:url value="/users/${user.id}.html" />'>
					${user.name}
					</a>
				</td>
			</tr>
		
		</c:forEach>
	</tbody>
</table>