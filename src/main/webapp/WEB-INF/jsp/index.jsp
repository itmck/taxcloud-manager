<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.all.js"
            charset="UTF-8"></script>
</head>
<body>


<form action="${pageContext.request.contextPath}/login" method="post" name="bd">

    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="uname" value=""></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="pwd" value=""></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>男<input type="radio" name="sex" value="man">女<input type="radio" name="sex" value="female"
                                                                    checked="checked"></td>
        </tr>
        <tr>
            <td>地区</td>
            <td><select id="expStatus1" name="expStatus" class="newsAdd"
                        onchange="changeCalled()">
                <option>省份</option>
                <option value="4001109919">安徽省</option>
                <option value="4001188910">浙江省</option>
            </select>
                <select id="expStatus2" name="expStatus" class="newsAdd"
                        onchange="query()">
                    <option>市区</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"><input type="reset" value="重置"></td>
        </tr>
    </table>

</form>

</body>
<script>
    //二级联动
    function changeCalled() {
        //改变select 全部接听路线的value
        var v = $("#expStatus1 option:selected").val();
        if (v == '4001109919') {
            $("#expStatus2").children("option").remove();
            var item = '<option value="01">淮南</option>';
            item += '<option value="02">合肥</option>';
            item += '<option value="03">阜阳</option>';
            item += '<option value="04">芜湖</option>';
            $("#expStatus2").append(item); //拼接标签
        }
        if (v == '4001188910') {
            $("#expStatus2").children("option").remove();
            var item = '<option value="05">萧山 </option>';
            item += '<option value="05">杭州</option>';
            item += '<option value="06">温州</option>';
            $("#expStatus2").append(item); //拼接标签
        }
    }
</script>
</html>
