<%@include file="header.jsp"%>
<%@ page import="asd.booking.domain.User,asd.booking.domain.Customer"%>

<%
	User currentUser = (User) session.getAttribute("currentSessionUser");
Customer customer = (Customer) session.getAttribute("currentSessionCustomer");
%>

<h1>Welcome
<%=customer.getFirstName() + " " + customer.getLastName()%>
</h1>
<%@include file="footer.jsp"%>