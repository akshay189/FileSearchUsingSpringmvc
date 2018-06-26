<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<%@ page isELIgnored="false" %>
<h1>

${ message }
</h1>
<a href= "<c:url value = '/'/>">
 <button>
 back
 </button>
 </a>
<div class=".divone" style="text-align:center">
<a href= "<c:url value = '/j_spring_security_logout/'/>">
<button>
logout
</button>
</a>
</div>
<br />
<br />
<h2>details</h2>
<h1>${map}</h1>
</body>
</html>