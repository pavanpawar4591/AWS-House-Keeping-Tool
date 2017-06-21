<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H2>Welcome ${name}</H2>
	</br>
	<p>
		<font color="red">${errorMessage}</font>
	</p>


	<display:table name="users" id="row" sort="list" uid="one"
		pagesize="10" requestURI="listawsIAM.do"
		class="table table-striped table-bordered table-hover">

		<display:column property="userName" />
		<display:column sortable="true" title="CreateDate"
			property="createDate" />
		<display:column property="passwordLastUsed" />

	</display:table>



</div>
<%@ include file="../common/footer.jspf"%>