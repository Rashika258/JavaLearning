<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/funct" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Hello' }"></c:out>
	<c:set var="name" value="Rashika">
	</c:set>
	<br>
	<c:if test="${param.name=='Rashika' }}">${'yes' }</c:if>
	<c:choose>
	
		<c:when test="${param.name=='Namya' }}">${'BNMIT' }</c:when>
		<c:when test="${param.name=='Sanjana' }}">${'JSS' }</c:when>
		</c:choose>
</body>
</html>