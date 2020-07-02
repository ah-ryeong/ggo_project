 // main 움직이는 사진 
$(document).ready(function () {
    $('.swiper-slide').bxSlider({
        auto: true, // 자동으로 애니메이션 시작
        speed: 500,  // 애니메이션 속도
        pause: 5000,  // 애니메이션 유지 시간 (1000은 1초)
        mode: 'horizontal', // 슬라이드 모드 ('fade', 'horizontal', 'vertical' 이 있음)
        // autoControls: true, // 시작 및 중지버튼 보여짐
        pager: true, // 페이지 표시 보여짐
        captions: true, // 이미지 위에 텍스트를 넣을 수 있음
    });
})

// 모바일버튼
$(function(){
		$('.mobile .hamberger').click(function(e){
			if($(this).hasClass('open')){
				$(this).removeClass('open');
				$('.mobile_menu').animate({
					right: '-100%'
				}, 500);
			} else {
				$(this).addClass('open');
				$('.mobile_menu').animate({
					right: '0'
				}, 500);
			}
		});
	});

	$(function(){		
		$('nav .menu1Dep a').click(function(e){
			if($(this).hasClass('link')){
			}else {
				e.preventDefault();
				if($(this).hasClass('video')){
					videoChk = false;
				}
				$('html,body').animate({scrollTop:$(this.hash).offset().top}, 500);
			}
		});

		$('.mobile_menu li a').click(function(e){
			if($(this).hasClass('link')){
			}else {
				e.preventDefault();
				if($(this).hasClass('video')){
					videoChk = false;
				}
				$('.mobile_menu').animate({right: '-100%'}, 100);
				$('.hamberger').removeClass('open');
				$('html,body').animate({scrollTop:$(this.hash).offset().top}, 500);
			}
		});
	});
	
