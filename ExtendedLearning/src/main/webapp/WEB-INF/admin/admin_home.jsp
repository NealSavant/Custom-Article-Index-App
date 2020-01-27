<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Extended Learning</title>
<jsp:include page="shared_jsp/jsp_scripts/styleTop.jsp" />

</head>
<body>
	<header class="main-header">
		<jsp:include page="shared_jsp/header.jsp" />
	</header>
	
	<h4>User Management</h4>
	
	<c:forEach var="user" items="${users }">
	
	
	</c:forEach>
	
	
	
	
	


	<footer>
		<jsp:include page="shared_jsp/footer.jsp" />
	</footer>

	<jsp:include page="shared_jsp/jsp_scripts/styleBot.jsp" />
</body>
</html>