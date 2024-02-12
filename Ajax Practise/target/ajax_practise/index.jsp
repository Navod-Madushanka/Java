<%--
  Created by IntelliJ IDEA.
  User: Navod Madusanka
  Date: 5/28/2023
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label for="user">User:</label>
<select id="user" name="user">
    <option value="1">Hasitha</option>
    <option value="2">Navod</option>
    <option value="3">Madushanka</option>
    <option value="4">Maithripala</option>
</select>
<br />
<br />
<label for="product">Product:</label>
<select id="product" name="product">
    <option value="1">iPhone 14</option>
    <option value="2">Pixel</option>
    <option value="3">oppo</option>
    <option value="4">Samsung</option>
</select>
<br />
<br />
<label for="qty">QTY:</label>
<input id="qty" type="number" />
<br />
<br />
<button id="btn">Add</button>
<script src="script.js"></script>
</body>
</html>
