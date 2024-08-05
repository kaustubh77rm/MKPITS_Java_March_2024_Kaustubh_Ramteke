<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="acMaster" class="acmaster.AcMaster"/>  

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Enter Account Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            max-width: 400px;
            width: 100%;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #ffffff;
            text-align: center;
        }

        .form-container h2 {
            margin-bottom: 20px;
            color: #343a40;
        }

        .form-container label {
            display: block;
            margin-bottom: 5px;
            text-align: left;
        }

        .form-container input[type="text"],
        .form-container input[type="password"],
        .form-container input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 18px;
        }

        .form-container input[type="submit"],
        .form-container button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 18px;
        }

        .form-container input[type="submit"]:hover,
        .form-container button:hover {
            background-color: #0056b3;
        }

        .form-container .index-btn {
            background-color: #28a745;
        }

        .form-container .index-btn:hover {
            background-color: #218838;
        }

        .form-container .register-btn {
            background-color: #17a2b8;
        }

        .form-container .register-btn:hover {
            background-color: #117a8b;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="LoggedinServlet" method="post">
            <h2>Enter Account Details</h2>
            <label for="userId">User ID:</label>
            <input type="number" id="userId" name="userId" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <input type="submit" value="Submit">
        </form>

        <form action="index.jsp" method="post">
            <button type="submit" class="index-btn">Go to Index Page</button>
        </form>

        <form action="register.jsp" method="post">
            <button type="submit" class="register-btn">Register</button>
        </form>
    </div>
</body>
</html>