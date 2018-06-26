<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<%@ page isELIgnored="false" %>
<div class=".divone" style="text-align:center">
<a href= "<c:url value = '/'/>">
 <button style="margin-left:auto;margin-right:auto">
 back
  </button>
  </a>
  </div>
<br />
<br />
<h1>${ message}</h1>
</body>
</html>