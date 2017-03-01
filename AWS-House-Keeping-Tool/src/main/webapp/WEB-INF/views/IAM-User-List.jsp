<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H6>Welcome ${name}</H6>
	<p>
		<font color="red">${errorMessage}</font>
	</p>

	


	<table class="table table-striped">
		<caption>All Users</caption>
		<thead>
			<th>UserName</th>
			<th>CreateDate</th>
			<th>PasswordLastUsed</th>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.userName}</td>
					<td>${user.createDate}</td>
					<td>${user.passwordLastUsed}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>




</div>
<%@ include file="../common/footer.jspf"%>