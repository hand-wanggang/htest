<%--
  Created by IntelliJ IDEA.
  User: deep
  Date: 2017/1/23
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body onload="onloadFunction();">
    <div class="col-md-8 col-md-offset-2">
    <div class="panel panel-info" id="panel1">
        <div class="panel-heading">
            <h3 class="panel-title">超期名单</h3>
        </div>
        <table class="table">
            <thead>
            <th>借书证号</th>
            <th>读者姓名</th>
            <th>图书号</th>
            <th>书名</th>
            <th>借阅时间</th>
            <th>可借天数</th>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.overdueReaders}" var="item">
                    <tr>
                        <td>${item.cardid}</td>
                        <td>${item.name}</td>
                        <td>${item.bookNum}</td>
                        <td>${item.bookName}</td>
                        <td>${item.borrowDate}</td>
                        <td>${item.availableDays}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
        <div class="col-md-4 col-md-offset-8">
            <a href="http://localhost:9001/wanggangwebservices/"><button type="button" class="btn btn-primary">返回汇总首页</button></a>
        </div>
    </div>

</body>
</html>
