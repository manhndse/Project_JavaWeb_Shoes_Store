package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Delete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Shop</title>\n");
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
      out.write("        ");
      Model.ProductModel p = null;
      synchronized (request) {
        p = (Model.ProductModel) _jspx_page_context.getAttribute("p", PageContext.REQUEST_SCOPE);
        if (p == null){
          p = new Model.ProductModel();
          _jspx_page_context.setAttribute("p", p, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"gallery5 mbr-gallery cid-sfR564WcbO\" id=\"gallery5-1i\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"mbr-section-head\">\n");
      out.write("                    <h3 class=\"mbr-section-title mbr-fonts-style align-center m-0 display-2\"><strong>Vans and Converse Collection</strong></h3>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mbr-gallery mt-4\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Image</th>\n");
      out.write("                            <th>price</th>\n");
      out.write("                            <th>Unit</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal mbr-slider\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\" id=\"sfRpu6hpiV-modal\">\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <div class=\"carousel slide carousel-fade\" id=\"lb-sfRpu6hpiV\" data-interval=\"5000\">\n");
      out.write("                                    <div class=\"carousel-inner\">\n");
      out.write("                                        <div class=\"carousel-item active\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/ultrarange-exo-hi-mte-506x506.png\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/oversizecheckerboard-sk8-hi-506x506.png\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/ditsy-floral-old-skool-506x506.png\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/image_1.png\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/pig-suede-authentic-670x670.png\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/gum-authentic-670x670.png\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/vans-moma-monet-authentic-670x670.png\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/vans-authentic-black-670x670.png\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/converse-x-bugs-bunny-chuck-taylor-all-star-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/gore-tex-utility-chuck-70-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/cons-realtree-xtra-colors-ctas-pro-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/converse-chuck-1970s-bw-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/all-terrain-chuck-taylor-all-star-130-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/hacked-fashion-chuck-70-90-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/checkpoint-pro-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div><div class=\"carousel-item\">\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"assets/images/holiday-sweater-chuck-70-85-964x898.jpg\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <ol class=\"carousel-indicators\">\n");
      out.write("                                        <li data-slide-to=\"0\" class=\"active\" data-target=\"#lb-sfRpu6hpiV\"></li>\n");
      out.write("                                        <li data-slide-to=\"1\" data-target=\"#lb-sfRpu6hpiV\"></li>\n");
      out.write("                                        <li data-slide-to=\"2\" data-target=\"#lb-sfRpu6hpiV\"></li>\n");
      out.write("                                        <li data-slide-to=\"3\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"4\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"5\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"6\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"7\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"8\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"9\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"10\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"11\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"12\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"13\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"14\" data-target=\"#lb-sfRpu6hpiV\"></li><li data-slide-to=\"15\" data-target=\"#lb-sfRpu6hpiV\"></li>\n");
      out.write("                                    </ol>\n");
      out.write("                                    <a role=\"button\" href=\"\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"carousel-control-prev carousel-control\" role=\"button\" data-slide=\"prev\" href=\"#lb-sfRpu6hpiV\">\n");
      out.write("                                        <span class=\"mobi-mbri mobi-mbri-arrow-prev\" aria-hidden=\"true\"></span>\n");
      out.write("                                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"carousel-control-next carousel-control\" role=\"button\" data-slide=\"next\" href=\"#lb-sfRpu6hpiV\">\n");
      out.write("                                        <span class=\"mobi-mbri mobi-mbri-arrow-next\" aria-hidden=\"true\"></span>\n");
      out.write("                                        <span class=\"sr-only\">Next</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"contacts3 map1 cid-sfQTOwal8h\" id=\"contacts3-u\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"mbr-overlay\" style=\"opacity: 0.2; background-color: rgb(0, 0, 0);\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"mbr-section-head\">\n");
      out.write("                    <h3 class=\"mbr-section-title mbr-fonts-style align-center mb-0 display-2\">\n");
      out.write("                        <strong>Contacts</strong>\n");
      out.write("                    </h3>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-center mt-4\">\n");
      out.write("                    <div class=\"card col-12 col-md-6\">\n");
      out.write("                        <div class=\"card-wrapper\">\n");
      out.write("                            <div class=\"image-wrapper\">\n");
      out.write("                                <span class=\"mbr-iconfont mobi-mbri-phone mobi-mbri\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-wrapper\">\n");
      out.write("                                <h6 class=\"card-title mbr-fonts-style mb-1 display-5\">\n");
      out.write("                                    <strong>Phone</strong>\n");
      out.write("                                </h6>\n");
      out.write("                                <p class=\"mbr-text mbr-fonts-style display-7\">\n");
      out.write("                                    <a href=\"tel:+12345678910\" class=\"text-primary\"></a>0985059332&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-wrapper\">\n");
      out.write("                            <div class=\"image-wrapper\">\n");
      out.write("                                <span class=\"mbr-iconfont mobi-mbri-letter mobi-mbri\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-wrapper\">\n");
      out.write("                                <h6 class=\"card-title mbr-fonts-style mb-1 display-5\">\n");
      out.write("                                    <strong>Email</strong>\n");
      out.write("                                </h6>\n");
      out.write("                                <p class=\"mbr-text mbr-fonts-style display-7\">manhndhe141204@fpt.edu.vn&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"map-wrapper col-12 col-md-6\">\n");
      out.write("                        <div class=\"google-map\"><iframe frameborder=\"0\" style=\"border:0\" src=\"https://www.google.com/maps/embed/v1/place?key=AIzaSyCt1265A4qvZy9HKUeA8J15AOC4SrCyZe4&amp;q=Đại học FPT Hà Nội\" allowfullscreen=\"\"></iframe></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"footer3 cid-s48P1Icc8J\" once=\"footers\" id=\"footer3-t\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"media-container-row align-center mbr-white\">\n");
      out.write("                    <div class=\"row row-links\">\n");
      out.write("                        <ul class=\"foot-menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"https://mobirise.com/help/\" class=\"text-success\">Help Center</a></li><li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"http://forums.mobirise.com/\" class=\"text-success\">Mobirise Forums</a></li><li class=\"foot-menu-item mbr-fonts-style display-7\"><a href=\"https://mobirise.com/\" class=\"text-success\">Mobirise.com</a></li></ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row social-row\">\n");
      out.write("                        <div class=\"social-list align-right pb-2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"soc-item\">\n");
      out.write("                                <a href=\"https://twitter.com/mobirise\" target=\"_blank\">\n");
      out.write("                                    <span class=\"socicon-twitter socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div><div class=\"soc-item\">\n");
      out.write("                                <a href=\"https://www.facebook.com/ducmanh10x\" target=\"_blank\">\n");
      out.write("                                    <span class=\"socicon-facebook socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div><div class=\"soc-item\">\n");
      out.write("                                <a href=\"https://www.youtube.com/watch?v=QH9vvwPPBS8\" target=\"_blank\">\n");
      out.write("                                    <span class=\"socicon-youtube socicon mbr-iconfont mbr-iconfont-social\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div><div class=\"soc-item\">\n");
      out.write("                                <a href=\"https://www.instagram.com/amanh.xanhla\" target=\"_blank\">\n");
      out.write("                                    <span class=\"mbr-iconfont mbr-iconfont-social socicon-instagram socicon\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row row-copirayt\">\n");
      out.write("                        <p class=\"mbr-text mb-0 mbr-fonts-style mbr-white align-center display-7\">\n");
      out.write("                            © Copyright 2020 Mobirise. All Rights Reserved.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section><section style=\"background-color: #fff; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Helvetica Neue', Arial, sans-serif; color:#aaa; font-size:12px; padding: 0; align-items: center; display: flex;\"><a href=\"https://mobirise.site/o\" style=\"flex: 1 1; height: 3rem; padding-left: 1rem;\"></a><p style=\"flex: 0 0 auto; margin:0; padding-right:1rem;\">Built with <a href=\"https://mobirise.site/b\" style=\"color:#aaa;\">Mobirise</a> template</p></section><script src=\"assets/web/assets/jquery/jquery.min.js\"></script>  <script src=\"assets/popper/popper.min.js\"></script>  <script src=\"assets/tether/tether.min.js\"></script>  <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>  <script src=\"assets/smoothscroll/smooth-scroll.js\"></script>  <script src=\"assets/parallax/jarallax.min.js\"></script>  <script src=\"assets/dropdown/js/nav-dropdown.js\"></script>  <script src=\"assets/dropdown/js/navbar-dropdown.js\"></script>  <script src=\"assets/touchswipe/jquery.touch-swipe.min.js\"></script>  <script src=\"assets/theme/js/script.js\"></script>  \n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.allProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.unit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"#\">Delete</a>\n");
          out.write("                                    <a href=\"#\">Edit</a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
