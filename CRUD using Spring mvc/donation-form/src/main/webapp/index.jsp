<html>
<head>
    <title>Donation Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            padding: 40px;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            background-color: #f5f5f5;
        }

        form {
            background: #fff;
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
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }
      </style>
</head>
<body>
<h1>Donation Form</h1>
<form action="donate" method="POST">
    <input type="text" name="name" placeholder="Full Name">
    <input type="email" name="email" placeholder="Email">
    <input type="text" name="donationType" placeholder="Donation Type (e.g., Money, Items)">
    <input type="number" name="amount" placeholder="Donation Amount (if applicable)">
    <input type="text" name="message" placeholder="Message for the Organization">
    <button type="submit">Donate</button>
</form>
<a href="allDonations">View all donations </a>

</body>
</html>