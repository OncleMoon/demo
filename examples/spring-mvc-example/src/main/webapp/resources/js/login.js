$(document).ready(function() {
	
	$("li").click(function(){
		$("li").removeClass("active");
		$(this).addClass("active");
		$("#content > div").children("div").remove();
		
		var href = $(this).children("a").attr("href");
		if(href == "#movie") {
			$("#movie").load("main/movie");
		} else if(href == "#admin") {
			$("#admin").load("main/admin");
		}  else if(href == "#computation") {
			$("#computation").load("main/computation");
		} else if(href == "#serving") {
			$("#serving").load("main/serving");
		} else if(href == "#more") {
			$("#more").load("main/more");
		}
	});
});