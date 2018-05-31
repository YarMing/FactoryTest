<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
    <head>

        <meta charset="utf-8" />
        <title>用户登录</title>

        <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="https://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.js"></script>
        <link href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">


    </head>

    <style>
        body {
            background-image: url("images/denglu.jpg");
            background-repeat: no-repeat;
            background-size: cover;
            opacity: 0.8;
        }
        .mycenter{
            margin-top: 100px;
            margin-left: auto;
            margin-right: auto;
            height: 350px;
            width:500px;
            padding: 5%;
            padding-left: 5%;
            padding-right: 5%;
        }
        .mycenter mysign{
            width: 440px;
        }
        .mycenter input,checkbox,button{
            margin-top:2%;
            margin-left: 10%;
            margin-right: 10%;
        }
        .mycheckbox{
            margin-top:10px;
            margin-left: 40px;
            margin-bottom: 10px;
            height: 10px;
        }

    </style>


    <body charset="utf-8">
        <form action="/admin/insert" method="post" accept-charset="u">
            <div class="mycenter">
            <div class="mysign">
                <div class="col-lg-11 text-center text-info">
                    <h2>剑三师门登录</h2>
                </div>
                <div class="col-lg-10">
                    <input type="text" class="form-control" maxlength="7" name="username" placeholder="请输入账户名" value="" id="f1" required autofocus/>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10">
                    <input type="password" class="form-control" maxlength="16" name="password" placeholder="请输入密码" value=""  id="f2" required autofocus/>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10 mycheckbox checkbox">
                    <input id="id001" type="checkbox" name="checked"  class="col-lg-1">记住密码</input>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10">
                    <button type="button" id="id" class="btn btn-success col-lg-12">登录</button>
                    <button type="button" id="id01" class="btn btn-success col-lg-12">注册</button>
                </div>
            </div>
        </div>
        </form>

    <!--登录验证-->
    <script>
        $(function () {
            $("#f1").val( $.cookie("username"))
            $("#f2").val( $.cookie("password"))


            $("#id").click(function () {
                var parms = $("form").serializeArray();
                var values = {};
                for( x in parms){
                    values[parms[x].name] = parms[x].value;
                }

                var web = JSON.stringify(values)
                var parse = JSON.parse(web)
                if ($("#id001").is(":checked")) {
                    $.cookie("username",parse.username,{expires:7})
                    $.cookie("password",parse.password,{expires:7})

                    alert("username"+"="+parse.username+"password"+"="+parse.password)
                }else {

                }


                $.ajax({
                    type:"post",
                    url:"/admin/select",
                    data:{"username":parse.username,"password":parse.password},
                    dataType:"json",
                    success: function (data) {
                        if (data!=null&&parse!=null&&data.username==parse.username&&data.password==parse.password) {
                            alert("登录成功");
                            self.location='homepage.jsp';
                        } else if (parse.username==data.username){
                            if (parse.password=="") {
                                alert("请输密码！")
                            }else if (parse.password!="") {
                                alert("密码输入错误！")
                            };

                        }else if (parse.username=="") {


                            alert("请输入用户名！")

                        }else if (parse.username!="") {
                            alert("用户不存在！")
                        }
                    }

                });

            });

            $("#id01").click(function () {
                self.location='insert.jsp';
            });

        })
    </script>

    </body>
</html>