<%@include file="header.jsp"%>
<%@ page import="asd.booking.domain.trip.Port,java.util.List, java.util.ArrayList"%>

<%
    List<Port> portList = (ArrayList<Port>) session.getAttribute("portList");

%>
<h1>See Where the Train Can Take You</h1>
<form action="searchschedule" method="POST">
	<table width="1024px" >
		<tr>
			<td colspan="6" class="section">Book Tickets:</td>

		</tr>
		<tr>
			<td width="16%">Trip</td>
			<td width="20%">From</td>
			<td width="20%">To</td>
			<td width="17%">Depart</td>
			<td width="17%">Return</td>
			<td width="10%">Traveler</td>
		</tr>
		<tr>
            <td><select name="trip" style="width:140px !important;">
                    <option value="oneway" selected>One Way</option>
                    <option value="roundtrip">Round Trip</option>
                </select>
            <td><select name="fromport" style="width:170px !important;">
                    <%
                        for (int i = 0; i < portList.size(); i++) {
                            Port port = portList.get(i);
                    %>
                    <option value="<%=port.getId()%>"><%=port.getName()%></option>
                    <%
                       } 
                    %>
                </select></td>
            <td><select name="toport" style="width:170px !important;">
					<%
						for (int i = 0; i < portList.size(); i++) {
							Port port = portList.get(i);
					%>
					<option value="<%=port.getId()%>"><%=port.getName()%></option>
					<%
					   } 
					%>
			</select></td>
            <td><input type="date" name="departdate" ></td>
            <td><input type="date" name="returndate" ></td>
            <td><input type=text" name="travelernumber"></td>
        </tr>

		<tr>
			<td colspan="6" align="right"><input
				type="submit" value="Find Trains"></td>
		</tr>
	</table>
</form>
<%@include file="footer.jsp"%>