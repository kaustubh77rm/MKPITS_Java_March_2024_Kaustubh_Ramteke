<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Enter Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 21px;
            padding: 0;
        }
        .container {
            width: 25%;
            margin: auto;
            background-color: #fff;
            padding: 22px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
        	font-size:25px;
            margin: 1px;
            font-weight: bold;
        }
        input[type="text"] {
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"], button {
        	font-size:18px;
            padding: 10px 20px;
            background-color: #5cb85c;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 10px;
        }
        button {
        	font-size:18px;
            background-color: #0275d8;
        }
        input[type="submit"]:hover, button:hover {
        	font-size:18px;
            background-color: #4cae4c;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Enter Details</h1>
        <form action="SaveDetails" method="post">
            <label for="rollno">Roll No</label>
            <input type="text" id="rollno" name="rollno" required><br><br>
            
            <label for="name">Name</label>
            <input type="text" id="name" name="name" required><br><br>
            
            <label for="address">Address</label>
            <input type="text" id="address" name="address" required><br><br>
            
            <label for="city">City</label>
            <input type="text" id="city" name="city" required><br><br>
            
            <input type="submit" value="Submit">
        </form>
        <form action="Table.jsp" method="get">
        <button type="submit">Show Details Table</button>
        </form>
    </div>
</body>
</html>