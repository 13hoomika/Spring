<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "bcp" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <style>
        body {
          font-family: 'lato', sans-serif;
        }
        .container {
          max-width: 1000px;
          margin-left: auto;
          margin-right: auto;
          padding-left: 10px;
          padding-right: 10px;
        }

        h2 {
          font-size: 26px;
          margin: 20px 0;
          text-align: center;
          small {
            font-size: 0.5em;
          }
        }

        .responsive-table {
          li {
            border-radius: 3px;
            padding: 25px 30px;
            display: flex;
            justify-content: space-between;
            margin-bottom: 25px;
          }
          .table-header {
            background-color: #95A5A6;
            font-size: 14px;
            text-transform: uppercase;
            letter-spacing: 0.03em;
          }
          .table-row {
            background-color: #ffffff;
            box-shadow: 0px 0px 9px 0px rgba(0,0,0,0.1);
          }
          .col-1 {
            flex-basis: 10%;
          }
          .col-2 {
            flex-basis: 40%;
          }

          .col-3, .col-4, .col-5, .col-6{
            flex-basis: 25%;
          }
          .col-7{
            flex-basis: 15%;
          }

          @media all and (max-width: 767px) {
            .table-header {
              display: none;
            }
            .table-row{

            }
            li {
              display: block;
            }
            .col {
              flex-basis: 100%;
            }
            .col {
              display: flex;
              padding: 10px 0;
              &:before {
                color: #6C7A89;
                padding-right: 10px;
                content: attr(data-label);
                flex-basis: 50%;
                text-align: right;
              }
            }
          }
          .material-icons {
              font-size: 24px;
              color: red;
              vertical-align: right;
          }
          .material-icons.edit {
                font-size: 24px;
                color: grey;
                vertical-align: left;
            }

        }
    </style>
</head>
<body>
<div class="container">
    <h2>All Customer Requests</h2>
    <ul class="responsive-table">
        <li class="table-header">
            <div class="col col-1">StudentId</div>
            <div class="col col-2">Name</div>
            <div class="col col-3">Email</div>
            <div class="col col-4">Course Name</div>
            <div class="col col-5">Start Date</div>
            <div class="col col-6">Comments</div>
            <div class="col col-7">Action</div>
        </li>
        <bcp:forEach items= "${ enrollmentList }" var="enrollments">
            <li class="table-row">
                <div class="col col-1" data-label="StudentId">${ enrollments.getStudentId() }</div>
                <div class="col col-2" data-label="Name">${ enrollments.getName() }</div>
                <div class="col col-3" data-label="Email">${ enrollments.getEmail() }</div>
                <div class="col col-4" data-label="Course Name">${ enrollments.getCourseName() }</div>
                <div class="col col-5" data-label="Start Date">${ enrollments.getStartDate() }</div>
                <div class="col col-6" data-label="Comments">${ enrollments.getComments() }</div>
                <div class="col col-7" data-label="Action"><a href="delete?id=${ enrollments.getStudentId() }"><i class="material-icons">delete</i></a> &nbsp;
                <a href="getId?id=${ enrollments.getStudentId() }"><i class="material-icons edit">edit</i></a></div>
            </li>
        </bcp:forEach>
    </ul>
</div>

</body>
</html>