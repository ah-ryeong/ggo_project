<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String remember = (String)request.getAttribute("remember");

	if(remember == null) {
		remember = "";
	}
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>꼬등어</title>
   	<!--css-->
	  <link href="ggo/css/join.css" rel="stylesheet" type="text/css" />
</head>
    </head>
<body>
<div class="wrap">
            <div class="form-wrap">
                <div class="button-wrap">
                    <div id="btn"></div>
                    <button type="button" class="togglebtn" onclick="login()">LOG IN</button>
                    <button type="button" class="togglebtn" onclick="register()">REGISTER</button>
                </div>
                <div class="social-icons">
                    <img src="ggo/images/login/nv.png" alt="naver">
                    <img src="ggo/images/login/gl.png" alt="google">
                </div>
                <form id="login" action="user?cmd=loginProc" method="post" class="input-group">
                    <input name="username" type="text" value="${cookie.remember.value}" class="input-field" placeholder="User name" required>
                    <input name="password" type="password" class="input-field" placeholder="Enter Password" name="password" required>
                    
                    <c:choose>
                    	<c:when test="${empty cookie.remember}">
                    		<input type="checkbox" class="checkbox" name="remember"><span>Remember UserName</span>
                    	</c:when>
                    	<c:otherwise>
                    		<input type="checkbox" class="checkbox" name="remember" checked><span>Remember UserName</span>
                    	</c:otherwise>
                    </c:choose>
                    
                    <button class="submit">Login</button>
                </form>
                <form id="register" action="user?cmd=joinProc" method="post" class="input-group">
                    <input name="username" type="text" class="input-field" placeholder="User name" required>
                    <input name="email" type="email" class="input-field" placeholder="Your Email" required>
                    <input name="password" type="password" class="input-field" placeholder="Enter Password" required>
                    <input type="checkbox" class="checkbox"><span>Terms and conditions</span>
                    <button class="submit">REGISTER</button>
                </form>
            </div>
            
            <div class="login_pic">
            	<!-- 사진넣을거임 -->
            	<img src="ggo/images/partner/partner_img.png" alt="">
            </div>
        </div>
        <script>
            var x = document.getElementById("login");
            var y = document.getElementById("register");
            var z = document.getElementById("btn");
            
            
            function login(){
                x.style.left = "50px";
                y.style.left = "450px";
                z.style.left = "0";
            }

            function register(){
                x.style.left = "-400px";
                y.style.left = "50px";
                z.style.left = "110px";
            }
        </script>
        <script src="ggo/js/join.jsp"></script>
    </body>
</html> 