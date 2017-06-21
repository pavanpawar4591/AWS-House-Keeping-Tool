<%@page import="java.util.ArrayList"%>
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H1>Welcome ${name}</H1>

Welcome to AWS House Keeping tool Super Admin



<% request.setAttribute( "test", new ArrayList<String>()); %>

<display:table name="test">
  <display:column property="id" title="ID" />
  <display:column property="name" />
  <display:column property="email" />
  <display:column property="status" />
  <display:column property="description" title="Comments"/>
</display:table>

</div>

<%@ include file="../common/footer.jspf"%>