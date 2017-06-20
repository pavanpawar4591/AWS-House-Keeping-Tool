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
				<caption>Region: ${ec2.key}   Total Instances = <c:out value="${ec2.value.size()}"/></caption>
				<thead>
					<tr class="info">
						<th>VolumeId</th>
						<th>Size</th>
						<td>SnapshotId</td>
						<th>CreateTime</th>
						<th>State</th>
						<th>Tag</th>
						
					</tr>
				</thead>

				<tbody>
					
					<c:forEach var="instance" items="${ec2.value}">
						<tr>
							<td><a href="https://<c:out value="${ec2.key}"/>.console.aws.amazon.com/ec2/v2/home?region=<c:out value="${ec2.key}"/>#Instances:search=<c:out value="${instance.volumeId}"/>;sort=instanceId "> ${instance.volumeId} </a></td>
							<td>${instance.size}</td>
							<td>${instance.snapshotId}</td>
							<td>${instance.createTime}</td>
							<td>${instance.state}</td>
							<td>${instance.tags}</td>
							<c:set var="total" value="${total + instance.size}" />
						</tr>
					</c:forEach>
				</tbody>
			</table>
Total size =${total} GB   Proposed Cost =$ ${total * 0.10}
		</c:if>

	</c:forEach>



</div> 
<%@ include file="../common/footer.jspf"%>