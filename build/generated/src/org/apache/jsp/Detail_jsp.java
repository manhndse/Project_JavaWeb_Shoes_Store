package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html  >\n");
      out.write("<head>\n");
      out.write("  <!-- Site made with Mobirise Website Builder v5.2.0, https://mobirise.com -->\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"generator\" content=\"Mobirise v5.2.0, mobirise.com\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1\">\n");
      out.write("  <link rel=\"shortcut icon\" href=\"assets/images/doublemlogo-96x96.png\" type=\"image/x-icon\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <title>Buy</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/tether/tether.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-grid.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-reboot.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/dropdown/css/style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/socicon/css/styles.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\n");
      out.write("  <link rel=\"preload\" as=\"style\" href=\"assets/mobirise/css/mbr-additional.css\"><link rel=\"stylesheet\" href=\"assets/mobirise/css/mbr-additional.css\" type=\"text/css\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  <section class=\"menu menu2 cid-sfR2QEthON\" once=\"menu\" id=\"menu2-1k\">\n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-dropdown navbar-fixed-top navbar-expand-lg\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-brand\">\n");
      out.write("                <span class=\"navbar-logo\">\n");
      out.write("                    <a href=\"http://index.html\">\n");
      out.write("                        <img src=\"assets/images/doublemlogo-96x96.png\" alt=\"Mobirise\" style=\"height: 3.8rem;\">\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"navbar-caption-wrap\"><a class=\"navbar-caption text-black display-7\" href=\"https://mobiri.se\">Double M</a></span>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <div class=\"hamburger\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                </div>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav nav-dropdown nav-right\" data-app-modern-menu=\"true\"><li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"https://mobiri.se\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"https://mobiri.se\">Login</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"https://mobiri.se\">Register</a>\n");
      out.write("                    </li></ul>\n");
      out.write("                <div class=\"icons-menu\">\n");
      out.write("                    <a class=\"iconfont-wrapper\" href=\"https://www.facebook.com/ducmanh10x/\" target=\"_blank\">\n");
      out.write("                        <span class=\"p-2 mbr-iconfont socicon-facebook socicon\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"iconfont-wrapper\" href=\"https://www.instagram.com/amanh.xanhla/\" target=\"_blank\">\n");
      out.write("                        <span class=\"p-2 mbr-iconfont socicon-instagram socicon\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"features16 cid-sfXIHfOHJr\" id=\"features17-1l\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-12 col-lg-6\">\n");
      out.write("                    <div class=\"image-wrapper\">\n");
      out.write("                        <img src=\"assets/images/sq1.jpg\" alt=\"Mobirise\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-lg\">\n");
      out.write("                    <div class=\"text-wrapper\">\n");
      out.write("                        <h6 class=\"card-title mbr-fonts-style display-5\">\n");
      out.write("                            <strong>Easy and simple</strong>\n");
      out.write("                        </h6>\n");
      out.write("                        <p class=\"mbr-text mbr-fonts-style mb-4 display-4\">\n");
      out.write("                            All sites you create with the Mobirise web builder are mobile-friendly natively. No special actions required. You can preview your site inside the app. Check the icons on the top.</p>\n");
      out.write("                        <div class=\"mbr-section-btn mt-3\">\n");
      out.write("                            <a class=\"btn btn-primary display-4\" href=\"https://mobiri.se\">\n");
      out.write("                                Learn more\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</section><section style=\"background-color: #fff; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Helvetica Neue', Arial, sans-serif; color:#aaa; font-size:12px; padding: 0; align-items: center; display: flex;\"><a href=\"https://mobirise.site/d\" style=\"flex: 1 1; height: 3rem; padding-left: 1rem;\"></a><p style=\"flex: 0 0 auto; margin:0; padding-right:1rem;\">Make your own <a href=\"https://mobirise.site/y\" style=\"color:#aaa;\">site</a> with Mobirise</p></section><script src=\"assets/web/assets/jquery/jquery.min.js\"></script>  <script src=\"assets/popper/popper.min.js\"></script>  <script src=\"assets/tether/tether.min.js\"></script>  <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>  <script src=\"assets/smoothscroll/smooth-scroll.js\"></script>  <script src=\"assets/dropdown/js/nav-dropdown.js\"></script>  <script src=\"assets/dropdown/js/navbar-dropdown.js\"></script>  <script src=\"assets/touchswipe/jquery.touch-swipe.min.js\"></script>  <script src=\"assets/theme/js/script.js\"></script>  \n");
      out.write("  \n");
      out.write("  <section class=\"footer3 cid-s48P1Icc8J\" once=\"footers\" id=\"footer3-1j\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"media-container-row align-center mbr-white\">\n");
      out.write("            <div class=\"row row-links\">\n");
      out.write("                <ul class=\"foot-menu\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"https://mobirise.com/help/\" class=\"text-success\">Help Center</a></li><li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"http://forums.mobirise.com/\" class=\"text-success\">Mobirise Forums</a></li><li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"https://mobirise.com/\" class=\"text-success\">Mobirise.com</a></li></ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row social-row\">\n");
      out.write("                <div class=\"social-list align-right pb-2\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <div class=\"soc-item\">\n");
      out.write("                        <a href=\"https://twitter.com/mobirise\" target=\"_blank\">\n");
      out.write("                            <span class=\"socicon-twitter socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </div><div class=\"soc-item\">\n");
      out.write("                        <a href=\"https://www.facebook.com/pages/Mobirise/1616226671953247\" target=\"_blank\">\n");
      out.write("                            <span class=\"socicon-facebook socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </div><div class=\"soc-item\">\n");
      out.write("                        <a href=\"https://www.youtube.com/c/mobirise\" target=\"_blank\">\n");
      out.write("                            <span class=\"socicon-youtube socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </div><div class=\"soc-item\">\n");
      out.write("                        <a href=\"https://instagram.com/mobirise\" target=\"_blank\">\n");
      out.write("                            <span class=\"mbr-iconfont mbr-iconfont-social socicon-instagram socicon\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </div></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row row-copirayt\">\n");
      out.write("                <p class=\"mbr-text mb-0 mbr-fonts-style mbr-white align-center display-7\">\n");
      out.write("                    © Copyright 2020 Mobirise. All Rights Reserved.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
