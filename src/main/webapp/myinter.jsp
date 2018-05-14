<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head>
        <c:import charEncoding="UTF-8" url="htmls/myinter.jsp"></c:import>

        <meta charset="utf-8" />
        <title>用户登录</title>
        <link rel="stylesheet" href="<%=basePath%>bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="<%=basePath%>bootstrap/css/master.css" />
        <script src="<%=basePath%>bootstrap/js/bootstrap.js"></script>
        <script src="<%=basePath%>bootstrap/js/jquery.min.js"></script>
        <script src="<%=basePath%>bootstrap/js/form.js"></script>
    </head>
    <body charset="utf-8">
        <form action="/admin/insert" method="post" accept-charset="u">
            <div class="mycenter">
            <div class="mysign">
                <div class="col-lg-11 text-center text-info">
                    <h2>剑网三师门登录</h2>
                </div>
                <div class="col-lg-10">
                    <input type="text" class="form-control" maxlength="7" name="username" placeholder="请输入账户名" required autofocus/>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10">
                    <input type="password" class="form-control" maxlength="16" name="password" placeholder="请输入密码" required autofocus/>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10 mycheckbox checkbox">
                    <input type="checkbox" class="col-lg-1">记住密码</input>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10">
                    <button type="button" id="id" class="btn btn-success col-lg-12">登录</button>
                </div>
            </div>
        </div>
        </form>
    </body>
</html>