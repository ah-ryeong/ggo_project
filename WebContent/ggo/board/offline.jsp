<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/nav2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>꼬등어</title>
	<!--css-->
    <link href="ggo/css/offline.css" rel="stylesheet" type="text/css" />
    <link href="ggo/css/common2.css" rel="stylesheet" type="text/css" />
    <!-- 네이버 지도 api -->
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=bqo8gj626m"></script>
</head>
<body>
	<div class="id_height">
	    <div class="" id="offline"></div>
	</div>
	
	<div class="offline">
	
	  <h2 class="type01">OFFLINE STORE</h2>
	  
	  <div class="wrap_in offline_con">
	    <img src="ggo/images/offline/offline_img.png" alt="">
	    <ul class="offline_tab">
	      <li  class="active" data-num="1">서울 및 수도권/기타</li>
	      <li  data-num="2">부산 및 경남</li>
	    </ul>
	    <p>매장 별 입점 상품이 상이하여 원하시는 제품 취급여부를 매장에 사전 확인 후 방문하시기 바랍니다.</p>
	    
	    <div class="offline_wrap">
			<div class="clear">
				<div class="container3">
					<div class="swiper-container3"  style="overflow:hidden;">
						<div class="swiper-wrapper" style="display: flex;">
							<div class="swiper-slide" style="width: 50%">
								<ul class="offline_list">
									<li><a href="javascript:void(0);" onclick="changeMap(0)">놀다가게(홍대 EXIT점)<span>서울 마포구</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(1)">놀다가게(안녕인사동 관훈동점)<span>서울 종로구</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(2)">놀다가게(부평역사점)<span>인천 부평구</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(3)">놀다가게(롯데몰 수지점)<span>경기 용인시</span></a></li>
								</ul>
							</div>
							<!-- 지도 -->
	    					<div class="map__api" style="width: 50%">
               					<div id="map" style="width: 534px; height: 418px;"></div>
       						</div>
						</div>
					</div>
				</div>
	
				<div class="container4" style="display:none;">
					<div class="swiper-container4"  style="overflow:hidden;">
						<div class="swiper-wrapper" style="display: flex;">
							<div class="swiper-slide" style="width: 50%">
								<ul class="offline_list">
									<li><a href="javascript:void(0);" onclick="changeMap(4)">부산타워<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(5)">디자인스토어<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(6)">감천문화마을 미니숍<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(7)">감천문화마을 소행성B612<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(8)">크리에이티브샵<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(9)">부산영화체험박물관 BOM STORE<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(10)">롯데면제점(서면점 7층 향토관)<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(11)">부산면세점(용두산점)<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(12)">동서대학교 아트샵<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(13)">놀다가게(신세계센텀시티몰점)<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(14)">영풍문고(하단점)<span>부산시</span></a></li>
									<li><a href="javascript:void(0);" onclick="changeMap(15)">영풍문고(남포점)<span>부산시</span></a></li>
								</ul>
							</div>
							<!-- 지도 -->
	    					<div class="map__api" style="width: 50%">
               					<div id="map2" style="width: 534px; height: 418px;"></div>
       						</div>
						</div>
					</div>
				</div>
			</div>
	
	    </div>
	  </div>
	</div>

<script src="ggo/js/offline.js"></script>
<%@include file="../include/footer.jsp" %>
</body>
</html>