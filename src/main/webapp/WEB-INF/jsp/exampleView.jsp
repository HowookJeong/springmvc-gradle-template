<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>SpringMVC Gradle Template Example</title>
</head>
<body>

User : ${user} / Authentication String : ${authenticationString}
<br>
User : <c:out value="${user}" /> / Authentication String : <c:out value="${authenticationString}" />

</body>
</html>
