<html>
<head>
<title>my.nursery.com</title>
</head>

<body>
	<h2>My Nursery</h2>
	
	<!-- TODO: configure home page here.
	 for the time being redirecting to plants-->
	<!--  <a href = "${pageContext.request.contextPath}/api/home">Home</a> -->
	
	<!-- Redirecting to the home api -->
	<%
		response.sendRedirect("api/home");
	%>
	
</body>
</html>
