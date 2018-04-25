<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head>
		<title><spring:message code="title" /></title>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="Pragma" content="no-cache">
		<meta http-equiv="Cache-Control" content="no-cache">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/template/mustache.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui/1.12.1/jquery-ui.min.js"></script>
		
		<link type="text/css" rel="stylesheet" href="">
		
		<style type="text/css">
			#wrap {
				width: 90%;
				height: 100%;
				margin: 20px auto;
				border: 1px solid #00f;
			}
		
			@media all and (min-width:320px) {
				#wrap {
					width: 30%;
					background: #00d2a5;
				}
			}
			
			@media all and (min-width:600px) {
				#wrap {
					width: 60%;
					background: #40b0f9;
				}
			}
			
			@media all and (min-width:1024px) {
				#wrap {
					width: 90%;
					background: #f45750;
				}
			}
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
	<body id="wrap">
		<button id="btn">button</button>
		<div id="tmp">
		</div>
	</body>
</html>
