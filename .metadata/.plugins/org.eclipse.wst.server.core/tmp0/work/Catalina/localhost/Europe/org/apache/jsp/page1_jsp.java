/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-06-08 14:12:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\t<title>page1</title>\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "recommend.jsp", out, false);
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!-- Team Section -->\r\n");
      out.write("            <section id=\"team\" class=\"team\">\r\n");
      out.write("                <div class=\"main_team_area\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <div class=\"head_title text-center margin-top-80\">\r\n");
      out.write("                                    <h2>여행 준비에 필요한 어플/사이트</h2>\r\n");
      out.write("                                    <div class=\"subtitle\">\r\n");
      out.write("                                        \t여행 전 미리 확인하세요!\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"separator\"></div>\r\n");
      out.write("                                </div><!-- End off Head_title -->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"main_team\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"single_team_img\">\r\n");
      out.write("                                            <a href=\"https://www.triple.guide/\">\r\n");
      out.write("                                                <img src=\"resources/assets/images/triple1.jpg\" alt=\"\" width=\"100%\" />\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"single_team_text\">\r\n");
      out.write("                                                <h4>트리플</h4>\r\n");
      out.write("                                                <p style=\"color:black;\"><strong>유럽 도시 무료 가이드</strong>\r\n");
      out.write("                                                \t날씨, 환율, 길찾기, 번역, 시차계산 등 어플 하나로 해결 가능<br>\r\n");
      out.write("                                                \t직접 맛보고 즐긴 실제 리뷰들이 가득하다!\r\n");
      out.write("                                                </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"single_team_img\">\r\n");
      out.write("                                             <a href=\"http://www.stubbyplanner.com/\">\r\n");
      out.write("                                                <img src=\"resources/assets/images/stuby.jpg\" alt=\"\" width=\"100%\" />\r\n");
      out.write("                                             </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"single_team_text\">\r\n");
      out.write("                                                <h4>스투비</h4>\r\n");
      out.write("                                                <p style=\"color:black;\"><strong>상상 속 유럽을 현실로</strong>\r\n");
      out.write("                                                \t유럽여행 맞춤어플로서 지도를 통해\r\n");
      out.write("                                                \t나라 간 경로설정 및 소요시간 계산<br>\r\n");
      out.write("                                                \t같이가는 사람들과 일정 공유 가능\r\n");
      out.write("                                                 </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"single_team_img\">\r\n");
      out.write("                                             <a href=\"http://www.myrealtrip.com\">\r\n");
      out.write("                                                <img src=\"resources/assets/images/mrt.jpg\" alt=\"\" width=\"100%\" />\r\n");
      out.write("                                             </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"single_team_text\">\r\n");
      out.write("                                                <h4>마이 리얼 트립</h4>\r\n");
      out.write("                                                <p style=\"color:black;\"><strong>항공,숙소 최저가 예약</strong>\r\n");
      out.write("                                              \t  국내 및 국외 여행상품 검색<br>\r\n");
      out.write("                                                \t각종 투어,티켓 추천 및 간편한 예약 제공\r\n");
      out.write("                                              </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"single_team_img\">\r\n");
      out.write("                                             <a href=\"https://www.klook.com/ko/\">\r\n");
      out.write("                                                <img src=\"resources/assets/images/klook.jpg\" alt=\"\" width=\"100%\" />\r\n");
      out.write("                                             </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"single_team_text\">\r\n");
      out.write("                                                <h4>클룩</h4>\r\n");
      out.write("                                                <p style=\"color:black;\"><strong>유럽 철도 패스권 구매</strong>\r\n");
      out.write("                                                 \t각종 액티비티 할인권 제공 및 예약 편리<br>\r\n");
      out.write("                                                 \tE-티켓으로 쉽고 빠르게 접근 가능 \r\n");
      out.write("                                                 \t</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"single_team_img\">\r\n");
      out.write("                                             <a href=\"http://store.maaltalk.com/\">\r\n");
      out.write("                                                <img src=\"resources/assets/images/maltok.jpg\" alt=\"\" width=\"100%\"/>\r\n");
      out.write("                                             </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"single_team_text\">\r\n");
      out.write("                                                <h4>말톡</h4>\r\n");
      out.write("                                                <p style=\"color:black;\"><strong>유심 및 현지통화 기능</strong>\r\n");
      out.write("                                                \t종류별 유심구매 및 착신전환서비스 제공<br>\r\n");
      out.write("                                                \t현지번호 제공 및 데이터소진 알림\r\n");
      out.write("                                                </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div><!-- End of main team contant --> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- End of container -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </section><!-- End off Team Section -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
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