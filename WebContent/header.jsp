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
</style>
</head>

<body>

<!-- Display page header with a link to the cart details-->
<h1 align="left">Pick a Book &#8208; Buy books from the comfort of your home!</h1>
<h3 align="right"><a href="viewcart.app" >Cart(${sessionScope.cartCount})</a></h3>

</body>
</html>