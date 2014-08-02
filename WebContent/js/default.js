$(function() {
	
	$("#japanpeople").draggable();
	
	$("#indiapeople").draggable();

	$("#japan").droppable({
		accept : "#japanpeople",
		drop : function(event, ui) {
			$(this).addClass("ui-state-highlight").find("p").html("Dropped!");
		}
	});
	
	$("#india").droppable({
		accept : "#indiapeople",
		drop : function(event, ui) {
			$(this).addClass("ui-state-highlight").find("p").html("Dropped!");
		}
	});
});