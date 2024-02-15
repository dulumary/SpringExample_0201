<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>format library</title>
</head>
<body>

	<h2>JSTL format library</h2>
	
	<h3>1. 숫자 출력</h3>
	<c:set var="number" value="457312795" />
	<%-- 123,456 --%>
	<h4><fmt:formatNumber value="${number }" /> </h4>
	
	<h3>2. 퍼센트</h3>
	<h4><fmt:formatNumber value="0.26" type="percent" /> </h4>
	<h4><fmt:formatNumber value="${3 / 7 }" type="percent" /> </h4>
	
	<h3>3. 통화</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" /> </h4>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" /></h4>
	
	<h3>4. 소수점 자리수 표현</h3>
	<c:set var="pi" value="3.141592" />
	
	<h4><fmt:formatNumber value="${pi }" pattern="#.##" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.########" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.00000000" /> </h4>
	
	
	<h3>5. 변환 결과 변수 저장</h3>
	<fmt:formatNumber value="${pi }" pattern="#.##" var="pi2" />
	
	<h4>${pi2 * 3 }</h4>
	
	<h3>6. 날짜 포맷</h3>
	
	<h4>${now }</h4>
	
	<h4><fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" /> </h4>
	
	<c:set var="dateTimeString" value="2024-02-15 20:57:12" />
	<%-- String 날짜 시간 정보 -> Date 객체  --%>
	
	<fmt:parseDate value="${dateTimeString }" pattern="yyyy-MM-dd HH:mm:ss" var="date" />
	
	<h4> ${date } </h4>
	

</body>
</html>