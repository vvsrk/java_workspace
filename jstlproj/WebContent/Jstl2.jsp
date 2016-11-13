<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<strong>Member's Comments</strong>
<hr>
<c:forEach items="${commentList}" var="comment">
	<c:out value="${comment}"></c:out>
	<br>
</c:forEach>
<hr>
<c:if test="${userType eq 'member' }">
	<c:out value="UserType is member"></c:out>
	<hr>
	<jsp:include page="inputComments.jsp"></jsp:include>
	<hr>
</c:if>

</body>
</html>