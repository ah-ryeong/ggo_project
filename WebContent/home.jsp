<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="ggo/include/nav.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>꼬등어</title>
    <script type="text/javascript">
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
     </script>
</head>
<body>
    <!-- 맨 위 사진 -->
    <div class="visual">
        <div class="visual_con">
            <div class="">
                <div class="swiper-container">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide">
                            <span><img src="ggo/images/main/vi01.jpg" alt=""></span>
                            <span><img src="ggo/images/main/vi02.jpg" alt=""></span>
                            <span><img src="ggo/images/main/vi03.jpg" alt=""></span>
                            <span><img src="ggo/images/main/vi04.jpg" alt=""></span>
                        </div>
                    </div>
                </div>

                <div class="vi_text">
                    <p>부산 대표 캐릭터 <strong>발 달린 꼬등어</strong></p>
                    <img src="ggo/images/main/vi_logo.svg" alt="">
                </div>
                <div class="common_paging v_paging">
                </div>
            </div>
        </div>
    </div>
    <!-- 맨 위 사진 끝 -->

    <!-- 제품들어갈 곳 사진-->
    <div class="product">
        <div class="wrap_in">
            <h2>꼬등어 갖고싶꼬등<br /></h2>
        </div>
    </div>
    <!-- 제품들어갈 곳 사진 끝 -->

    <!-- 제품목록 -->
    <!-- 제품목록 끝 -->

<%@include file="ggo/include/footer.jsp" %>
</body>

</html>