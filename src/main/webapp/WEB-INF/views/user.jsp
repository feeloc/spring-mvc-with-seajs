<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!doctype html>
<html>
<head>
    <title>我的新项目，开始搞起</title>
    <c:import url="head.jsp"/>
    <script type="text/javascript">
        $(function () {
            $('#submit').click(function () {
                var teacherName = $('#teacherName').val();
                var studentName = $('#studentName').val();

                $.ajax({
                    url: '/rest/user/add',
                    contentType: 'application/json',
                    type: 'POST',
                    data: JSON.stringify({'name': studentName}),
                    dataType: "JSON",
                    success: function (result) {
                       console.log(result);
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        console.log(jqXHR);
                        console.log(textStatus);
                        console.log(errorThrown);
                    }
                });
            });


        });
    </script>
</head>
<body>
    <input type="text" id="teacherName"/>
    <input type="text" id="studentName"/>
    <input type="button" id="submit" value="提交"/>
</body>
</html>
