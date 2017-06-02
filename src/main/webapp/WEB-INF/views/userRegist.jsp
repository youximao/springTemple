<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/28 0028
  Time: 下午 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% out.print("zhei jds");%>
<form:form commandName="user"  action="/wodeT1/user/regist1" method="post">
    <table>
    <tr><td>名字:</td><td><input type="text" name="name"/></td></tr>

    <tr><td>密码:</td><td><input type="text" name="password"/> </td></tr>
        <tr><input type="text" name="id"/></tr>
    <tr><button type="submit" value="ti jiao"/>提交</tr>
    </table>
</form:form>

</body>
</html>
