<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제휴제안 > 커뮤니티 > 꼬등어</title>
<!--css-->
    <link href="ggo/css/common.css" rel="stylesheet" type="text/css" />
    <link href="ggo/css/main.css" rel="stylesheet" type="text/css" />
    <link href="ggo/css/board.css" rel="stylesheet" type="text/css" />
    <link href="ggo/css/public.css" rel="stylesheet" type="text/css" />
    <link href="ggo/css/partnership.css" rel="stylesheet" type="text/css" />
</head>
<body>	
	<!-- sub_visual -->
	<div class="s_visual">
	  <div class="s_ti">부산대표캐릭터 <strong>발달린 꼬등어</strong></div>
	</div>
	
	<!-- //sub_visual -->
	<!-- sub_contents -->
	<div class="s_contents03 wrap_in s_contents">
		<h1>제휴제안</h1>
		<form id="partnership_form" name="partnership_form" action="/ajax/partnership" method="post" autocomplete="off" enctype="multipart/form-data" novalidate="novalidate">
	
			<div class="partner">
				<p class="partner_box required_box"><span></span>는 필수 항목입니다. 제안하신 내용은 aryeong2@naver.com 로 전송됩니다.</p>
	
				<dl class="par">
					<dt><label for="category" class="required_item">분야</label></dt>
					<dd><input type="hidden" name="submitChk" id="submitChk" value="N"/>
					<select name="category" id="category">
						<option value="">선택하세요.</option>
						<option value="1">라이센싱</option>
						<option value="2">B2B 대량구매</option>
						<option value="3">콜라보레이션</option>
						<option value="4">사업제휴</option>
						<option value="5">홍보마케팅</option>
						<option value="6">일반문의</option>
						<option value="7">기타</option>
					</select></dd>
					<dt><label for="subject" class="required_item">제목</label></dt>
					<dd><input type="text" name="subject" id="subject" value="" placeholder="제목을 입력해주세요."/></dd>
					<dt><label for="content" class="required_item">내용</label></dt>
					<dd><textarea name="content" id="content"></textarea></dd>
					<dt><label for="userfile">파일첨부</label></dt>
					<dd>
						<div class="filetype">
							<input type="file" name="userfile" id="userfile"/>
						</div>
					</dd>
					<dt><label for="userfile" class="required_item">업체명</label></dt>
					<dd><input type="text" name="company" id="company" placeholder="업체명을 입력해주세요." class="wid50"/></dd>
					<dt><label for="userfile" class="required_item">연락처</label></dt>
					<dd><input type="text" name="tel" id="tel" placeholder="연락처를 입력해주세요." class="wid50"/></dd>
					<dt><label for="userfile" class="required_item">이메일</label></dt>
					<dd><input type="text" name="email" id="email" placeholder="이메일을 입력해주세요." class="wid50"/></dd>
				</dl>
				<div class="partner_box">
					<div class="agree_txt">위 정보는 제휴신청에 따른 본인확인 및 원활한 의사소통 경로 확보를 위해서만 활용되며, 이메일 송수신 내역에 별도 삭제 없이 보관될 수 있습니다.</div>
					<input type="checkbox" name="agree" id="agree" class="input_check"/><label for="agree" class="agree_label">위 항목에 동의합니다.</label>
				</div>
				<button type="button" class="partnership_insert btn_partner">제안 메일 보내기</button>
			</div>
		</form>
	</div>
	<!-- // sub_contents -->
<script src="ggo/js/partnership.js"></script>
<%@include file="../include/footer.jsp" %>
</body>
</html>