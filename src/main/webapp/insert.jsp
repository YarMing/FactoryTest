<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/30
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>注册用户</title>

    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">



</head>

<style>
    body{
        margin: 20vh 30vw;
        background: url("images/zhuce.jpg");
        background-repeat: no-repeat;
        background-size: cover ;
    }

    .login-section{
        background-color: #f8f6e9;
        opacity: 0.7;
        width: 100%;
    }


</style>

<body>
<!-- login -->
<div class="login-section w3l">

    <div class="sig-top agileits">
        <div class="signup">
            <div class="modal-content modal-info">
                <div class="modal-header wthree">
                    <h3>注册中心</h3>
                </div>
                <div class="modal-body modal-spa">
                    <div class="login-form">
                        <form action="#" method="post" id="signup">
                            <ol>
                                <li>
                                    <input type="email" id="name" name="name" placeholder="用户名" title="Name" required />
                                </li>
                                <li>
                                    <input type="password" class="lock" name="password"  pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" placeholder="密码" id="password1" required />
                                    <p class="validation01">
                                        <span class="invalid">最少8个字符，一个数字，一个大写字母和一个小写字母</span>
                                    </p>
                                </li>
                                <li>
                                    <input type="password" class="lock" name="password"  pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" placeholder="确认密码" id="password2" required />
                                    <p class="validation01">
                                        <span class="invalid">最少8个字符，一个数字，一个大写字母和一个小写字母</span>
                                    </p>
                                </li>
                            </ol>

                            <input type="submit" value="注册">
                        </form>
                        <!-- script for password confirmation -->
                        <script type="text/javascript">
                            window.onload = function () {
                                document.getElementById("password1").onchange = validatePassword;
                                document.getElementById("password2").onchange = validatePassword;
                            }
                            function validatePassword(){
                                var pass2=document.getElementById("password2").value;
                                var pass1=document.getElementById("password1").value;
                                if(pass1!=pass2)
                                    document.getElementById("password2").setCustomValidity("Passwords Don't Match");
                                else
                                    document.getElementById("password2").setCustomValidity('');
                            }
                        </script>

                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

</body>
</html>
