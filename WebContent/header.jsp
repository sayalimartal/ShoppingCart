<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<style>
h1{
padding:10px;
}
.badge {
   position:absolute;
   right: 20px;
}
.badge[data-badge]:after {
   content:attr(data-badge);
   position:absolute;
   top:-10px;
   right:-10px;
   font-size:.9em;
   background:green;
   color:white;
   width:18px;height:18px;
   text-align:center;
   line-height:18px;
   border-radius:80%;
   box-shadow:0 0 1px #333;
}
</style>
</head>

<body>

<!-- Display page header with a link to the cart details-->
<h1 align="left">Pick a Book &#8208; Buy books from the comfort of your home!</h1>

<a href="viewcart.app" class="badge" data-badge="${sessionScope.cartCount}"><img align="right" width="40px" height="40px" alt="Cart" src="images/cart.jpg"></a>

</body>
</html>