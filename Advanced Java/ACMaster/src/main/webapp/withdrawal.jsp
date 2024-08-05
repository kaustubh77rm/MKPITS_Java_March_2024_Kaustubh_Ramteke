<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="withdrawal" class="acmaster.Withdrawal"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Withdrawal</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2>Enter Withdrawal Amount</h2>
    <form action="withdrawalprocess.jsp" method="post">
        <div class="form-group">
            <label for="userid">User ID:</label>
            <input type="text" class="form-control" id="userid" name="userid" required>
        </div>
        <div class="form-group">
            <label for="withdrawal">Withdrawal Amount:</label>
            <input type="number" class="form-control" id="withdrawal" name="withdrawal" required>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    
    <br>
    <form action="ShowDetails.jsp" method="post">
    <button type="submit" class="btn btn-primary">Back</button>
    </form>
</div>

</body>
</html>