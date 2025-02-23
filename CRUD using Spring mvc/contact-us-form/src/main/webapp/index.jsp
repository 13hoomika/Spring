<!DOCTYPE html>
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
      </style>
</head>
<body>
<h1>Contact Us </h1>
<form action="contact" method="POST">
    <label for="name">Full Name:</label>
    <input type="text" id="name" name="name">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email">

    <label for="category">Category:</label>
    <select id="category" name="category">
        <option value="general">General Inquiry</option>
        <option value="support">Support</option>
        <option value="feedback">Feedback</option>
    </select>

    <label for="phone">Phone</label>
    <input type="tel" id="phone" name="phone">

    <label for="message">Message:</label>
    <textarea id="message" name="message" rows="4"></textarea>

    <button type="submit">Submit</button>
</form>
<a href="./getContact-requests">Click here to see all contact requests</a>
</body>
</html>