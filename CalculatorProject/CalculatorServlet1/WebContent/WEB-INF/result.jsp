<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- action should be name of servlet ==> not specify method type ==> default is GET -->
 	<form action='calc2' method='POST'>
		<input type = 'text' size = '2' name = 'add1' value = "${requestScope.add1}" />
		<input type = 'text' size = '2' name = 'add2' value = "${add2}" />
		<input type = 'text' size = '4' name = 'sum' value = "${sum.sum}" readonly  /> <br/>
		<input type = 'text' size = '2' name = 'mult1' value = "${mult1}" />*
		<input type = 'text' size = '2' name = 'mult2' value = "${mult2}"  />=
		<input type = 'text' size = '4' name = 'product' value = "${product.product}" readonly  /><br/>
		<input type = 'submit' value = 'Submit'/>
	</form>	 
</body>
</html>