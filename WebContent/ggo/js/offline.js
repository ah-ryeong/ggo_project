$(function(){
	var current_slider="1";
	$(".offline_tab > li").click(function(){
		$(".offline_tab > li").removeClass("active");
		$(this).addClass("active");
		console.log($(this).data("num"));
		if(current_slider != $(this).data("num")) {
			current_slider = $(this).data("num");
			if(current_slider == "1") {
				$(".container4").hide();
				$(".container3").show();
				swiper3.update();
			} else {
				$(".container3").hide();
				$(".container4").show();
				swiper4.update();
			}
		}
	});
});
var swiper3 = new Swiper(".swiper-container3", {
	slidesPerView: 2,
    spaceBetween: 0,
	breakpoints: {
		1024: {
			slidesPerView: 1,
			spaceBetween: 0,
		},
		1248: {
			slidesPerView: 2,
			spaceBetween: 0,
		},
	},
	navigation: {
		nextEl: ".a_arrow1 .next",
		prevEl: ".a_arrow1 .prev",
	},

	pagination: {
		el: ".offline_bar",
		clickable: true,
	},

});
var swiper4 = new Swiper(".swiper-container4", {
	slidesPerView: 2,
    spaceBetween: 0,
	slidesPerGroup: 2,
	breakpoints: {
		1024: {
			slidesPerView: 1,
			spaceBetween: 0,
			slidesPerGroup: 1,
		},
		1248: {
			slidesPerView: 2,
			spaceBetween: 0,
			slidesPerGroup: 2,
		},
	},
	navigation: {
		nextEl: ".a_arrow2 .next",
		prevEl: ".a_arrow2 .prev",
	},
	pagination: {
		el: ".offline_bar1",
		clickable: true,
	},
});