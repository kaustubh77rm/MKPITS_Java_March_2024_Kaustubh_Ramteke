<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <style>
        body {
            background-color: #f8f9fa; /* Light background color */
        }
        header {
            margin-bottom: 20px; /* Space below the header */
        }
        .card {
            margin-top: 20px; /* Space above the card */
        }
        .navbar {
            padding: 10px; /* Padding for navbar */
        }
        h2 {
            color: tomato; /* Color for headings */
        }
        .form-control {
            border-radius: 5px; /* Rounded corners for input fields */
        }
        .btn-success {
            border-radius: 5px; /* Rounded corners for buttons */
        }
        .error-message {
            color: red;
            font-size: 14px;
            margin-top: 5px;
         }
    </style>
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
            <div>
                <p> User Management App </p>
            </div>
            <ul class="navbar-nav">
                <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Users</a></li>
            </ul>
        </nav>
    </header>
    
    <div class="container col-md-5">
        <div class="card">
            <div class="card-body">
                <c:if test="${user != null}">
                    <form action="update" method="post" onsubmit="return validateForm()">
                    
                </c:if>
                <c:if test="${user == null}">
                    <form action="insert" method="post" onsubmit="return validateForm()">
                </c:if>

                <caption>
                    <h2>
                        <c:if test="${user != null}">
                            Update User
                        </c:if>
                        <c:if test="${user == null}">
                            Add New User
                        </c:if>
                    </h2>
                </caption>

                <c:if test="${user != null}">
                    <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                </c:if>

                <fieldset class="form-group">
                    <label>User Name</label>
                    <input type="text" id="name" value="<c:out value='${user.name}' />" class="form-control" name="name">
                    <span id="name-error" class="error-message"></span>
                </fieldset>

                <fieldset class="form-group">
                    <label>User Email</label>
                    <input type="text" id="email" value="<c:out value='${user.email}' />" class="form-control" name="email">
                    <span id="email-error" class="error-message"></span>
                </fieldset>

                <fieldset class="form-group">
                    <label>User Country</label>
                    <input type="text" id="country" value="<c:out value='${user.country}' />" class="form-control" name="country">
                    <span id="country-error" class="error-message"></span>
                </fieldset>

                <button type="submit" class="btn btn-success" >Save</button>
                </form>
            </div>
        </div>
    </div>
</body>
<!-- js -->
<script>
function validateForm() {
	const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const country = document.getElementById("country").value;
    
    const nameError = document.getElementById("name-error");
    const emailError = document.getElementById("email-error");
    const countryError = document.getElementById("country-error");
    
    nameError.textContent = "";
    emailError.textContent = "";
    countryError.textContent = "";

    let isValid = true;

    if (name === "" || /\d/.test(name)) {
        nameError.textContent ="Please enter your name properly.";
        isValid = false;
    }

    if (email === "" || !email.includes("@")) {
        emailError.textContent ="Please enter a valid email address.";
        isValid = false;
    }
    
    if (country === "") {
        countryError.textContent ="Please enter your country.";
        isValid = false;
    }
    
    return isValid;
}
</script>
</html>