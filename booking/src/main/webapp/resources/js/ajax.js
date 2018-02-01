	// pathname is contextRoot/path/path/ so we want to get [1] 
    // that is where contextRoot is
	// [0] has "" as a result of split 
	var contextRoot = "/" + window.location.pathname.split( '/' )[1];
	
function searchRoute(){
   	var dataToSend = JSON.stringify(serializeObject($('#bookingSearch')));
   	var dataObj = serializeObject($('#bookingSearch'));
   	//var dataToSend = serializeObject($('#bookingSearch'));
   	
   	var trip=$("#trip").val();
    var fromport=$("#fromport").val();
    var toport=$("#toport").val();
    var departdate=$("#departdate").val();
    var returndate=$("#returndate").val();
    var travelernumber=$("#travelernumber").val();
    $('#content').html("");
   	var $table = $("<table width=1024px border=1>").appendTo($("#content")); 

$("<tr>").appendTo($table)               
.append($("<td colspan=\"8\" class=\"section\">").text("List of available trains:"));
   	$("<tr class=\"tableheader\">").appendTo($table)               
    .append($("<td>").text("No"))  
    .append($("<td>").text("Train"))
    .append($("<td>").text("Class"))
    .append($("<td>").text("From"))
    .append($("<td>").text("To"))
    .append($("<td>").text("Depart Time"))
   	.append($("<td>").text("Arrival Time"))
   	.append($("<td>").text("Price One Way/Roud Trip"));
   	 $.ajax({
		type: 'GET',
		url: contextRoot + '/searchschedule?trip='+ trip +'&fromport=' + fromport +'&fromport=' + fromport 
		+'&toport=' + toport +'&departdate=' + departdate +'&returndate=' + returndate +'&travelernumber=' + travelernumber,
		dataType: "json",           // Accept header
// 		data:dataToSend,
 		contentType: 'application/json',   // Sends - Content-type
		success: function(routes){
			for (var i = 0; i < routes.length; i++) {
			
			$("<tr>").appendTo($table)               
            .append($("<td>").text(i + 1))  
            .append($("<td>").text(routes[i].train.name))
            .append($("<td>").text(routes[i].train.type))
            .append($("<td>").text(routes[i].source.name))
            .append($("<td>").text(routes[i].destination.name))
            .append($("<td>").text(routes[i].departureDate.year + "-" + routes[i].departureDate.month + "-" + routes[i].departureDate.day))
            .append($("<td>").text(routes[i].arrivalDate.year + "-" + routes[i].arrivalDate.month + "-" + routes[i].arrivalDate.day))
            .append($("<td>").text(routes[i].priceOneWay + "/" + routes[i].priceRoundWay));
			}
		},
 
		error: function(errorObject ){	
			alert("error");
 		}
	});
}


make_hidden = function(id) {
    var e = document.getElementById(id);
        e.style.display = 'none';
        }	   

make_visible = function(id) {
    var e = document.getElementById(id);
    e.style.display = 'block';
 }	   

// Translate form to array
// Then put in JSON format
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

  