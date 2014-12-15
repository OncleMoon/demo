$(document).ready(function() {
	$("#login").click(function() {
		$.ajax({
	        url: '/user/login',
	        type: 'post',
	        dataType: 'json',
	        data: $( "#user" ).serialize(),
	        success: function(data) {
	                  
	                 }
	    });
		
		
	});
});