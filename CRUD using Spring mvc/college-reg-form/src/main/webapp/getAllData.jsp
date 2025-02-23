<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "bcp" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profiles</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    <style>
        body {
            text-align: center;
            padding: 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
            height: 100vh;
        }
        table {
            border-collapse: collapse;
            width: 100%;
            margin-left:5%;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #463acb;
            color:white;
        }

        tr:hover {
            background-color: #ecebfa;
        }
        a {
            display: inline-block;
            margin-bottom: 20px;
            font-size: 18px;
            color: #007bff;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        .material-icons {
          font-size: 24px;
          color: red;
          vertical-align: middle;
        }
        .material-icons.orange600 { color: #FB8C00; }
    </style>
</head>
<body>
    <h1>All Registrations</h1>
    <table>
        <tr>
            <th>Sl.No</th>
            <th>Full Name</th>
            <th>USN</th>
            <th>Email</th>
            <th>Qualification</th>
            <th>Contact Number</th>
            <th>Year Of Passing</th>
            <th>Action</th>
        </tr>

        <bcp:forEach items= "${ ListOfRegistrations }" var="registrations">
            <tr>
                <td> ${ registrations.getId() } </td>
                <td> ${ registrations.getFullName() } </td>
                <td> ${ registrations.getUsn() } </td>
                <td> ${ registrations.getEmailId() } </td>
                <td> ${ registrations.getQualification() } </td>
                <td> ${ registrations.getContactNumber() } </td>
                <td> ${ registrations.getYearOfPass() } </td>
                <td><a href="delete?id=${registrations.getId()}"><i class="material-icons">delete</i></a> &nbsp
                <a href="getRegister?id=${registrations.getId()}"><i class="material-icons orange600">edit</i></a></td>
            </tr>
        </bcp:forEach>
    </table>
    <a href="./">Go to Form</a>

</body>
</html>