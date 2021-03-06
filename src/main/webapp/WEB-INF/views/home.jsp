<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!doctype html>
<html>
<head>
	<title>我的新项目，开始搞起</title>
    <c:import url="head.jsp"/>
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
