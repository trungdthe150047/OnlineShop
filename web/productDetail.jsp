<%-- 
    Document   : productDetail
    Created on : Oct 31, 2020, 9:29:21 PM
    Author     : DO THANH TRUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TrungKicks</title>
        <link rel="icon" type="image/png" href="images/trungkicks.png">
        <link href="css/flex-slider.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery.fancybox.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/magnific-popup.css" rel="stylesheet" type="text/css"/>
        <link href="css/magnific-popup.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/nice-select.css" rel="stylesheet" type="text/css"/>
        <link href="css/niceselect.css" rel="stylesheet" type="text/css"/>
        <link href="css/owl-carousel.css" rel="stylesheet" type="text/css"/>
        <link href="css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="css/responsive.css" rel="stylesheet" type="text/css"/>
        <link href="css/slicknav.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/themify-icons.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <link href="css/cssForProductDetail/style.css" rel="stylesheet" type="text/css"/>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
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
                            <!-- Search Form -->
                            <div class="search-top">
                                <div class="top-search"><a href="#0"><i class="ti-search"></i></a></div>
                            </div>
                            <!--/ End Search Form -->
                            <div class="mobile-nav"></div>
                        </div>
                        <div class="col-lg-8 col-md-7 col-12">
                            <div class="search-bar-top">
                                <div class="search-bar">
                                    <form>
                                        <input name="search" placeholder="Search Products Here....." type="search">
                                        <button class="btnn"><i class="fa fa-search"></i></button>
                                    </form>
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
                                                    <li><a href="#">Contact Us</a></li>
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
        <div class="content">
            <h1>${items.productName}</h1>
            <div class="container1">
                <h2>${items.productName}</h2>
                <div class="product">
                    <div class="product-image">
                        <img src="images/${items.imagePath}" alt="Ferrari">
                    </div>
                    <div class="product-info">
                        <p><span>Price</span>$${items.price}</p>
                        <p><span>Availability</span>In Stock</p>
                        <p><span>Shipping</span>Free</p>
<!--                        <p><span>Rating</span>-->
<!--                        <div class="rating">
                            <span class="starRating">
                                <input id="rating5" type="radio" name="rating" value="5">
                                <label for="rating5">5</label>
                                <input id="rating4" type="radio" name="rating" value="4">
                                <label for="rating4">4</label>
                                <input id="rating3" type="radio" name="rating" value="3" checked>
                                <label for="rating3">3</label>
                                <input id="rating2" type="radio" name="rating" value="2">
                                <label for="rating2">2</label>
                                <input id="rating1" type="radio" name="rating" value="1">
                                <label for="rating1">1</label>
                            </span>
                        </div>-->
                        <div class="clear"></div>
                        </p>
                        <p><span>Size</span>
                            <select class="dropdown" tabindex="10" >
                                <option value="">-</option>
                                <option value="1">s</option>
                                <!--                                <option value="2">x</option>-->
                                <option value="2">m</option>
                                <option value="3">l</option>
                                <option value="4">xl</option>
                                <option value="5">xxl</option>
                            </select>
                        </p>
                        <div class="cart"><a href="Process_Cart?productID=${items.productID}">Add to Cart</a></div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>

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


    </body>
</html>
