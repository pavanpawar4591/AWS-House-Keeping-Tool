<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H1>Welcome ${firstName}</H1>


	<table class="table table-striped">
		<caption>Your Account-List</caption>
		<thead>

			<th>accountId</th>
			<th>createdOn</th>
			<th>createdBy</th>
			<th>updatedOn</th>
			<th>updatedBy</th>
			<th>hspsId</th>
			<th>projectExpireDate</th>
			<th>freeTrialExpireDate</th>
			<th>awsAccountOwnerName</th>
			<th>hspsExpireDate</th>
			<th>emailIdOfOwner</th>
			<th>projectName</th>
			<th>projectId</th>
			<th>accountType</th>
			<th>hspsDescription</th>
			<th>businessUnit</th>
			<th>AWSAccountNumber</th>
			<th>AWSAccountAlias</th>
			<th>AWSAccessKey</th>
			<th>AWSSecretKey</th>

		</thead>
		<tbody>
			<c:forEach items="${accounts}" var="account">
				<tr>
					<td>${account.projectName}</td>
					<td>${account.projectId}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="delete-user.do?todo=${account.projectName}&=$porjectId{account.projectId}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<a class="btn btn-success" href="add-user.do">Add New User</a>
</div>

<%@ include file="../common/footer.jspf"%>