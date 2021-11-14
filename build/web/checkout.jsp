<%-- 
    Document   : checkout
    Created on : Oct 26, 2020, 3:30:35 PM
    Author     : DO THANH TRUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TrungKicks</title>
        <!-- Meta Tag -->
        <meta charset="utf-8">

        <meta name='copyright' content=''>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Title Tag  -->
        <!-- Favicon -->
        <link rel="icon" type="image/png" href="images/trungkicks.png">
        <!-- Web Font -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

        <!-- StyleSheet -->

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.css">
        <!-- Fancybox -->
        <link rel="stylesheet" href="css/jquery.fancybox.min.css">
        <!-- Themify Icons -->
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- Nice Select CSS -->
        <link rel="stylesheet" href="css/niceselect.css">
        <!-- Animate CSS -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Flex Slider CSS -->
        <link rel="stylesheet" href="css/flex-slider.min.css">
        <!-- Owl Carousel -->
        <link rel="stylesheet" href="css/owl-carousel.css">
        <!-- Slicknav -->
        <link rel="stylesheet" href="css/slicknav.min.css">

        <!-- Eshop StyleSheet -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/responsive.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    </head>
    <body class="js">

        <!-- Header -->
        <header class="header shop">
            <!-- Topbar -->
            <div class="topbar">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-4 col-md-12 col-12">
                            <!-- Top Left -->
                            <div class="top-left">
                                <ul class="list-main">
                                    <li><i class="fa fa-phone"></i> 0387037855</li>
                                    <li><i class="fa fa-email"></i>HE150047</li>
                                </ul>
                            </div>
                            <!--/ End Top Left -->
                        </div>
                        <div class="col-lg-8 col-md-12 col-12">
                            <!-- Top Right -->
                            <div class="right-content">
                                <ul class="list-main">
                                    <c:choose>
                                        <c:when test= "${sessionScope.account == null}">
                                            <li><i class="fa fa-user-circle"></i> <a href="myAccount">My account</a></li>
                                            </c:when>
                                            <c:otherwise>
                                            <li><i class="fa fa-user-circle"></i> <a href="myAccount">${sessionScope.account.customerName}</a></li>
                                            </c:otherwise>
                                    </c:choose>
                                    <c:choose >
                                            <c:when test = "${sessionScope.account == null}">
                                            <li><i class="fa fa-sign-in"></i><a href="login">Login</a></li>
                                                </c:when>
                                                <c:otherwise>
                                            <li><i class="fa fa-sign-in"></i><a href="validateUser">Logout</a></li>
                                                </c:otherwise>
                                    </c:choose>
                                </ul>
                            </div>
                            <!-- End Top Right -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- End Topbar -->
            <div class="middle-inner">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-2 col-md-2 col-12">
                            <!-- Logo -->
                            <div class="logo">
                                <a href="homepage"><img src="images/icontrungkicks.png" alt="logo"></a>
                            </div>
                            <!--/ End Logo -->
                            <div class="mobile-nav"></div>
                        </div>
                        <div class="col-lg-8 col-md-7 col-12">
                            <div class="search-bar-top">
                                <div class="search-bar">
                                    <select>
                                        <option selected="selected">All Category</option>
                                    </select>
                                    <form>
                                        <input name="search" placeholder="Search Products Here....." type="search">
                                        <button class="btnn"><i class="fa fa-search"></i></button>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-2 col-md-3 col-12">
                            <div class="right-bar">
                                <!-- Search Form -->
                                <div class="sinlge-bar">
                                    <a href="#" class="single-icon"><i class="fa fa-heart-o" aria-hidden="true"></i></a>
                                </div>
                                <div class="sinlge-bar">
                                    <a href="#" class="single-icon"><i class="fa fa-user-circle-o" aria-hidden="true"></i></a>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Header Inner -->
            <div class="header-inner">
                <div class="container">
                    <div class="cat-nav-head">
                        <div class="row">
                            <div class="col-12">
                                <div class="menu-area">
                                    <!-- Main Menu -->
                                    <nav class="navbar navbar-expand-lg">
                                        <div class="navbar-collapse">	
                                            <div class="nav-inner">	
                                                <ul class="nav main-menu menu navbar-nav">
                                                    <li class="active"><a href="homepage">Home</a></li>
                                                    <li><a href="shopGrid?pname=">Product</a></li>												

                                                    <li><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                                        <ul class="dropdown">
                                                            <li><a href="shopGrid?pname=">Shop Grid</a></li>
                                                            <li><a href="cart?id=6&option=&cost=0">Cart</a></li>
                                                        </ul>
                                                    </li>
                                                    <li><a href="contact">Contact Us</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </nav>
                                    <!--/ End Main Menu -->	
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--/ End Header Inner -->
        </header>
        <!--/ End Header -->

        <!-- Breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="bread-inner">
                            <ul class="bread-list">
                                <li><a href="homepage">Home<i class="fa fa-arrow-right"></i></a></li>
                                <li class="active"><a href="checkout">Checkout</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Breadcrumbs -->

        <!-- Start Checkout -->
        <section class="shop checkout section">
            <div class="container">
                <div class="row"> 
                    <div class="col-lg-8 col-12">
                        <div class="checkout-form">
                            <h2>Make Your Checkout Here</h2>
                            <p>Please register in order to checkout quicker</p>
                            <!-- Form -->
                            <form class="form" method="post" action="OrderProduct">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-12">
                                        <div class="form-group">
                                            <label>Name<span>*</span></label>
                                            <input type="text" name="name" placeholder="" required="required" value="${name.customerName}">
                                            <input type="hidden" name="id" value="${name.customerID}">
                                        </div>
                                    </div>

                                    <div class="col-lg-6 col-md-6 col-12">
                                        <div class="form-group">
                                            <label>Email Address<span>*</span></label>
                                            <input type="email" name="email" placeholder="" required="required" value="${name.email}">
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-12">
                                        <div class="form-group">
                                            <label>Phone Number<span>*</span></label>
                                            <input type="text" name="number" placeholder="" required="required" value="${name.phoneNumber}">
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-12">
                                        <div class="form-group">
                                            <label>Address<span>*</span></label>
                                            <input type="text" name="country_name" value="${name.address}">
                                        </div>
                                    </div>


                                </div>
                                <div class="single-widget get-button">
                                    <div class="content">
                                        <div class="button">
                                            <button type="submit" style="padding: 10px; font-weight: bold">Check out</button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <!--/ End Form -->
                        </div>
                    </div>
                    <div class="col-lg-4 col-12">
                        <div class="order-details">
                            <!--Order Widget -->
                            <div class="single-widget">
                                <h2>CART  TOTALS</h2>
                                <div class="content">
                                    <ul>
                                        <li>Sub Total<span>$${tocost1}</span></li>
                                        <li class="last">Total<span>$${tocost1}</span></li>
                                    </ul>
                                </div>
                            </div>
                            <!--End Order Widget -->
                        </div>
                    </div>
                    </section>
                    <!--/ End Checkout -->

                    <!-- Start Shop Services Area  -->
                    <section class="shop-services section home">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-3 col-md-6 col-12">
                                    <!-- Start Single Service -->
                                    <div class="single-service">
                                        <i class="fa fa-rocket"></i>
                                        <h4>Free shipping</h4>
                                        <p>Orders over $100</p>
                                    </div>
                                    <!-- End Single Service -->
                                </div>
                                <div class="col-lg-3 col-md-6 col-12">
                                    <!-- Start Single Service -->
                                    <div class="single-service">
                                        <i class="fa fa-undo"></i>
                                        <h4>Free Return</h4>
                                        <p>Within 30 days return</p>
                                    </div>
                                    <!-- End Single Service -->
                                </div>
                                <div class="col-lg-3 col-md-6 col-12">
                                    <!-- Start Single Service -->
                                    <div class="single-service">
                                        <i class="fa fa-lock"></i>
                                        <h4>Secure Payment</h4>
                                        <p>100% secure payment</p>
                                    </div>
                                    <!-- End Single Service -->
                                </div>
                                <div class="col-lg-3 col-md-6 col-12">
                                    <!-- Start Single Service -->
                                    <div class="single-service">
                                        <i class="fa fa-tag"></i>
                                        <h4>Best Price</h4>
                                        <p>Guaranteed price</p>
                                    </div>
                                    <!-- End Single Service -->
                                </div>
                            </div>
                        </div>
                    </section>
                    <!-- End Shop Services -->

                    <!-- Start Footer Area -->
                    <footer class="footer">
                        <!-- Footer Top -->
                        <div class="footer-top section">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-5 col-md-6 col-12">
                                        <!-- Single Widget -->
                                        <div class="single-footer about">
                                            <div class="logo">
                                                <a href="homepage"><img src="images/logo2.png" alt="#"></a>
                                            </div>
                                            <p class="text">Shoes Collection số 1 Hà Thành.</p>
                                            <p class="call">Got Question? Call us 24/7<span><a href="tel:0387037855">038 7037 855</a></span></p>
                                        </div>
                                        <!-- End Single Widget -->
                                    </div>
                                    <div class="col-lg-2 col-md-6 col-12">
                                        <!-- Single Widget -->
                                        <div class="single-footer links">
                                            <h4>Information</h4>
                                            <ul>
                                                <li><a href="#">About Us</a></li>
                                                <li><a href="#">Faq</a></li>
                                                <li><a href="#">Terms & Conditions</a></li>
                                                <li><a href="#">Contact Us</a></li>
                                                <li><a href="#">Help</a></li>
                                            </ul>
                                        </div>
                                        <!-- End Single Widget -->
                                    </div>
                                    <div class="col-lg-2 col-md-6 col-12">
                                        <!-- Single Widget -->
                                        <div class="single-footer links">
                                            <h4>Customer Service</h4>
                                            <ul>
                                                <li><a href="#">Payment Methods</a></li>
                                                <li><a href="#">Money-back</a></li>
                                                <li><a href="#">Returns</a></li>
                                                <li><a href="#">Shipping</a></li>
                                                <li><a href="#">Privacy Policy</a></li>
                                            </ul>
                                        </div>
                                        <!-- End Single Widget -->
                                    </div>
                                    <div class="col-lg-3 col-md-6 col-12">
                                        <!-- Single Widget -->
                                        <div class="single-footer social">
                                            <h4>Get In Touch</h4>
                                            <!-- Single Widget -->
                                            <div class="contact">
                                                <ul>
                                                    <li>FPT University</li>
                                                    <li>Hola Land</li>
                                                    <li>trungdthe150047@fpt.edu.vn</li>
                                                    <li>0387037855</li>
                                                </ul>
                                            </div>
                                            <!-- End Single Widget -->
                                            <ul>
                                                <li><a href="https://www.facebook.com/ttrungdo2001/"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                                <li><a href="#"><i class="fa fa-flickr"></i></a></li>
                                                <li><a href="https://www.instagram.com/trungdoox_/"><i class="fa fa-instagram"></i></a></li>
                                            </ul>
                                        </div>
                                        <!-- End Single Widget -->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Footer Top -->
                        <div class="copyright">
                            <div class="container">
                                <div class="inner">
                                    <div class="row">
                                        <div class="col-lg-6 col-12">
                                            <div class="left">
                                                <p>Copyright © 2020 <a href="https://www.facebook.com/ttrungdo2001/" target="_blank">Thanh Trung Do</a>  -  All Rights Reserved.</p>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-12">
                                            <div class="right">
                                                <img src="images/payments.png" alt="#">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </footer>
                    <!-- /End Footer Area -->

                    <!-- Jquery -->
                    <script src="js/jquery.min.js"></script>
                    <script src="js/jquery-migrate-3.0.0.js"></script>
                    <script src="js/jquery-ui.min.js"></script>
                    <!-- Popper JS -->
                    <script src="js/popper.min.js"></script>
                    <!-- Bootstrap JS -->
                    <script src="js/bootstrap.min.js"></script>
                    <!-- Color JS -->
                    <script src="js/colors.js"></script>
                    <!-- Slicknav JS -->
                    <script src="js/slicknav.min.js"></script>
                    <!-- Owl Carousel JS -->
                    <script src="js/owl-carousel.js"></script>
                    <!-- Magnific Popup JS -->
                    <script src="js/magnific-popup.js"></script>
                    <!-- Fancybox JS -->
                    <script src="js/facnybox.min.js"></script>
                    <!-- Waypoints JS -->
                    <script src="js/waypoints.min.js"></script>
                    <!-- Countdown JS -->
                    <script src="js/finalcountdown.min.js"></script>
                    <!-- Nice Select JS -->
                    <script src="js/nicesellect.js"></script>
                    <!-- Ytplayer JS -->
                    <script src="js/ytplayer.min.js"></script>
                    <!-- Flex Slider JS -->
                    <script src="js/flex-slider.js"></script>
                    <!-- ScrollUp JS -->
                    <script src="js/scrollup.js"></script>
                    <!-- Onepage Nav JS -->
                    <script src="js/onepage-nav.min.js"></script>
                    <!-- Easing JS -->
                    <script src="js/easing.js"></script>
                    <!-- Active JS -->
                    <script src="js/active.js"></script>
                    </body>
                    </html>
