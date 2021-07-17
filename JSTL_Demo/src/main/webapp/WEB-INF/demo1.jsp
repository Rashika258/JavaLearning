<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set va="sen" value="Hello how are you">
</c:set>
${fn:length(sen) }
${fn:split(sen,' ' }
<c:forEach items="${fn:split(sen,' ')}" var="str">${fn:split(sen,' ' }</c:forEach>

</body>
</html>