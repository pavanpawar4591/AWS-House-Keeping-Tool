<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	
	
}

.form-signin input[type="text"] {
	margin-bottom: 5px;
	border-bottom-left-radius: 0;
	border-bottom-right-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

.form-signin .form-control {
	position: relative;
	font-size: 16px;
	font-family: 'Open Sans', Arial, Helvetica, sans-serif;
	height: auto;
	padding: 10px;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.vertical-offset-100 {
	padding-top: 100px;
}

.img-responsive {
	display: block;
	max-width: 100%;
	height: auto;
	margin: auto;
}

.panel {
	margin-bottom: 20px;
	background-color: rgba(255, 255, 255, 0.75);
	border: 1px solid transparent;
	border-radius: 4px;
	-webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

<
style>#myelement {
	max-width: auto;
	height: 600px;
	font-size: 2em;
	font-weight: bold;
	margin: 50px auto;
	text-align: center;
	-webkit-animation: colorchange 5s linear 1s infinite alternate;
	animation: colorchange 5s linear 1s infinite alternate;
}

#myelement i {
	font-size: 50px;
	color: #fff;
	text-align: center;
	line-height: 400px;
}

@
keyframes colorchange { 0% {
	background-color: #00F; /* from: blue */
}

25%
{
background-color
:
 
#F00
; /* red        */
 
}
50%
{
background-color
:
 
#0F0
; /* green      */
 
}
75%
{
background-color
:
 
#F0F
; /* purple     */
 
}
100%
{
background-color
:
 
#00F
; /* to: blue   */
 
}
}
form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}


</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="#" class="navbar-brand">HK Tool</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>

		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">

		<div class="row" style="margin-top: 20px">
			<div
				class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
				<form action="login.do" method="post">
					<fieldset>
						<h2>Sign In To Your Account</h2>
						<h4>
							<font color="red">${errorMessage}</font>
						</h4>
						<hr class="colorgraph">
						<div class="form-group">
							<input type="text" name="name" id="name"
								class="form-control input-lg" placeholder="Username">
						</div>
						<div class="form-group">
							<input type="password" name="password" id="password"
								class="form-control input-lg" placeholder="Password">
						</div>

						<hr class="colorgraph">
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6">
								<input type="submit" class="btn btn-lg btn-success btn-block"
									value="Login">
							</div>

						</div>
					</fieldset>
				</form>
			</div>
		</div>

	</div>
	<div id="myelement">
		<i class="fa fa-diamond"></i>
	</div>
	<footer class="footer">
		<div>&copy; 2017 AWS house Keeping Tool</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>