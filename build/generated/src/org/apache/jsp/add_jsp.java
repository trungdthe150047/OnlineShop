package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <!-- Meta Tag -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name='copyright' content=''>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- Title Tag  -->\n");
      out.write("        <title>TrungKicks</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/trungkicks.png\">\n");
      out.write("        <!-- Web Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- StyleSheet -->\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("        <!-- Fancybox -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.fancybox.min.css\">\n");
      out.write("        <!-- Themify Icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("        <!-- Nice Select CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/niceselect.css\">\n");
      out.write("        <!-- Animate CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Flex Slider CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flex-slider.min.css\">\n");
      out.write("        <!-- Owl Carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl-carousel.css\">\n");
      out.write("        <!-- Slicknav -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Eshop StyleSheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/cssForLogin/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header shop\">\n");
      out.write("            <!-- Topbar -->\n");
      out.write("            <div class=\"topbar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-12\">\n");
      out.write("                            <!-- Top Left -->\n");
      out.write("                            <div class=\"top-left\">\n");
      out.write("                                <ul class=\"list-main\">\n");
      out.write("                                    <li><i class=\"fa fa-phone\"></i> 0387037855</li>\n");
      out.write("                                    <li><i class=\"fa fa-email\"></i>HE150047</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!--/ End Top Left -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8 col-md-12 col-12\">\n");
      out.write("                            <!-- Top Right -->\n");
      out.write("                            <div class=\"right-content\">\n");
      out.write("                                <ul class=\"list-main\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Top Right -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Topbar -->\n");
      out.write("            <div class=\"middle-inner\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-2 col-md-2 col-12\">\n");
      out.write("                            <!-- Logo -->\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"homepage\"><img src=\"images/icontrungkicks.png\" alt=\"logo\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!--/ End Logo -->\n");
      out.write("                            <div class=\"mobile-nav\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8 col-md-7 col-12\">\n");
      out.write("                            <div class=\"search-bar-top\">\n");
      out.write("                                <div class=\"search-bar\">\n");
      out.write("                                    <select>\n");
      out.write("                                        <option selected=\"selected\">All Category</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    <form>\n");
      out.write("                                        <input name=\"search\" placeholder=\"Search Products Here.....\" type=\"search\">\n");
      out.write("                                        <button class=\"btnn\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-2 col-md-3 col-12\">\n");
      out.write("                            <div class=\"right-bar\">\n");
      out.write("                                <!-- Search Form -->\n");
      out.write("                                <div class=\"sinlge-bar\">\n");
      out.write("                                    <a href=\"#\" class=\"single-icon\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"sinlge-bar\">\n");
      out.write("                                    <a href=\"#\" class=\"single-icon\"><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Header Inner -->\n");
      out.write("            <div class=\"header-inner\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"cat-nav-head\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"menu-area\">\n");
      out.write("                                    <!-- Main Menu -->\n");
      out.write("                                    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                                        <div class=\"navbar-collapse\">\t\n");
      out.write("                                            <div class=\"nav-inner\">\t\n");
      out.write("                                                <ul class=\"nav main-menu menu navbar-nav\">\n");
      out.write("                                                    <li class=\"active\"><a href=\"homepage\">Home</a></li>\n");
      out.write("                                                    <li><a href=\"shopGrid?pname=\">Product</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("                                                    <li><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                                        <ul class=\"dropdown\">\n");
      out.write("                                                            <li><a href=\"shopGrid?pname=\">Shop Grid</a></li>\n");
      out.write("                                                            <li><a href=\"cart?id=6&option=&cost=0\">Cart</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Product</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </nav>\n");
      out.write("                                    <!--/ End Main Menu -->\t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/ End Header Inner -->\n");
      out.write("        </header>\n");
      out.write("        <div class=\"page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins\">\n");
      out.write("            <div class=\"wrapper wrapper--w680\">\n");
      out.write("                <div class=\"card card-4\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h2 class=\"title\">Add New Product</h2>\n");
      out.write("                        <form action=\"add\" method=\"post\">\n");
      out.write("                            Product Name: <input type=\"text\" name=\"pname\"><br>\n");
      out.write("                            Supplier Name: \n");
      out.write("                            <br>\n");
      out.write("                            <select name=\"sname\"> \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Quantity: <input type=\"text\" name=\"quantity\"><br>\n");
      out.write("                            Price: <input type=\"text\" name=\"price\"><br>\n");
      out.write("                            Number Of Import: <input type=\"text\" name=\"noi\"><br>\n");
      out.write("                            Image: <input type=\"file\" name=\"image\">\n");
      out.write("                            Category: \n");
      out.write("                            <br><select name=\"cname\"> \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Description: <input type=\"text\" name=\"description\">\n");
      out.write("                            <input style=\"padding: 10px; margin-top: 10px\" type=\"submit\" value=\"Save\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <!-- Footer Top -->\n");
      out.write("            <div class=\"footer-top section\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-5 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer about\">\n");
      out.write("                                <div class=\"logo\">\n");
      out.write("                                    <a href=\"homepage\"><img src=\"images/logo2.png\" alt=\"#\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"text\">Shoes Collection s??? 1 H?? Th??nh.</p>\n");
      out.write("                                <p class=\"call\">Got Question? Call us 24/7<span><a href=\"tel:0387037855\">0387 037 855</a></span></p>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-2 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer links\">\n");
      out.write("                                <h4>Information</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Faq</a></li>\n");
      out.write("                                    <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Help</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-2 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer links\">\n");
      out.write("                                <h4>Customer Service</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Payment Methods</a></li>\n");
      out.write("                                    <li><a href=\"#\">Money-back</a></li>\n");
      out.write("                                    <li><a href=\"#\">Returns</a></li>\n");
      out.write("                                    <li><a href=\"#\">Shipping</a></li>\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer social\">\n");
      out.write("                                <h4>Get In Touch</h4>\n");
      out.write("                                <!-- Single Widget -->\n");
      out.write("                                <div class=\"contact\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>FPT University</li>\n");
      out.write("                                        <li>Hola Land</li>\n");
      out.write("                                        <li>trungdthe150047@fpt.edu.vn</li>\n");
      out.write("                                        <li>0387037855</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- End Single Widget -->\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"https://www.facebook.com/ttrungdo2001/\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-flickr\"></i></a></li>\n");
      out.write("                                    <li><a href=\"https://www.instagram.com/trungdoox_/\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Footer Top -->\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6 col-12\">\n");
      out.write("                                <div class=\"left\">\n");
      out.write("                                    <p>Copyright ?? 2020 <a href=\"https://www.facebook.com/ttrungdo2001/\" target=\"_blank\">Thanh Trung Do</a>  -  All Rights Reserved.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6 col-12\">\n");
      out.write("                                <div class=\"right\">\n");
      out.write("                                    <img src=\"images/payments.png\" alt=\"#\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"../validate/validate.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-migrate-3.0.0.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JS -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Color JS -->\n");
      out.write("        <script src=\"js/colors.js\"></script>\n");
      out.write("        <!-- Slicknav JS -->\n");
      out.write("        <script src=\"js/slicknav.min.js\"></script>\n");
      out.write("        <!-- Owl Carousel JS -->\n");
      out.write("        <script src=\"js/owl-carousel.js\"></script>\n");
      out.write("        <!-- Magnific Popup JS -->\n");
      out.write("        <script src=\"js/magnific-popup.js\"></script>\n");
      out.write("        <!-- Fancybox JS -->\n");
      out.write("        <script src=\"js/facnybox.min.js\"></script>\n");
      out.write("        <!-- Waypoints JS -->\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("        <!-- Jquery Counterup JS -->\n");
      out.write("        <script src=\"js/jquery-counterup.min.js\"></script>\n");
      out.write("        <!-- Countdown JS -->\n");
      out.write("        <script src=\"js/finalcountdown.min.js\"></script>\n");
      out.write("        <!-- Nice Select JS -->\n");
      out.write("        <script src=\"js/nicesellect.js\"></script>\n");
      out.write("        <!-- Ytplayer JS -->\n");
      out.write("        <script src=\"js/ytplayer.min.js\"></script>\n");
      out.write("        <!-- Flex Slider JS -->\n");
      out.write("        <script src=\"js/flex-slider.js\"></script>\n");
      out.write("        <!-- ScrollUp JS -->\n");
      out.write("        <script src=\"js/scrollup.js\"></script>\n");
      out.write("        <!-- Onepage Nav JS -->\n");
      out.write("        <script src=\"js/onepage-nav.min.js\"></script>\n");
      out.write("        <!-- Easing JS -->\n");
      out.write("        <script src=\"js/easing.js\"></script>\n");
      out.write("        <!-- Google Map JS -->\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDnhgNBg6jrSuqhTeKKEFDWI0_5fZLx0vM\"></script>\t\n");
      out.write("        <script src=\"js/gmap.min.js\"></script>\n");
      out.write("        <script src=\"js/map-script.js\"></script>\n");
      out.write("        <!-- Active JS -->\n");
      out.write("        <script src=\"js/active.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.customerName eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><i class=\"fa fa-user-circle\"></i> <a href=\"myAccount\">My account</a></li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><i class=\"fa fa-user-circle\"></i> <a href=\"myAccount\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.customerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.customerName eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><i class=\"fa fa-sign-in\"></i><a href=\"login\">Login</a></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><i class=\"fa fa-sign-in\"></i><a href=\"validateUser\">Logout</a></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sups}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.supplierID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.companyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cates}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
