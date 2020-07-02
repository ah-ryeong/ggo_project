<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>꼬등어</title>
    <!--css-->
    <link href="ggo/css/main.css" rel="stylesheet" type="text/css" />
    <link href="ggo/css/common.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

    <!-- font -->
 	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;700&family=Noto+Sans:wght@400;700&display=swap" rel="stylesheet">
 	

    <script>
        // When the user scrolls down 80px from the top of the document, resize the navbar's padding and the logo's font size
        window.onscroll = function () { scrollFunction() };

        function scrollFunction() {
            if (document.body.scrollTop > 140 || document.documentElement.scrollTop > 0) {
                $('header').addClass('header_scroll');
            } else {
                $('header').removeClass('header_scroll');
            }
        }
    </script>
</head>
<body>
	<!-- header(나중에 nav.jsp로 뺄거임) -->
    <header>
        <div class="header_con">
            <div class="logo">
            	<a><img alt="logo" src="ggo/images/common/logo.png" /></a>
            </div>
            <nav class="pc">
                <ul class="clear menu1Dep">
                    <li><a href="user?cmd=home">캐릭터</a></li>
                    <li><a href="board?cmd=board">게시판</a></li>
                    <li><a href="board?cmd=offline">매장안내</a></li>
                    <li><a href="board?cmd=partnership">제휴제안</a></li>
                    <li><a href="https://smartstore.naver.com/ggodeungo" target="_blank" class="link">온라인스토어</a></li>
                    <c:choose>
                    	<c:when test="${empty sessionScope.principal }">
	                    	<li><a href="user?cmd=login">로그인</a></li>
		                    <li><a href="user?cmd=join">회원가입</a></li>
                    	</c:when>
	                   	<c:otherwise>
	                   		<li><a href="user?cmd=MyPage">회원정보</a></li>
		                    <li><a href="user?cmd=logout">로그아웃</a></li>
	                   	</c:otherwise>
                    </c:choose>
                </ul>
            </nav>

            <nav class="mobile">
                <div class="hamberger">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                <div class="mobile_menu">
                	<span class="m_language">
		              <c:choose>
	                    	<c:when test="${empty sessionScope.principal }">
		                    	<a href="user?cmd=login">로그인</a>
			                    <a href="user?cmd=join">회원가입</a>
	                    	</c:when>
		                   	<c:otherwise>
		                   		<a href="user?cmd=MyPage">회원정보</a>
			                    <a href="user?cmd=logout">로그아웃</a>
		                   	</c:otherwise>
                   		</c:choose>
		            </span>
                    <ul class="clear">
                        <li><a href="user?cmd=home">캐릭터</a></li>
                        <li><a href="board?cmd=board">게시판</a></li>
                        <li><a href="board?cmd=offline">매장안내</a></li>
                        <li><a href="board?cmd=partnership">제휴제안</a></li>
                        <li><a href="https
                            //smartstore.naver.com/ggodeungo" target="_blank" class="link">온라인스토어</a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </header>