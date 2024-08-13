<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<jsp:useBean id="log" class="acc.AccountDAO" scope="application">
<jsp:setProperty name="log" property="*" />
</jsp:useBean>

<p>Login Page</p>
			<form action="loginprocess.jsp" method="post">
			
            <div class="form-group">
                <label for="email">Email</label>
                <input type="text" class="form-control" id="email" name="email" required>
            </div>
            
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            
            <button type="submit" class="btn btn-primary">Login</button>
			</form>            
            
            <form action="index.html" method="post">
            <button type="submit" class="btn btn-primary">Back</button>
			</form>       	
</body>
</html>