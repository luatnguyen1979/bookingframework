<%@include file="header.jsp"%>
<%@ page import="asd.booking.domain.User"%>

<%
	User currentUser = (User) session.getAttribute("currentSessionUser");
%>

<h1>Welcome
<%=currentUser.getFirstName() + " " + currentUser.getLastName()%>
</h1>
<%@include file="footer.jsp"%>