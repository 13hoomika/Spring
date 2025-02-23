<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact from</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 40px;
            display: flex;
            flex-direction: column;
            align-items: center;
            height: 100vh;
            background-color: #067f7b;
        }
        h1, a {
            color:white;
        }

        form {
            background: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input, select, textarea, button {
            width: 100%;
            margin-bottom: 15px;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-sizing: border-box;
        }

        button {
            background-color: #067f7b;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background-color: #229b97;
        }
        h2{
            color: green;
        }
      </style>
</head>
<body>
<h1>Update Contact Us Details</h1>
<form action="updateRequests" method="POST">
    <input type="text" hidden name="requesterId" value="${ requests.getRequesterId()}">

    <label for="name">Full Name:</label>
    <input type="text" id="name" name="name" value="${ requests.getName()}">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${ requests.getEmail()}">

    <label for="category">Category:</label>
    <select id="category" name="category" value="${ requests.getCategory()}">
        <option value="general">General Inquiry</option>
        <option value="support">Support</option>
        <option value="feedback">Feedback</option>
    </select>

    <label for="phone">Phone</label>
    <input type="tel" id="phone" name="phone" value="${ requests.getPhone()}">

    <label for="message">Message:</label>
    <textarea id="message" name="message" rows="4" value="${ requests.getMessage()}"></textarea>

    <button type="submit">Update</button>
    <h2>${ updateMsg }</h2>
</form>
<a href="./getContact-requests">Got to all contact requests</a>



</body>
</html>