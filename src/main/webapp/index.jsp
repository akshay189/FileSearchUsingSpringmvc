<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Page</title>
</head>
<body>
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