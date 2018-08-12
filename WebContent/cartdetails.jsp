<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
<style>
html{
position: relative;
min-height: 100%;
}
table {
	font-family: monospace;
}

body {
	background-color: #CCF9C3;
}
section {
	margin-right: 100px;
}
hr {
	width:150%;
	height:700%;
	bg-color:black;
}
pre{
font-family: monospace;
font-size: medium;
}
.cont {
	margin-left: 30px;
	margin-right: 30px;
}
</style>
</head>

<body>
<div>
		<jsp:include page="header.jsp"></jsp:include>
</div>

<jstl:if test="${sessionScope.cartCount>0}">
<div class="cont">
	<div style="align: center;">
		<h1 align="center">Cart Details</h1>
	</div>
<!-- Displays all the books  -->
	<section>
		<jstl:forEach var="book" items="${sessionScope.cartItems}">
					<br><br>
					<h2>${book.bookName}</h2>
					<table>
						<tr>
							<td><img src="images/${book.bookImg}" width=150px
								height="150px" align="left" /></td>
							<td><pre>
							Author: ${book.authorName}
							Description: ${book.description}
							Price: Rs. ${book.price}
							Items: ${book.bookCount}<br><br>
							<a href="remove.app?bookId=${book.bookId}">Remove from cart</a>
							</pre></td>
						</tr>
					</table>
					<hr><hr>
		</jstl:forEach>
	</section>
</div>
</jstl:if>

<div>
	<!-- Check if cart is empty -->
	<jstl:if test="${sessionScope.cartCount==0}">
		<br><br>
			<h2 align="center">Empty Cart!</h2>
	</jstl:if>
</div>

<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>

</body>
</html>