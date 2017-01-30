<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H1>Welcome ${name}</H1>


	<table class="table table-striped">
		<caption>Your User-List</caption>
		<thead>
			<th>uid</th>
			<th>username</th>
			<th>password</th>
			<th>email</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>createON</th>
			<th>role</th>
			<th>active</th>
			
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.firstname}</td>
					<td>${user.lastname}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="delete-user.do?todo=${user.firstname}&lastname=${user.lastname}">Delete</a></td>
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