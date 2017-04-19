<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Snapdeal Price Simulator</title>
	<link type="text/css" rel="stylesheet" href="/PriceSimulator/CSS/base/structure.css" media="screen" />
	<script type="text/javascript" src="/PriceSimulator/JS/utility/jquery-1.12.0.min.js"></script>
</head>
<body>
	<div class="header"><%@include file="../../content/menubar.jsp"%></div>
	<div class="filter" style="float:left;display:inline"><%@include file="../../content/categoryfilter.jsp"%></div>
	<div class="content" style="float:left;display:inline;width:80%">
		<s:if test="%{#session.selcategory==null}"><span class="error">Please Select a Sub Category from Category Filter</span></s:if>
		<s:else><%@include file="../../content/exceptions/removeproduct.jsp"%></s:else>
	</div>
	
</body>
</html>