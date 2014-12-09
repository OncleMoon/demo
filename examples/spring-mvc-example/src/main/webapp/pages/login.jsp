<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">

	<title>Spring MVC Example</title>

	<!-- Bootstrap core CSS -->
	<link href="resources/bootstrap/js/bootstrap.min.js" rel="stylesheet">
	<link href="resources/jQuery/jquery-2.1.1.min.js" rel="stylesheet">
	<link href="resources/js/login.js" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="resources/css/signin.css" rel="stylesheet">

	</head>

	<body>
		<div class="container">
			<form class="form-signin" role="form">
				<h2 class="form-signin-heading">Please sign in</h2>
				<label for="inputEmail" class="sr-only">Email address</label> 
				<input type="email" id="inputEmail" class="form-control" cplaceholder="Email address" required="" autofocus=""> 
				<label for="inputPassword" class="sr-only">Password</label> 
				<input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
				<div class="checkbox">
					<label> 
						<input type="checkbox" value="remember-me">
						Remember me
					</label>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
			</form>
		</div>
		<!-- /container -->
	</body>
</html>