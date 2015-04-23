package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_002derror_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Big Picture by HTML5 UP</title>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"css/ie/html5shiv.js\"></script><![endif]-->\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.poptrox.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/skel.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\r\n");
      out.write("\t\t<noscript>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("\t\t</noscript>\r\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie/v8.css\" /><![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t\t<header id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t\t<h1 id=\"logo\"><a href=\"#\">Bike Project</a></h1>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Nav -->\r\n");
      out.write("\t\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#intro\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#one\">Station</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#work\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</header><!-- ./Header -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<!-- Work -->\r\n");
      out.write("\t\t\t<section id=\"work\" class=\"main style3 secondary\">\r\n");
      out.write("\t\t\t\t<div class=\"content container\">\r\n");
      out.write("\t\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/my-images/error.png\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Error!!</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>à¹à¸à¸´à¸à¸à¹à¸­à¸à¸´à¸à¸à¸¥à¸²à¸ à¸à¸¸à¸à¸à¸£à¸­à¸à¸à¹à¸­à¸¡à¸¹à¸¥à¹à¸¡à¹à¸à¸£à¸</p>\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"register.jsp\">à¸à¸¥à¸´à¹à¸à¸à¸µà¹à¸à¸µà¹</a> à¹à¸à¸·à¹à¸­à¸¥à¸­à¸à¸­à¸µà¸à¸à¸£à¸±à¹à¸</p>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section><!-- ./Work -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<!-- Footer -->\r\n");
      out.write("\t\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t     Social Icons\r\n");
      out.write("\t\t\t\t     \r\n");
      out.write("\t\t\t\t     Use anything from here: http://fortawesome.github.io/Font-Awesome/cheatsheet/)\r\n");
      out.write("\t\t\t\t-->\r\n");
      out.write("\t\t\t\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa solo fa-twitter\"><span>Twitter</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa solo fa-facebook\"><span>Facebook</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa solo fa-google-plus\"><span>Google+</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa solo fa-dribbble\"><span>Dribbble</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa solo fa-pinterest\"><span>Pinterest</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa solo fa-instagram\"><span>Instagram</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Menu -->\r\n");
      out.write("\t\t\t\t\t<ul class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<li>&copy; Untitled</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Design: <a href=\"http://html5up.net/\">HTML5 UP</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</footer><!-- ./Footer -->\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
