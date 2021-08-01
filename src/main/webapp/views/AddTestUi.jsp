<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<title>TEST ADD</title>
   
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
   

    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="/css/UserRegistration.css">
	
	</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>ADD NEW TEST</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
				<form>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span >Test Name</span>
						</div>
						<input type="text" class="form-control" placeholder="Test Name">
						
					</div>
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span>Test Code</span>
						</div>
						<input type="text" class="form-control" placeholder="Test Code">
						
					</div>
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
								<span>Test Price</span>
						</div>
						<input type="text" class="form-control" placeholder="Test Price">
						
					</div>
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
								<span>Adding Date</span>
						</div>
						<input type=Date class="form-control" placeholder="Adding Date">
						
					</div>
				
					
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
								<span>User </span>
						</div>
						
						<select class="form-select form-select-sm form-control" aria-label=".form-select-sm example">
						  <option selected>Alam Shaikh</option>
						  <option value="1">Salim Shaikh</option>
						  <option value="2">Raju Shaikh</option>
						 
						</select>
					</div>
					
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
								<span>Group  </span>
						</div>
						
						<select class="form-select form-select-sm form-control" aria-label=".form-select-sm example">
						  <option selected>Homoglobin</option>
						  <option value="1">Biologychem</option>
						  <option value="2">Chemesty</option>
						 
						</select>
					</div>
					
					
					
					
					
					
					
						
					
					<div class="form-group">
						<input type="submit" value="Register" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			
		</div>
	</div>
</div>
</body>
</html>