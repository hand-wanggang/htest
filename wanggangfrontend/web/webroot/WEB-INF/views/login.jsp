<%--
  Created by IntelliJ IDEA.
  User: deep
  Date: 2017/1/23
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="col-md-6 col-md-offset-3" style="position: absolute;top:50%;margin-top:-200px;">
    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title">欢迎登陆</h3>
        </div>

        <form role="form" class="form-horizontal" action="#"  method="post" style="margin: 20px 20px;" onsubmit="return loginCheck();">
            <div class="form-group">
                <label class="control-label col-md-2">借书证号:</label>
                <div class="col-md-10">
                    <input type="text" name="cardId" class="form-control">
                </div>
            </div>

            <div class="col-md-offset-2">
                <button type="submit" class="btn btn-default" class="form-control">登陆</button>
            </div>

        </form>
    </div>
</div>


<script>

    function loginCheck(){

        var _data=$("form").serialize();
        $.ajax({
            type :"post",
            url : "http://localhost:9001/wanggangwebservices/book/login",
            data:_data,
            dataType :"json",
            success :setLoginSuccess,
            error:setLoginFail
        });
        return false;
    }

    function setLoginFail(){
        console.log("登陆失败");
        $(".panel-title").empty();
        $(".panel-title").html("<p style='color: red;'>登陆失败<p>");
    }

    function setLoginSuccess(data){

        if(data.result==false) {
            setLoginFail();
            return;
        }
        console.log("登陆成功");
        console.log(data);

       location.href="http://localhost:9001/wanggangwebservices";
    }


</script>



</body>
</html>
