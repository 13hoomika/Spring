<html>
<head>
        <meta charset="UTF-8">
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
        </style>
</head>
<body>
    <form action="CollegeRegistration" method="post">
            <h1>College Registration Form</h1>
            <label>Enter Full Name:</label>
            <input type="text" name="fullName" placeholder="Full Name"><br>
            <label>Enter Contact Number:</label>
            <input type="tel" name="contactNumber"><br>
            <label>Enter Email:</label>
            <input type="email" name="emailId" placeholder="example@gmail.com"><br>
            <label>Enter your USN:</label>
            <input type="text" name="usn" placeholder ="USN000"><br>
            <label>Enter previous qualification:</label>
            <input type="text" name="qualification"><br>
            <label>Year of Pass-out:</label>
            <input type="number" name="yearOfPass"><br>

            <input type="submit" value="Register" name="register" >
            <a href="./getAllData">Click here to get all registrations</a>

    </form>

</body>
</html>