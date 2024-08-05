<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="deposit" class="acmaster.Deposit"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deposit</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h2>Enter Deposit Amount</h2>
    <form action="DepositProcess.jsp" method="post">
        <div class="form-group">
            <label for="userid">User ID:</label>
            <input type="text" class="form-control" id="userid" name="userid" required>
        </div>
        <div class="form-group">
            <label for="deposit">Deposit Amount:</label>
            <input type="number" class="form-control" id="deposit" name="deposit" required>
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