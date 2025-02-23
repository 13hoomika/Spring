<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Course Enrollment Form</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            background-color: #f0f3f5;
            color: #333;
        }

        .container {
            width: 100%;
            max-width: 500px;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 15px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        .container h1 {
            text-align: center;
            color: #34495e;
            margin-bottom: 20px;
            font-size: 1.8em;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 5px;
            display: block;
        }

        input[type="text"], input[type="email"], input[type="date"], select, textarea {
            width: 100%;
            padding: 12px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 1em;
            box-sizing: border-box;
            background-color: #f9f9f9;
        }

        button {
            width: 100%;
            padding: 14px;
            font-size: 1.1em;
            border: none;
            border-radius: 8px;
            background-color: #3498db;
            color: white;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #2980b9;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 25px;
            color: #3498db;
            font-weight: bold;
            text-decoration: none;
            font-size: 1.1em;
            transition: color 0.3s ease;
        }

        a:hover {
            color: #2980b9;
        }

        .form-footer {
            text-align: center;
            margin-top: 20px;
            font-size: 1.1em;
            color: #7f8c8d;
        }
        .msg{
            color:green;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Update Course Enrollment</h1>
    <form action="update" method="POST">
        <input type="text" hidden name="studentId" value="${ enrollments.getStudentId() }">

        <div class="form-group">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your full name" value="${ enrollments.getName() }" required>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email"  value="${ enrollments.getEmail() }" required>
        </div>

        <div class="form-group">
            <label for="courseName">Select Course:</label>
            <select name="courseName" id="courseNameID"  value="${ enrollments.getCourseName() }" required>
                <option value="">--- Select Course ---</option>
                <option value="javaFullStack">Java Full Stack Development</option>
                <option value="pythonFullStack">Python Full Stack Development</option>
                <option value="coreJava">Core Java</option>
            </select>
        </div>

        <div class="form-group">
            <label for="startDateId">Preferred Start Date:</label>
            <input type="date" name="startDate" id="startDateId"  value="${ enrollments.getStartDate() }" required>
        </div>

        <div class="form-group">
            <label for="comments">Comments (Optional):</label>
            <textarea name="comments" id="comments" placeholder="Enter your comments (optional)" rows="4"  value="${ enrollments.getComments() }"></textarea>
        </div>

        <button type="submit">Update</button>
        <h2 class="msg">${ updateMsg }</h2>
    </form>

    <a href="getEnrollments">View All Enrollments</a>

</div>

</body>
</html>
