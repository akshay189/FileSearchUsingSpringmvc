<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Page</title>
</head>
<body>

<div class=".divone" style="text-align:center">
<a href= "<c:url value = '/j_spring_security_logout/'/>">
<button>
logout
</button>
</a>
</div>

<form action = "wordsearch/post"  method = "POST" >
    Folder Path: <input type = "text" name = "folder_path">
    <br />
    Search Key: <input type = "text" name = "search_key" />
    <br />
    No.Of Consumer Threads: <input type = "text" name="thread_count"/>
    <br />
    <input type="checkbox" name="sequential" checked="checked" /> Sequential
    <br />
    <input type = "submit" value = "Submit" />
    <br/>
</form>
</body>
</html>