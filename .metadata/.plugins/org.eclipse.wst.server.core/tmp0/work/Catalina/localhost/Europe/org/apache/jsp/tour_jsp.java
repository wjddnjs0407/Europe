/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-06-03 09:22:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tour_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<title>Tour</title>\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/iconfont.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/slick/slick.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/slick/slick-theme.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/stylesheet.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/jquery.fancybox.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/bootstrap.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/magnific-popup.css\">\r\n");
      out.write("\t<!--        <link rel=\"stylesheet\" href=\"assets/css/bootstrap-theme.min.css\">-->\r\n");
      out.write("\t\r\n");
      out.write("\t<!--For Plugins external css-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/ssets/css/plugins.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<!--Theme custom css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!--Theme Responsive css-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/responsive.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "recommend.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- Blog Section -->\r\n");
      out.write("            <section id=\"blog\" class=\"blog\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"main_blog sections\">\r\n");
      out.write("                            <div class=\"head_title text-center\">\r\n");
      out.write("                                <h2>Tour</h2>\r\n");
      out.write("                                <div class=\"subtitle\">\r\n");
      out.write("                                    \t투어 사이트 추천 \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"separator\"></div>\r\n");
      out.write("                            </div><!-- End off Head_title -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"main_blog_content\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"single_blog_area textwhite\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_img\">\r\n");
      out.write("                                                    <img src=\"resources/assets/images/klook.png\" alt=\"\" />\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_text s_b_left\">\r\n");
      out.write("                                                    <h3>KLOOK</h3>\r\n");
      out.write("                                                    <div class=\"separator2\"></div>\r\n");
      out.write("                                                    <p>각종 현지 패스, 투어 등을 판매.\r\n");
      out.write("                                                    \t한국어 서비스 제공(카카오톡 상담 가능).</p>\r\n");
      out.write("\r\n");
      out.write("                                                    <a href=\"https://www.klook.com/\" class=\"read_more\">GO >></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"single_blog_area textwhite\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_img\">\r\n");
      out.write("                                                    <img src=\"resources/assets/images/getyourguide.png\" alt=\"\" />\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_text s_b_left\">\r\n");
      out.write("                                                    <h3>GET YOUR GUIDE</h3>\r\n");
      out.write("                                                    <div class=\"separator2\"></div>\r\n");
      out.write("                                                    <p>다양한 현지투어 서비스 제공.</p>\r\n");
      out.write("\r\n");
      out.write("                                                    <a href=\"https://www.getyourguide.co.kr/\" class=\"read_more\">GO >></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"single_blog_area textwhite\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-sm-push-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_img\">\r\n");
      out.write("                                                    <img src=\"resources/assets/images/myrealtrip.jpg\" alt=\"\" />\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-sm-pull-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_text s_b_right\">\r\n");
      out.write("                                                    <h3>MY REAL TRIP</h3>\r\n");
      out.write("                                                    <div class=\"separator2\"></div>\r\n");
      out.write("                                                    <p>항공권 특가부터 세계명소 입장권, 투어까지 다양하게 여행관련 서비스를 제공. </p>\r\n");
      out.write("\r\n");
      out.write("                                                    <a href=\"https://www.myrealtrip.com/\" class=\"read_more\">GO >></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"single_blog_area textwhite\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-6 col-sm-push-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_img\">\r\n");
      out.write("                                                    <img src=\"resources/assets/images/onlinetour.jpg\" alt=\"\" />\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6 col-sm-pull-6 no-padding\">\r\n");
      out.write("                                                <div class=\"single_blog_text s_b_right\">\r\n");
      out.write("                                                    <h3>온라인투어</h3>\r\n");
      out.write("                                                    <div class=\"separator2\"></div>\r\n");
      out.write("                                                    <p>국내 최대 온라인 여행사 사이트. 항공, 패키지 여행, 자유여행, 호텔예약 등 최저가 비교가 편리.</p>\r\n");
      out.write("\r\n");
      out.write("                                                    <a href=\"https://www.onlinetour.co.kr/\" class=\"read_more\">GO >></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div><!-- End off container -->\r\n");
      out.write("            </section><!-- End off Blog Section -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"resources/assets/js/vendor/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.mixitup.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.masonry.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--slick slide js -->\r\n");
      out.write("        <script src=\"resources/assets/css/slick/slick.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/css/slick/slick.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"resources/assets/js/plugins.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}