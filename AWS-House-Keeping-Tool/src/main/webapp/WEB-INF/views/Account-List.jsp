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
			<th>awsAccountNumber</th>
			<th>awsAccountAlias</th>
			<th>awsAccessKey</th>
			<th>awsSecretKey</th>
			<th>awsAccessKeyXXXX</th>
			<th>awsSecretKeyXXXX</th>
		</thead>
		<tbody>
			<c:forEach items="${accounts}" var="account">
				<tr>
					<td>${account.accountId}</td>
					<td>${account.createdOn}</td>
					<td>${account.createdBy}</td>
					<td>${account.updatedOn}</td>
					<td>${account.updatedBy}</td>
					<td>${account.hspsId}</td>
					<td>${account.projectExpireDate}</td>
					<td>${account.freeTrialExpireDate}</td>
					<td>${account.awsAccountOwnerName}</td>
					<td>${account.hspsExpireDate}</td>
					<td>${account.emailIdOfOwner}</td>
					<td>${account.projectName}</td>
					<td>${account.projectId}</td>
					<td>${account.accountType}</td>
					<td>${account.hspsDescription}</td>
					<td>${account.businessUnit}</td>
					<td>${account.awsAccountNumber}</td>
					<td>${account.awsAccountAlias}</td>
					<td>${account.awsAccessKey}</td>
					<td>${account.awsSecretKey}</td>
					<td>${account.awsAccessKeyXXXX}</td>
					<td>${account.awsSecretKeyXXXX}</td>

					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="delete-account.do?&projectName=${account.projectName}&porjectId=${account.projectId}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<a class="btn btn-success" href="add-account.do">Add New Account</a>
</div>

<%@ include file="../common/footer.jspf"%>