<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H6>Welcome ${name}</H6>
	<p>
		<font color="red">${errorMessage}</font>
	</p>


	<c:forEach var="ec2" items="${ec2instances}">





		<table class="table table-striped">
			<caption>Region: ${ec2.key}</caption>
			<thead>
				<th>InstanceId</th>
				<th>InstanceType</th>
				<th>LaunchTime</th>
				<th>publicIP</th>
			</thead>
			<tbody>
				<c:forEach var="instance" items="${ec2.value}">
					<tr>
						<td>${instance.instanceId}</td>
						<td>${instance.instanceType}</td>
						<td>${instance.launchTime}</td>
						<td>${instance.publicIpAddress}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>



	</c:forEach>



</div>
<%@ include file="../common/footer.jspf"%>