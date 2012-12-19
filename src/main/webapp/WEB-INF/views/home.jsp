<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!doctype html>
<html>
<head>
	<title>我的新项目，开始搞起</title>
    <link href="<c:url value='/resources/images/favicon.ico'/>" mce_href="favicon.ico" rel="bookmark" type="image/x-icon" />
    <link href="<c:url value='/resources/images/favicon.ico'/>" rel="icon" type="image/x-icon" />
    <link href="<c:url value='/resources/images/favicon.ico'/>" rel="shortcut icon" type="image/x-icon" />
    <script type="text/javascript" src="<c:url value='/resources/js/jquery.1.8.1.js'/>"></script>
</head>
<body>
	<h1>搞起spring mvc , backbone js</h1>

	<h4>数据库信息：</h4>
	DataSource: <c:out value="${dbinfo}"/></br>

	<h4>目前状态:</h4>
	<c:if test="${not empty states}">
		<p>
			<c:forEach var="state" items="${states}">
				<c:out value="${state}"/></br>
			</c:forEach>
		</p>
	</c:if>
	<c:if test="${empty states}">
		<p>No States found</p>
	</c:if>
<script type="text/javascript">
    $(function(){
        $.ajax({
            url:'/rest/home',
            type:'GET',
            dataType:'json',
            success:function(data){
                console.log(data);
            }
        });
    });
</script>
</body>
</html>
