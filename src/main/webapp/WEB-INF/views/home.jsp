<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Home</title>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="Pragma" content="no-cache">
		<meta http-equiv="Cache-Control" content="no-cache">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui/1.12.1/jquery-ui.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/template/mustache.min.js"></script>
		
		<link type="text/css" rel="stylesheet" href="">
		
		<style type="text/css">
		
		</style>
		
		<script type="text/javascript">
			$(document).ready(function() {
				var view = {
				  title: "Joe",
				  calc: function () {
				    return 2 + 4;
				  }
				};
				
				var output = Mustache.render("{{title}} spends {{calc}}", view);
				
				console.log(output);
			});
			
			$(function() {
				$("#btn").click(function() {
					$("#tmp").text("OK");
				});
			});
		</script>
	</head>
	<body>
		<button id="btn">button</button>
		<div id="tmp">
		</div>
	</body>
</html>
