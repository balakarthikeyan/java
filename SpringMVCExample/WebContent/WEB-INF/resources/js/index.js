jQuery(document).ready(function($) {
 
	alert("This message is coming from 'crunchify.js' file...")
 
});

function crunchifyAjax() {
    $.ajax({
        url : 'ajaxtest.html',
        success : function(data) {
            $('#result').html(data);
        }
    });
}