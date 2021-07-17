<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stud" class="com.learnings.Student" scope="request"></jsp:useBean>
Id --> <jsp:getProperty property="id"  name="stud"/>
Name --> <jsp:getProperty property="name"  name="stud"/>
</body>
</html>