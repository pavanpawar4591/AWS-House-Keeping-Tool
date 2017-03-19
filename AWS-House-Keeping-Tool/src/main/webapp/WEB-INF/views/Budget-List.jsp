<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H6>Welcome ${name}</H6>

	<table class="table table-striped">
		<caption>All Budgets</caption>
		<thead>

			<th>Budget Id</th>
			<th>Budget Start Date</th>
			<th>budgetEndDate</th>
			<th>budgetAmount</th>
			<th>budgetDescription</th>
			<th>budgetConditionalOperator</th>
			<th>accountId</th>

		</thead>
		<tbody>
			<c:forEach items="${budgets}" var="budget">
				<tr>
					<td>${budget.budgetId}</td>
					<td>${budget.budgetStartDate}</td>
					<td>${budget.budgetEndDate}</td>
					<td>${budget.budgetAmount}</td>
					<td>${budget.budgetDescription}</td>
					<td>${budget.budgetConditionalOperator}</td>
					<td>${budget.accountId}</td>

					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="delete-budget.do?&bubgetId=${budget.budgetId}&budgetStartDate=${budget.budgetStartDate}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<a class="btn btn-success" href="add-budget.do">Add New Budget</a>
</div>

<%@ include file="../common/footer.jspf"%>