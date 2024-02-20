<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 예제</title>
</head>
<body>

	<h2>AJAX 테스트</h2>
	
	<button type="button" id="requestBtn">요청</button>
	
	<h3 id="nameH"></h3>
	<h4 id="ageH"></h4>
	

	<script
  src="https://code.jquery.com/jquery-3.7.1.min.js"
  integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
  crossorigin="anonymous"></script>
  	<script>
  		$(document).ready(function() {
  			
  			$("#requestBtn").on("click", function() {
  				
  				// /ajax/person
  				$.ajax({
  					type:"get"
  					, url:"/ajax/person"
  					, data:{"name":"유재석", "birthday":"20050912"}
  					, success:function(data) {
  						// {"name":"김인규", "age":25}
  						// jquery가 response로 전달된 json문자열을
  						// 자바스크립트 객체로 변환
  						console.log("나이 : " + data.age);
  						
  						$("#nameH").text(data.name);
  						$("#ageH").text(data.age);
  					}
  					, error:function() {
  						alert("에러");
  					}
  				});
  			});
  			
  		});
  	
  	
  	</script>
  
</body>
</html>