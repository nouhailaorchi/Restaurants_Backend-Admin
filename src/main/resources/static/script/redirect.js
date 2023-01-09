$('a').removeClass('active');
$('a:contains(Ville)').addClass('active');
$("#main-content").load("page/ville.html");

function show(page) {
	
	if (page == 'ville') {
		$('a').removeClass('active');
		$('a:contains(Ville)').addClass('active');
		$("#main-content").load("page/ville.html");
		event.preventDefault();
	}
	if (page == 'serie') {
		$('a').removeClass('active');
		$('a:contains(Serie)').addClass('active');
		$("#main-content").load("page/serie.html");
		event.preventDefault();
	}
	if (page == 'specialite') {
		$('a').removeClass('active');
		$('a:contains(Specialite)').addClass('active');
		$("#main-content").load("page/specialite.html");
		event.preventDefault();
	}
	if (page == 'zone') {
		$('a').removeClass('active');
		$('a:contains(Zone)').addClass('active');
		$("#main-content").load("page/zone.html");
		event.preventDefault();
	}
	if (page == 'restaurant') {
		$('a').removeClass('active');
		$('a:contains(Restaurant)').addClass('active');
		$("#main-content").load("page/restaurant.html");
		event.preventDefault();
	}
	if (page == 'photo') {
		$('a').removeClass('active');
		$('a:contains(Photo)').addClass('active');
		$("#main-content").load("page/photo.html");
		event.preventDefault();
	}
	if (page == "statistiques") {
		$('a').removeClass('active');
		$('a:contains(Statistiques)').addClass('active');
		$("#main-content").load("page/statistiques.html");
		event.preventDefault();
	}
	
}
