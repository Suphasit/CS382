<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Big Picture by HTML5 UP</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
		<script src="<c:url value="/resources/js/jquery.poptrox.min.js" />"></script>
		<script src="<c:url value="/resources/js/skel.min.js" />"></script>
		<script src="<c:url value="/resources/js/init.js" />"></script>
		
		<link href="<c:url value="/resources/css/skel-noscript.css" />" rel="stylesheet"  type="text/css" />
		<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"  type="text/css" />
		
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<body>

		<!-- Header -->
			<header id="header">

				<!-- Logo -->
					<h1 id="logo"><a href="#">Bike Project</a></h1>
				
				<!-- Nav -->
					<nav id="nav">
						<ul>
							<li><a href="#intro">Home</a></li>
							<li><a href="register-result.jsp">Station</a></li>
							<li><a href="#work">Register</a></li>
							<li><a href="#contact">Contact</a></li>
						</ul>
					</nav>

			</header><!-- ./Header -->
			
			
		<!-- Contact -->
			<section id="contact" class="main style3 secondary">
				<div class="content container">
					<header>
						<h2>Register</h2>
						<p>Before reserving bicycles you have to register member to receive member card first.</p>
					</header>
					<div class="box container small">
					
						<!--
							 Contact Form
							 
							 To get this working, place a script on your server to receive the form data, then
							 point the "action" attribute to it (eg. action="http://mydomain.tld/mail.php").
							 More on how it all works here: http://www.1stwebdesigner.com/tutorials/custom-php-contact-forms/
						-->
							<form action="addCustomer" method="POST" name="registerForm">
								<div class="row half">
									<div class="6u"><input type="text" name="fname" placeholder="Firstname" /></div>
									<div class="6u"><input type="text" name="lname" placeholder="Lastname" /></div>
								</div>
								<div class="row half">
									<div class="12u"><input type="text" name="citizenID" placeholder="Citizen ID" /></div>
								</div>
								<div class="row">
									<div class="12u">
										<ul class="actions">
											<li><input type="submit" class="button" value="Register" /></li>
										</ul>
									</div>
								</div>
							</form>

					</div>
				</div>
			</section><!-- ./Contact -->
			
		<!-- Footer -->
			<footer id="footer">
			
				<!--
				     Social Icons
				     
				     Use anything from here: http://fortawesome.github.io/Font-Awesome/cheatsheet/)
				-->
					<ul class="actions">
						<li><a href="#" class="fa solo fa-twitter"><span>Twitter</span></a></li>
						<li><a href="#" class="fa solo fa-facebook"><span>Facebook</span></a></li>
						<li><a href="#" class="fa solo fa-google-plus"><span>Google+</span></a></li>
						<li><a href="#" class="fa solo fa-dribbble"><span>Dribbble</span></a></li>
						<li><a href="#" class="fa solo fa-pinterest"><span>Pinterest</span></a></li>
						<li><a href="#" class="fa solo fa-instagram"><span>Instagram</span></a></li>
					</ul>

				<!-- Menu -->
					<ul class="menu">
						<li>&copy; Untitled</li>
						<li>Design: <a href="http://html5up.net/">HTML5 UP</a></li>
					</ul>
			
			</footer><!-- ./Footer -->

	</body>
</html>