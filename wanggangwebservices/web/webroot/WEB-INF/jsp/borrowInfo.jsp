<%--
  Created by IntelliJ IDEA.
  User: deep
  Date: 2017/1/23
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="panel panel-info" >
        <div class="panel-heading">
            <h3 class="panel-title">借阅详情</h3>
            <div class="panel-title">书名:${requestScope.borrowInfo.bookName}</div>
            <div class="panel-title">作者:${requestScope.borrowInfo.authorName}</div>
        </div>
        <table class="table">
            <thead>
            <th>读者姓名</th>
            <th>借书日期</th>
            <th>还书日期</th>
            <th>是否超期</th>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.borrowInfo.borrowRecords}" var="item">
                    <tr>
                        <td>${item.readerName}</td>
                        <td>${item.borrowDate}</td>
                        <td>${item.returnDate}</td>
                        <td>${item.overdueStatue}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="col-md-4 col-md-offset-8">
        <a href="http://localhost:9001/wanggangwebservices/"><button type="button" class="btn btn-primary">返回汇总首页</button></a>
    </div>
</body>
</html>
