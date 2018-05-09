$(function () {
    $("#id").click(function () {
      var parms = $("form").serializeArray();
      var values = {};
      for( x in parms){
          values[parms[x].name] = parms[x].value;
      }

        alert(JSON.stringify(values))
        $.ajax({
            type: "post",
            url: "/admin/insert",
            dataType: "application/json;charset=utf-8",
            data: JSON.stringify(values),
            success: function (data) {
                if (data!=null) {
                    alert("新增成功");
                } else {
                    alert("失败")
                };
            }

        });

    });

})