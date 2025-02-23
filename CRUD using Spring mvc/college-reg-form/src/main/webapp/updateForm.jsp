<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "bcp" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
        <title>SDIT</title>
        <style>
                body {
                    font-family: Arial, sans-serif;
                    padding: 20px;
                    display: flex;
                    flex-direction: column;
                    align-items: center;
                    height: 100vh;
                    background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);

                form {
                    width: 60%;
                    margin: 40px auto;
                    padding: 20px;
                    background-color: white;
                    border: 1px solid #ddd;
                    border-radius: 10px;
                    box-shadow: 0 0 10px rgba(0,0,0,0.1);
                }

                h1 {
                    text-align: center;
                }

                label {
                    display: block;
                    margin-bottom: 10px;
                }

                input[type="text"],input[type="tel"],input[type="number"],input[type="email"] {
                    width: 100%;
                    height: 40px;
                    margin-bottom: 20px;
                    padding: 10px;
                    border: 1px solid #ccc;
                    border-radius: 5px;
                }

                input[type="submit"] {
                    width: 100%;
                    height: 40px;
                    background-color: #463acb;
                    color: #fff;
                    padding: 10px;
                    border: none;
                    border-radius: 5px;

                }
                h2{
                    color:green;
                }
        </style>
</head>
<body>
    <form action="update" method="post">
            <h1>Update Registration Form</h1>
            <input type="text" hidden name="id" value="${ registrations.getId() }">

            <label>Enter Full Name:</label>
            <input type="text" name="fullName" placeholder="Enter full name" value= "${ registrations.getFullName() }"><br>
            <label>Enter Contact Number:</label>
            <input type="tel" name="contactNumber" placeholder="9876543211" value= "${ registrations.getContactNumber() }"><br>
            <label>Enter Email:</label>
            <input type="email" name="emailId" placeholder="example@gmail.com" value= "${ registrations.getEmailId() }"><br>
            <label>Enter your USN:</label>
            <input type="text" name="usn" placeholder ="USN000" value= "${ registrations.getUsn() }"><br>
            <label>Enter previous qualification:</label>
            <input type="text" name="qualification" value= "${ registrations.getQualification() }"><br>
            <label>Year of Pass-out:</label>
            <input type="number" name="yearOfPass" value= "${ registrations.getYearOfPass() }"><br>

            <input type="submit" value="Update Details">
            <h2>${ updateMsg }</h2>
    </form>
    <a href="./getAllData">Click here to get all registrations</a>

</body>
</html>