$(function () {
    $("#id").click(function () {
      var parms = $("form").serializeArray();
      var values = {};
      for( x in parms){
          values[parms[x].name] = parms[x].value;
      }

        var web = JSON.stringify(values)
        var parse = JSON.parse(web)

        $.ajax({
            type:"post",
            url:"/admin/insert",
            data:{'name':JSON.stringify(values)},
            dataType:"json",
            success: function (data) {
                if (data.username!=null&&data.username==parse.username) {
                    alert("登录成功");
                    self.location='homepage.jsp';
                } else {
                    alert("登录失败"+JSON.stringify(values))
                };
            }

        });

    });

})