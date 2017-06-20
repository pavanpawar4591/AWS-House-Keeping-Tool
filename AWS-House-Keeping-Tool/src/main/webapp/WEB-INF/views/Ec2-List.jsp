<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H6>Welcome ${name}</H6>
	<p>
		<font color="red">${errorMessage}</font>
	</p>


	<c:forEach var="ec2" items="${ec2instances}">

		<c:if test = "${ec2.value.size()!=0}" >
		
				<table class="table table-striped table-bordered table-hover">
				<caption>Region: ${ec2.key}</caption>
				<thead>
					<tr class="info">
						<th>Instance Id</th>
						<th>Instance Type</th>
						<th>Launch Time</th>
						<th>State</th>
					</tr>
				</thead>

				<tbody>
					Total Instances = ${ec2.value.size()}
					<c:forEach var="instance" items="${ec2.value}">
						<tr>
							<td><a href="https://<c:out value="${ec2.key}"/>.console.aws.amazon.com/ec2/v2/home?region=<c:out value="${ec2.key}"/>#Instances:search=<c:out value="${instance.instanceId}"/>;sort=instanceId "> ${instance.instanceId} </a></td>
							<td>${instance.instanceType}</td>
							<td>${instance.launchTime}</td>
							<td>${instance.state.name}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</c:if>

	</c:forEach>



</div>
<%@ include file="../common/footer.jspf"%>