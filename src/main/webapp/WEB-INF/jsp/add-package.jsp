<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<form:form commandName="package" cssClass="form-horizontal">

	<div class="form-group">
		<label for="packageNumber" class="col-sm-2 control-label">Package
			number</label>
		<div class="col-sm-10">
			<form:input path="packageNumber" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="packageDate" class="col-sm-2 control-label">Package
			date</label>
		<div class="col-sm-10">
			<fmt:formatDate pattern='yyyy-MM-dd' type='date'
				value='${packageDate}' var="formattedDate" />
			<form:input path="packageDate" id="packageDate" name="packageDate"
				data-format="yyyy-MM-dd" type="text" value="${formattedDate}" />
		</div>
	</div>

	<div class="form-group">
		<div>
			<input type="submit" value="Save" class="btn btn-lg btn-primary" />
		</div>
	</div>

</form:form>