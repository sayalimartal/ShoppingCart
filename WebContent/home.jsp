<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pick a Book!</title>
<style>
html{
position: relative;
min-height: 100%;
}
table{
font-family: monospace;
}
body{
	background-color: #CCF9C3;
}
section{
	margin-right:100px;
}
hr{
	width:150%;
	height:700%;
	bg-color:black;
}
.cont{
	margin-left:30px;
	margin-right:30px;	
}
pre{
font-family: monospace;
font-size: medium;
}
</style>
</head>
<body>
<div>
	<jsp:include page="header.jsp"></jsp:include>
</div>
<div style="align: center" class="cont">
<!-- List of books from which user can add books to cart for purchase -->
	<h2 align="center">Books List</h2>
	<br><br>
		<section>
<!-- Displays all books with their details -->
			<jstl:forEach var="book" items="${requestScope.books}">
					<h2>${book.bookName}</h2>
					<table>
					<tr><td><img src="images/${book.bookImg}" width=150px height="150px" align="left" /></td>
					<td><pre>
					Author: ${book.authorName}
					Description:${book.description}
					Price: Rs. ${book.price}<br/><br/>
					<a href="add.app?bookId=${book.bookId}">Add to Cart</a>
					</pre></td></tr>					
					</table>
					<hr><hr>
			</jstl:forEach>
		</section>	
</div>	
<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>

</body>
</html>