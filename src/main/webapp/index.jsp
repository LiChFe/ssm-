<%--
  Created by IntelliJ IDEA.
  User: Tristan
  Date: 2019/8/19
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="account/findAll">测试</a>

    <form action="account/save" method="post">
    姓名：<input type="text"  name="name"><br/>
    金额：<input type="text" name="money" ><br/>
    <input type="submit" value="提交"><br/>
    </form>
    <br>
    <br>

        <h2>需要删除的用户id</h2>
        <form action="account/delete" method="post">
            <input type="text" name="id">
            <input type="submit" value="提交">
        </form>

</body>
</html>
