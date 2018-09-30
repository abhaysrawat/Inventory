<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Manali General Store</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
    <!-- Navigation -->
	<%@include file="./all/navbar.jsp" %>
	
    <!-- Loading home content -->
    <c:if test="${userClickHome == true}">
    	<%@include file="home.jsp" %>
    </c:if>
    
    <c:if test="${userClickTrack == true}">
    	<%@include file="track.jsp" %>
    </c:if> 
    
    <c:if test="${userClickRules == true}">
    	<%@include file="rules.jsp" %>
    </c:if>
    
    <c:if test="${userClickAbout == true}">
    	<%@include file="about.jsp" %>
    </c:if>   
      
    <c:if test="${userClickContact == true}">
    	<%@include file="contact.jsp" %>
    </c:if>      
    
    
    <!-- Footer -->
	<%@include file="./all/footer.jsp" %>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>

  </body>

</html>
    