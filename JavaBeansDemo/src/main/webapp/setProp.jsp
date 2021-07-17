<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stud" class="com.learnings.Student" scope="session"></jsp:useBean>
<!-- <jsp:setProperty property="id"  name="stud" value="11"/>
<jsp:setProperty property="name"  name="stud" value="Rashika"/> -->
<form action="getProp.jsp">
<input type="text" name="id" value="<jsp:getProperty property="id"  name="stud" value="11"/>
</form>

</body>
</html>