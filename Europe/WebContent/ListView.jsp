<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Martine</title>
    <link rel="icon" href="marine/img/favicon.png">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="marine/css/bootstrap.min.css">
    <!-- animate CSS -->
    <link rel="stylesheet" href="marine/css/animate.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="marine/css/owl.carousel.min.css">
    <!-- themify CSS -->
    <link rel="stylesheet" href="marine/css/themify-icons.css">
    <!-- flaticon CSS -->
    <link rel="stylesheet" href="marine/css/flaticon.css">
    <!-- fontawesome CSS -->
    <link rel="stylesheet" href="marine/fontawesome/css/all.min.css">
    <!-- magnific CSS -->
    <link rel="stylesheet" href="marine/css/magnific-popup.css">
    <link rel="stylesheet" href="marine/css/gijgo.min.css">
    <!-- niceselect CSS -->
    <link rel="stylesheet" href="marine/css/nice-select.css">
    <!-- slick CSS -->
    <link rel="stylesheet" href="marine/css/slick.css">
    <!-- style CSS -->
    <link rel="stylesheet" href="marine/css/style.css">
</head>
<body>
<c:forEach var="re" items="${rList}">
 <!--top place start-->
    <section class="event_part section_padding" style="background-image: url('marine/img/${re.getCountry()}.jpg'); background-size:cover; height:560px;">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="event_slider owl-carousel">
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.8; background-color:#fff1d3"> 
                                        <h5 style="font-size:14pt">${re.getCountry()}</h5>
                                        <h2 style="color:black; font-size:25pt">${re.getCountry()}</h2>
                                        <p style="color:gray; font-size:14pt">${re.getCountry()} Detail
                                        </p>
                                        <a href="#" class="btn_1">Plan Details</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.8; background-color:#fff1d3">
                                        <h5 style="font-size:14pt">${re.getCountry()}</h5>
                                        <h2 style="color:black; font-size:25pt">${re.getCountry()}</h2>
                                        <p style="color:gray; font-size:14pt">${re.getCountry()} Detail
                                        </p>
                                        <a href="#" class="btn_1">Plan Details</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="single_event_slider">
                            <div class="row justify-content-end">
                                <div class="col-lg-6 col-md-6">
                                    <div class="event_slider_content" style="opacity:0.8; background-color:#fff1d3">
                                        <h5 style="font-size:14pt">${re.getCountry()}</h5>
                                        <h2 style="color:black; font-size:25pt">${re.getCountry()}</h2>
                                        <p style="color:gray; font-size:14pt">${re.getCountry()} Detail
                                        </p>
                                        <a href="#" class="btn_1">Plan Details</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--top place end-->
    <div style="background-color:#e6a76b;">
       <jsp:include page="header.jsp"/>
    </div>
    <!--::industries start::-->
    <section class="hotel_list section_padding" style="background-color:#daa521;">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-6"><br><br>
                    <div class="section_tittle text-center">
                        <h2 style="font-size:50pt; margin-top:-80px; color:#810102">${re.getCountry()} ${re.getCate1()}</h2>
                    </div>
                </div>
                <p><a href="AddviewAction.do" class="btn btn-secondary" role="button">Add &raquo;</a></p>
            </div>
            </div>
            </section>
       </c:forEach>
mode : ${mode}

<table class="table table-hover">
	<tr>
		<td><strong>Title</strong></td>
		<td><strong>Writer</strong></td>
	</tr>
		<c:forEach var="re" items="${rList}">
		<tr>
			<td>${re.getTitle()}</td>
			<td>${re.getName()}</td>

			<td>
			<p><a href="DetailViewAction.do?number=${re.getNumber()}" class="btn btn-secondary" role="button">Detail &raquo;</a></p>
			</td>
		</tr>
		</c:forEach>
</table>
<!-- jquery plugins here-->
    <script src="marine/js/jquery-1.12.1.min.js"></script>
    <!-- popper js -->
    <script src="marine/js/popper.min.js"></script>
    <!-- bootstrap js -->
    <script src="marine/js/bootstrap.min.js"></script>
    <!-- magnific js -->
    <script src="marine/js/jquery.magnific-popup.js"></script>
    <!-- swiper js -->
    <script src="marine/js/owl.carousel.min.js"></script>
    <!-- masonry js -->
    <script src="marine/js/masonry.pkgd.js"></script>
    <!-- masonry js -->
    <script src="marine/js/jquery.nice-select.min.js"></script>
    <script src="marine/js/gijgo.min.js"></script>
    <!-- contact js -->
    <script src="marine/js/jquery.ajaxchimp.min.js"></script>
    <script src="marine/js/jquery.form.js"></script>
    <script src="marine/js/jquery.validate.min.js"></script>
    <script src="marine/js/mail-script.js"></script>
    <script src="marine/js/contact.js"></script>
    <!-- custom js -->
    <script src="marine/js/custom.js"></script>
</body>
</html>