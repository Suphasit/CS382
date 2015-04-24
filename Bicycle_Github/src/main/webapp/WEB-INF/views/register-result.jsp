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
					<h1 id="logo"><a href="register">Bike Project</a></h1>
				
				<!-- Nav -->
					<nav id="nav">
						<ul>
							<li><a href="register">Home</a></li>
							<li><a href="#">Station</a></li>
							<li><a href="register">Register</a></li>
							<li><a href="#">Contact</a></li>
						</ul>
					</nav>

			</header><!-- ./Header -->
			
			
		<!-- Work -->
			<section id="work" class="main style3 secondary">
				<div class="content container">
					<header>
						<h2>Registered Successfully!</h2>
						<p>การสมัครสมาชิกเสร็จสมบูรณ์ ระบบได้ทำการบันทึกข้อมูลของท่านในระบบตามข้อมูลด้านล่างนี้</p>
						<p>ชื่อ-นามสกุล: ศุภสิทธิ์ ทองเนียม<br>เลขบัตรประชาชน: 1103000057886</p>
					</header>
				</div>
			</section><!-- ./Work -->
			
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