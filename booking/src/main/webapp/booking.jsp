<%@include file="header.jsp"%>
<h1>See Where the Train Can Take You</h1>
<form action="registercustomer" method="POST">
	<table width="1024px" border=1>
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
            <td><select name="from" style="width:170px !important;">
                    <option value="BRL">Burlington, IA - BRL</option>
                    <option value="MTP">Mt. Pleasant, IA - MTP</option>
                    <option value="US">Union Station</option>    
                </select></td>
            <td><select name="to" style="width:170px !important;">
                    <option value="BRL">Burlington, IA - BRL</option>
                    <option value="MTP">Mt. Pleasant, IA - MTP</option>
                    <option value="US">Union Station</option>    
                </select></td>
            <td><input type="date" name="depart" ></td>
            <td><input type="date" name="return" ></td>
            <td><input type=text" name="traveler"></td>
        </tr>

		<tr>
			<td colspan="6" align="right"><input
				type="submit" value="Find Trains"></td>
		</tr>
	</table>
</form>
<%@include file="footer.jsp"%>