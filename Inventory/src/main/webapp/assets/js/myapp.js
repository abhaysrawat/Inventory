$(function(){
	
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
		case 'Track':
			$('#track').addClass('active');
		case 'Rules':
			$('#rules').addClass('active');
		case 'Contact Us':
			$('#contact').addClass('active');
		default :
			$('#home').addClass('active');	
	
	}
});