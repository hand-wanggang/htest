<%--
  Created by IntelliJ IDEA.
  User: deep
  Date: 2017/1/23
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <div class="panel panel-info" >
        <div class="panel-heading">
            <h3 class="panel-title">图书列表</h3>
        </div>
        <table class="table">
            <thead>
            <th>选择</th>
            <th>书号</th>
            <th>书名</th>
            <th>可借状态</th>
            <th>作者</th>
            <th>出版社名称</th>
            <th>借阅信息</th>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
        <div class="col-md-4 col-md-offset-8">
            <a href="http://localhost:9001/wanggangwebservices/book/getOverdueReadersInfo"><button type="button" class="btn btn-primary">打印超期名单</button></a>
            <button type="button" class="btn btn-primary">借书</button>
            <button type="button" class="btn btn-primary">还书</button>
        </div>
    </div>

<script>
    function onloadFunction(){
        $.ajax({
            type :"get",
            url : "http://localhost:9001/wanggangwebservices/book/getBooks",
            dataType :"json",
            success :showData
        });
    }

    function showData(data){
        console.log(data);
        $("tbody").empty();
        $.each(data,function (index,item) {
            addDataToTable(item.number,item.name,item.status,item.author,item.publisher);
            console.log(index);
        })
    }
    
    function addDataToTable(num,name,status,auth,publisher) {
        $("tbody").append("<tr>"
            +"<td><input type='checkbox' id="+num+"></td>"
            +"<td>"+num+"</td>"
            +"<td>"+name+"</td>"
            +"<td>"+status+"</td>"
            +"<td>"+auth+"</td>"
            +"<td>"+publisher+"</td>"
            +"<td><a href='http://localhost:9001/wanggangwebservices/book/getBorrowInfo/"+num+"'>详情</a></td>"
            +"</tr>");
    }
</script>
</body>
</html>
