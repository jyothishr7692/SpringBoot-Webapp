<%@include file="common/navigation.jspf"%>
<%@include file="common/header.jspf"%>
<div class="container">
	<h2>Enter Todo Details</h2>
	<form:form method="post" modelAttribute="todo">

		<fieldset class="mb-3">
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" />
			<form:errors path="description" cssClass="text-warning" />
		</fieldset>

		<fieldset class="mb-3">
			<form:label path="targetDate">Target Date</form:label>
			<form:input type="text" path="targetDate" />
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>

		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="done" />
		<input type="submit" class="btn btn-success">

	</form:form>
</div>

<%@include file="common/footer.jspf"%>

<script
	src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

<script type="text/javascript">
	$('#targetDate').datepicker({
		format : 'yyyy-mm-dd',
		startDate : '-3d'
	});
</script>


