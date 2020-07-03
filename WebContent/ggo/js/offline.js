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

//var map = new naver.maps.Map('map', {
//   center : new naver.maps.LatLng(37.335537, 127.100666),
//   zoom : 15
//});

var marker = new naver.maps.Marker({
   position : new naver.maps.LatLng(37.335537, 127.100666),
   map : map
});

function changeMap(num) {
   
   var lat;
   var lng;
   
   if(num == 0){ // 놀다가게(홍대 EXIT점)
      lat = 37.557052;
      lng = 126.923311;
   } else if(num == 1){ // 놀다가게(안녕인사동 관훈동점)
      lat = 37.574734;
      lng = 126.983786;
   } else if(num == 2){ // 놀다가게(부평역사점)
      lat = 37.490879;
      lng = 126.722398;
   } else if(num == 3){ // 놀다가게(롯데몰 수지점)
      lat = 37.313229;
      lng = 127.081050;
   } else if(num == 4){ // 부산타워
      lat = 35.101385;
      lng = 129.032332;
   } else if(num == 5){ // 디자인스토어
      lat = 35.174206;
      lng = 129.129276;
   } else if(num == 6){ // 감천문화마을 미니숍
	      lat = 35.097610;
	      lng = 129.01063;
   } else if(num == 7){ // 감천문화마을 소행성B612
	      lat = 35.097924;
	      lng = 129.008391;
   } else if(num == 8){ // 크리에이티브샵
	      lat = 35.098930;
	      lng = 129.034463;
   } else if(num == 9){ // 부산영화체험박물관 BOM STORE
	      lat = 35.101871;
	      lng = 129.033764;
   } else if(num == 10){ // 롯데면제점(서면점 7층 향토관)
	      lat = 35.157028;
	      lng = 129.056593;
   } else if(num == 11){ // 부산면세점(용두산점
	      lat = 35.100894;
	      lng = 129.032366;
   } else if(num == 12){ // 동서대학교 아트샵
	      lat = 35.146300;
	      lng = 129.007043;
   } else if(num == 13){ // 놀다가게(신세계센텀시티몰점)
	      lat = 35.172031;
	      lng = 129.128529;
   } else if(num == 14){ // 영풍문고(하단점)
	      lat = 35.106754;
	      lng = 128.966304;
   } else if(num == 15){ // 영풍문고(남포점)
	      lat = 35.098797;
	      lng = 129.029518;
   }
   
   map = new naver.maps.Map('map', {
      center : new naver.maps.LatLng(lat, lng),
      zoom : 15
   });

   marker = new naver.maps.Marker({
      position : new naver.maps.LatLng(lat, lng),
      map : map
   });
   
   map = new naver.maps.Map('map2', {
	      center : new naver.maps.LatLng(lat, lng),
	      zoom : 15
	   });

	   marker = new naver.maps.Marker({
	      position : new naver.maps.LatLng(lat, lng),
	      map2 : map2
	   });
}
