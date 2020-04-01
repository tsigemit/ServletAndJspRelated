<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World Java EE</title>
</head>
<body>
    <h1>Enter Your Infomation Here!</h1>
   <form action="helloServlet" method="post">
   <P> &nbsp; <P> &nbsp;
    Enter your first name: <input type="text" name="yourFirstName" size="20"><br> <br>
    Enter your last name: <input type="text" name="yourLastName" size="20"><br><br>
    Enter your Age: &nbsp; &nbsp; &nbsp; &nbsp;  <input type="text" name="yourAge" size="20"><br><br>
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    <input type="submit" value="Submit" />
  </form>
</body>
</html>