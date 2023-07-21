<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      
        body {
            background-color: #f8f9fa;
            padding:10px;
            margine:20px;
        }

        .form-container {
            background-color: #ffffff;
            border: 1px solid #ced4da;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .form-title {
            text-align: center;
            margin-bottom: 20px;
        }

        .btn-register {
            background-color: #007bff;
            border: none;
        }

        .btn-register:hover {
            background-color: #0056b3;
        }
            </style>
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-sm-8 col-md-6 col-lg-4 form-container">
                <h2 class="form-title">User Registration</h2>
                <form action="ServletRegistration" method="post">
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" class="form-control" id="name" name="name" required>
                    </div>

                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" name="email" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="address">Address:</label>
                        <input type="text" class="form-control" id="address" name="address" required>
                    </div>
                    

                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>

                    <div class="form-group">
                        <label for="contact">Contact Number:</label>
                        <input type="tel" class="form-control" id="contact" name="contact" required>
                    </div>

                    <div class="form-group">
                        <label for="dob">Date of Birth:</label>
                        <input type="date" class="form-control" id="dob" name="dob" required>
                    </div>
                    <div class="mb-3"></div>
						  <div class="text-center"> 
                        <button type="submit" class="btn btn-primary btn-register">Register</button>
                    </div>
                    
                </form>
            </div>
        </div>
    </div>

