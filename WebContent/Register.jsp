
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
$('#myDate').val(new Date().toDateInputValue());
});
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method=post action="RegisterUser" style="border:1px solid #ccc">
<div class="container">
<h1>Registration Form</h1>

  Name:<input type="text" name ="username"></br>
  Passcode:<input type="password" name="password"></br>
  <label for="gender"><b>Gender</b></label></br>
  <input type="radio" name="gender" value="male"> Male
  <input type="radio" name="gender" value="female">female</br>
  Date:<input type="date" id="myDate" name="date"></br>
  Email:<input type="text" name="email"></br>
  Mobile:<input type="text" name="mobile"></br>
  Street:<input type="text" name="street"></br>
  City:<input type="text" name="city"></br>
  State:<input type="text" name="state"></br>
  Country:<input type="text" name="country"></br>
  PinCode:<input type="text" name="pin"></br>
  <input type="submit" value="Submit"></form>
</div>
</body>
</html>