<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>CSRF Custom Exception Test</title>
</head>
<body>
<h1>CSRF Custom Exception Test</h1>
<form id="form" action="${mvc.uri('doPatch')}" method="post" accept-charset="utf-8">

    <input type="hidden" name="_method" value="PATCH">

    <input id="submit" type="submit" name="submit" value="Click here"/>
</form>
</body>
</html>
