package org.apache.jsp.DoubleM_005fView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html  >\n");
      out.write("    <head>\n");
      out.write("        <!-- Site made with Mobirise Website Builder v5.2.0, https://mobirise.com -->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"generator\" content=\"Mobirise v5.2.0, mobirise.com\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/doublemlogo-96x96.png\" type=\"image/x-icon\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/web/assets/mobirise-icons2/mobirise2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/tether/tether.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-grid.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-reboot.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/dropdown/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/socicon/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\n");
      out.write("        <link rel=\"preload\" as=\"style\" href=\"assets/mobirise/css/mbr-additional.css\"><link rel=\"stylesheet\" href=\"assets/mobirise/css/mbr-additional.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"LoginController\" method=\"post\">\n");
      out.write("            <section class=\"menu menu2 cid-sfR2QEthON\" once=\"menu\" id=\"menu2-1h\">\n");
      out.write("                <nav class=\"navbar navbar-dropdown navbar-fixed-top navbar-expand-lg\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-brand\">\n");
      out.write("                            <span class=\"navbar-logo\">\n");
      out.write("                                <a href=\"home.jsp\">\n");
      out.write("                                    <img src=\"assets/images/doublemlogo-96x96.png\" alt=\"Mobirise\" style=\"height: 3.8rem;\">\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"navbar-caption-wrap\"><a class=\"navbar-caption text-black display-7\" href=\"home.jsp\">Double M</a></span>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <div class=\"hamburger\">\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav nav-dropdown nav-right\" data-app-modern-menu=\"true\"><li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"home.jsp\">Home</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"shop.jsp\">Shop</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"login.jsp\">Login</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link link text-black display-4\" href=\"register.jsp\">Register</a>\n");
      out.write("                                </li></ul>\n");
      out.write("                            <div class=\"icons-menu\">\n");
      out.write("                                <a class=\"iconfont-wrapper\" href=\"https://www.facebook.com/ducmanh10x/\" target=\"_blank\">\n");
      out.write("                                    <span class=\"p-2 mbr-iconfont socicon-facebook socicon\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"iconfont-wrapper\" href=\"https://www.instagram.com/amanh.xanhla/\" target=\"_blank\">\n");
      out.write("                                    <span class=\"p-2 mbr-iconfont socicon-instagram socicon\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"form4 cid-sfQY9HTO4n mbr-fullscreen\" id=\"form4-1b\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row content-wrapper justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-3 offset-lg-1 mbr-form\" data-form-type=\"formoid\">\n");
      out.write("                            <form action=\"https://mobirise.eu/\" method=\"POST\" class=\"mbr-form form-with-styler\" data-form-title=\"Form Name\"><input type=\"hidden\" name=\"email\" data-form-email=\"true\" value=\"apohACoA/Qk97IBXWCMsmCwVeB3Hrb3M4Tb2pFzgeBiqjkQeDotId+ViU39Jf/6ju3uikA6OkRTnaE5Yf8UNXMHQGusEDaCCcR4idfTkuLbbK/HnZaeqHyqzyZMLqEsj\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <div hidden=\"hidden\" data-form-alert=\"\" class=\"alert alert-success col-12\">Login Successfully</div>\n");
      out.write("                                    <div hidden=\"hidden\" data-form-alert-danger=\"\" class=\"alert alert-danger col-12\">Oops...! some\n");
      out.write("                                        problem!</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"dragArea row\">\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <h1 class=\"mbr-section-title mb-4 display-2\"><strong>Login</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <p class=\"mbr-text mbr-fonts-style mb-4 display-7\">If you don't have account, let's register</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md col-12 form-group\" data-for=\"name\">\n");
      out.write("                                        <input type=\"text\" name=\"account\" placeholder=\"Account\" data-form-field=\"account\" class=\"form-control\" value=\"\" id=\"name-form4-1b\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md col-12 form-group\" data-for=\"email\">\n");
      out.write("                                        <input type=\"password\" name=\"password\" placeholder=\"Password\" data-form-field=\"password\" class=\"form-control\" value=\"\" id=\"email-form4-1b\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-12 col-md-auto mbr-section-btn\"><button type=\"submit\" class=\"btn btn-secondary display-4\"><span class=\"mobi-mbri mobi-mbri-login mbr-iconfont mbr-iconfont-btn\" style=\"color: rgb(0, 0, 0);\"></span>Login</button></div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-7 offset-lg-1 col-12\">\n");
      out.write("                            <div class=\"image-wrapper\">\n");
      out.write("                                <img class=\"w-100\" src=\"assets/images/converse-vs-vans-1-1266x713.jpeg\" alt=\"Mobirise\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"contacts3 map1 cid-sfQXnDk2DR\" id=\"contacts3-1a\">\n");
      out.write("                <div class=\"mbr-overlay\" style=\"opacity: 0.2; background-color: rgb(0, 0, 0);\"></div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"mbr-section-head\">\n");
      out.write("                        <h3 class=\"mbr-section-title mbr-fonts-style align-center mb-0 display-2\">\n");
      out.write("                            <strong>Contacts</strong>\n");
      out.write("                        </h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row justify-content-center mt-4\">\n");
      out.write("                        <div class=\"card col-12 col-md-6\">\n");
      out.write("                            <div class=\"card-wrapper\">\n");
      out.write("                                <div class=\"image-wrapper\">\n");
      out.write("                                    <span class=\"mbr-iconfont mobi-mbri-phone mobi-mbri\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-wrapper\">\n");
      out.write("                                    <h6 class=\"card-title mbr-fonts-style mb-1 display-5\">\n");
      out.write("                                        <strong>Phone</strong>\n");
      out.write("                                    </h6>\n");
      out.write("                                    <p class=\"mbr-text mbr-fonts-style display-7\">\n");
      out.write("                                        <a href=\"tel:+12345678910\" class=\"text-primary\"></a>0985059332</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-wrapper\">\n");
      out.write("                                <div class=\"image-wrapper\">\n");
      out.write("                                    <span class=\"mbr-iconfont mobi-mbri-letter mobi-mbri\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-wrapper\">\n");
      out.write("                                    <h6 class=\"card-title mbr-fonts-style mb-1 display-5\">\n");
      out.write("                                        <strong>Email</strong>\n");
      out.write("                                    </h6>\n");
      out.write("                                    <p class=\"mbr-text mbr-fonts-style display-7\">manhndhe141204@fpt.edu.vn&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"map-wrapper col-12 col-md-6\">\n");
      out.write("                            <div class=\"google-map\"><iframe frameborder=\"0\" style=\"border:0\" src=\"https://www.google.com/maps/embed/v1/place?key=AIzaSyCt1265A4qvZy9HKUeA8J15AOC4SrCyZe4&amp;q=Đại học FPT Hà Nội\" allowfullscreen=\"\"></iframe></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"footer3 cid-s48P1Icc8J\" once=\"footers\" id=\"footer3-18\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"media-container-row align-center mbr-white\">\n");
      out.write("                        <div class=\"row row-links\">\n");
      out.write("                            <ul class=\"foot-menu\">\n");
      out.write("                                <li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"https://mobirise.com/help/\" class=\"text-success\">Help Center</a></li><li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"http://forums.mobirise.com/\" class=\"text-success\">Mobirise Forums</a></li><li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"https://mobirise.com/\" class=\"text-success\">Mobirise.com</a></li></ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row social-row\">\n");
      out.write("                            <div class=\"social-list align-right pb-2\">\n");
      out.write("                                <div class=\"soc-item\">\n");
      out.write("                                    <a href=\"https://twitter.com/mobirise\" target=\"_blank\">\n");
      out.write("                                        <span class=\"socicon-twitter socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div><div class=\"soc-item\">\n");
      out.write("                                    <a href=\"https://www.facebook.com/ducmanh10x\" target=\"_blank\">\n");
      out.write("                                        <span class=\"socicon-facebook socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div><div class=\"soc-item\">\n");
      out.write("                                    <a href=\"https://www.youtube.com/watch?v=QH9vvwPPBS8\" target=\"_blank\">\n");
      out.write("                                        <span class=\"socicon-youtube socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div><div class=\"soc-item\">\n");
      out.write("                                    <a href=\"https://www.instagram.com/amanh.xanhla\" target=\"_blank\">\n");
      out.write("                                        <span class=\"mbr-iconfont mbr-iconfont-social socicon-instagram socicon\"></span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row row-copirayt\">\n");
      out.write("                            <p class=\"mbr-text mb-0 mbr-fonts-style mbr-white align-center display-7\">\n");
      out.write("                                © Copyright 2020 Mobirise. All Rights Reserved.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section><section style=\"background-color: #fff; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Helvetica Neue', Arial, sans-serif; color:#aaa; font-size:12px; padding: 0; align-items: center; display: flex;\"><a href=\"https://mobirise.site/b\" style=\"flex: 1 1; height: 3rem; padding-left: 1rem;\"></a><p style=\"flex: 0 0 auto; margin:0; padding-right:1rem;\"><a href=\"https://mobirise.site/c\" style=\"color:#aaa;\">The</a> page was started with Mobirise</p></section><script src=\"assets/web/assets/jquery/jquery.min.js\"></script>  <script src=\"assets/popper/popper.min.js\"></script>  <script src=\"assets/tether/tether.min.js\"></script>  <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>  <script src=\"assets/smoothscroll/smooth-scroll.js\"></script>  <script src=\"assets/parallax/jarallax.min.js\"></script>  <script src=\"assets/dropdown/js/nav-dropdown.js\"></script>  <script src=\"assets/dropdown/js/navbar-dropdown.js\"></script>  <script src=\"assets/touchswipe/jquery.touch-swipe.min.js\"></script>  <script src=\"assets/theme/js/script.js\"></script>  <script src=\"assets/formoid/formoid.min.js\"></script>  \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
