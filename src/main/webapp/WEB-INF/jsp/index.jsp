<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.all.js" charset="UTF-8"></script>
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
            <td>男<input type="radio" name="sex" value="man">女<input type="radio" name="sex" value="female" checked="checked"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><select name="city">
                <option value="">城市</option>
                <option value="杭州" >杭州</option>
                <option value="深圳" selected="selected">深圳</option>
                <option value="合肥">合肥</option>
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

</script>
</html>
