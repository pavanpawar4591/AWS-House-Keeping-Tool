<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H1>Welcome ${firstName}</H1>


	<table class="table table-striped">
		<caption>Your User-List</caption>
		<thead>
			<th>uid</th>
			<th>userName</th>
			<th>password</th>
			<th>email</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>createOn</th>
			<th>role</th>
			<th>isActive</th>
			<th>createBy</th>
			<th>updatedOn</th>
			<th>updatedBy</th>
			
			
			
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="delete-user.do?todo=${user.firstName}&lastname=${user.lastName}">Delete</a></td>
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