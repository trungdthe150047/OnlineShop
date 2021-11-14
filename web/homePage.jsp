<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="zxx">
    <head>
        <!-- Meta Tag -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name='copyright' content=''>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Title Tag  -->
        <title> TrungKicks </title>
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
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
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
                        <div action="search" class="col-lg-8 col-md-7 col-12">
                            <div class="search-bar-top">
                                <div class="search-bar">
                                    <select>
                                        <option selected="selected">All Category</option>
                                        <option>Shirt</option>
                                        <option>Trouser</option>
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
                                <!--hinh check out-->
                                <div class="sinlge-bar shopping">
                                    <a href="#" class="single-icon"><i class="fa fa-cart-plus"></i> <span class="total-count">${total}</span></a>
                                    <!-- Shopping Item -->
                                    <div class="shopping-item">
                                        <div class="dropdown-cart-header">
                                            <span>${total} Items</span>
                                            <a href="cart?id=6&option=&cost=0">View Cart</a>
                                        </div>
                                        <ul class="shopping-list">
                                            <c:forEach items="${requestScope.list}"var="i">
                                                <li>
                                                    <!--                                                <a href="#" class="remove" title="Remove this item"><i class="fa fa-remove"></i></a>-->
                                                    <a class="cart-img" href="#"><img src="images/${i.product.imagePath}" alt="#"></a>
                                                    <h4><a href="#">${i.product.productName}</a></h4>
                                                    <p class="quantity">1x - <span class="amount">${i.product.price}</span></p>
                                                </li>
                                            </c:forEach>
                                        </ul>
                                        <div class="bottom">
                                            <div class="total">
                                                <span>Total</span>
                                                <span class="total-amount">${totalcost}</span>
                                            </div>
                                            <!--                                            <a href="checkout" class="btn animate">Checkout</a>-->
                                        </div>
                                    </div>
                                    <!--/ End Shopping Item -->
                                </div>
                                <!--end hinh check out-->
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
                            <div class="col-lg-3">
                            </div>
                            <div class="col-lg-9 col-12">
                                <div class="menu-area">
                                    <!-- Main Menu -->
                                    <nav class="navbar navbar-expand-lg">
                                        <div class="navbar-collapse">	
                                            <div class="nav-inner">	
                                                <ul class="nav main-menu menu navbar-nav">
                                                    <li class="active"><a href="#">Home</a></li>
                                                    <li><a href="shopGrid?pname=">Product</a></li>												

                                                    <li><a href="shopGrid?pname=">Shop<i class="fa fa-angle-down"></i></a>
                                                        <ul class="dropdown">
                                                            <li><a href="shopGrid?pname=">Shop Grid</a></li>
                                                            <!--<li><a href="shopGrid?id=">Shop Grid</a></li>-->
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
        <!--/ End Header -->

        <!-- Slider Area -->
        <section class="hero-slider">
            <!-- Single Slider -->
            <div class="single-slider">
                <img src="https://www.fashionbay.co.uk/wp-content/uploads/2018/08/slide-railing-1900x700.jpg" alt="anhbia">
            </div>
            <!--/ End Single Slider -->
        </section>
        <!--/ End Slider Area -->

        <!-- Start Small Banner  -->
        <section class="small-banner section">
            <div class="container-fluid">
                <div class="row">
                    <!-- Single Banner  -->
                    <div class="col-lg-4 col-md-6 col-12">
                        <div class="single-banner">
                            <img src="images/summer.png" alt="shirts">
                            <div class="content">
                                <p>Man's Collections</p>
                                <h3>Summer travel <br> collection</h3>
                                <a href="shopGrid?pname=">Discover Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- /End Single Banner  -->
                    <!-- Single Banner  -->
                    <div class="col-lg-4 col-md-6 col-12">
                        <div class="single-banner">
                            <img src="images/fendi-monster-fur-bag.png" alt="#">
                            <div class="content">
                                <p>Bag Collections</p>
                                <h3>Awesome Bag <br> 2020</h3>
                                <a href="shopGrid?pname=">Discover Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- /End Single Banner  -->
                    <!-- Single Banner  -->
                    <div class="col-lg-4 col-12">
                        <div class="single-banner tab-height">
                            <img src="images/our-womens-clothing-store-west-bloomfield-retail-store.png" alt="#">
                            <div class="content">
                                <p>Flash Sale</p>
                                <h3>Mid Season <br> Up to <span>40%</span> Off</h3>
                                <a href="shopGrid?pname=">Discover Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- /End Single Banner  -->
                </div>
            </div>
        </section>
        <!-- End Small Banner -->

        <!-- Start Product Area -->
        <div class="product-area section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="section-title">
                            <h2>Trending Item</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div class="product-info">
                            <div class="nav-main">
                            </div>

                            <div class="tab-content" id="myTabContent">
                                <!-- Start Single Tab -->
                                <div class="tab-pane fade show active" id="man" role="tabpanel">
                                    <div class="tab-single">
                                        <div class="row">
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${gucciCardigan.productID}">
                                                            <img class="default-img" src="images/${gucciCardigan.imagePath}" alt="#">
                                                            <!--                                                            <span class="out-of-stock">Hot</span>-->
                                                        </a>
                                                        <a style="color: red" title="Add to cart" href="Process_Cart?productID=${gucciCardigan.productID}">Add to cart</a>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${gucciCardigan.productID}">${gucciCardigan.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${gucciCardigan.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${gucciEmbroidered.productID}">
                                                            <img class="default-img" src="images/${gucciEmbroidered.imagePath}" alt="#">

                                                        </a>
                                                        <a style="color: red" title="Add to cart" href="Process_Cart?productID=${gucciEmbroidered.productID}">Add to cart</a>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${gucciEmbroidered.productID}">${gucciEmbroidered.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${gucciEmbroidered.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${versaceIlusSneaker.productID}">
                                                            <img class="default-img" src="images/${versaceIlusSneaker.imagePath}" alt="#">
                                                        </a>
                                                        <a style="color: red" title="Add to cart" href="Process_Cart?productID=${versaceIlusSneaker.productID}">Add to cart</a>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${versaceIlusSneaker.productID}">${versaceIlusSneaker.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${versaceIlusSneaker.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${reversibleDragonSukajan.productID}">
                                                            <img class="default-img" src="images/${reversibleDragonSukajan.imagePath}" alt="#">
                                                        </a>
                                                        <a style="color: red" title="Add to cart" href="Process_Cart?productID=${reversibleDragonSukajan.productID}">Add to cart</a>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${reversibleDragonSukajan.productID}">${reversibleDragonSukajan.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${reversibleDragonSukajan.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!--/ End Single Tab -->

                                <!-- Start Single Tab -->
                                <div class="tab-pane fade" id="accessories" role="tabpanel">
                                    <div class="tab-single">
                                        <div class="row">
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${JordanLightSmokeGrey.productID}">
                                                            <img class="default-img" src="images/${JordanLightSmokeGrey.imagePath}" alt="#">
                                                            <span class="out-of-stock">Hot</span>
                                                        </a>
                                                        <div class="button-head">
                                                            <div class="product-action">
                                                                <a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="#"><i class=" ti-eye"></i><span>Quick Shop</span></a>
                                                                <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                            </div>
                                                            <div class="product-action-2">
                                                                <a title="Add to cart" href="Process_Cart?productID=${JordanLightSmokeGrey.productID}">Add to cart</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${JordanLightSmokeGrey.productID}">${JordanLightSmokeGrey.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${JordanLightSmokeGrey.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${GucciBeeStars.productID}">
                                                            <img class="default-img" src="images/${GucciBeeStars.imagePath}" alt="#">
                                                            <!--                                                            <img class="hover-img" src="https://via.placeholder.com/550x750" alt="#">-->
                                                        </a>
                                                        <div class="button-head">
                                                            <div class="product-action">
                                                                <a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="#"><i class=" ti-eye"></i><span>Quick Shop</span></a>
                                                                <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                            </div>
                                                            <div class="product-action-2">
                                                                <a title="Add to cart" href="Process_Cart?productID=${GucciBeeStars.productID}">Add to cart</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${GucciBeeStars.productID}">${GucciBeeStars.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${GucciBeeStars.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${VansCutnPaste.productID}">
                                                            <img class="default-img" src="images/${VansCutnPaste.imagePath}" alt="#">
                                                            <!--                                                            <img class="hover-img" src="https://via.placeholder.com/550x750" alt="#">-->
                                                        </a>
                                                        <div class="button-head">
                                                            <div class="product-action">
                                                                <a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="#"><i class=" ti-eye"></i><span>Quick Shop</span></a>
                                                                <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                            </div>
                                                            <div class="product-action-2">
                                                                <a title="Add to cart" href="Process_Cart?productID=${VansCutnPaste.productID}">Add to cart</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${VansCutnPaste.productID}">${VansCutnPaste.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${VansCutnPaste.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="productDetail?id=${airforce1.productID}">
                                                            <img class="default-img" src="images/${airforce1.imagePath}" alt="#">
                                                            <!--                                                            <img class="hover-img" src="https://via.placeholder.com/550x750" alt="#">-->
                                                            <span class="new">New</span>
                                                        </a>
                                                        <div class="button-head">
                                                            <div class="product-action">
                                                                <a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="#"><i class=" ti-eye"></i><span>Quick Shop</span></a>
                                                                <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                            </div>
                                                            <div class="product-action-2">
                                                                <a title="Add to cart" href="Process_Cart?productID=${airforce1.productID}">Add to cart</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="productDetail?id=${airforce1.productID}">${airforce1.productName}</a></h3>
                                                        <div class="product-price">
                                                            <span>$${airforce1.price}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                                <!--/ End Single Tab -->                      
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Product Area -->

        <!-- Start Midium Banner  -->
        <section class="midium-banner">
            <div class="container">
                <div class="row">
                    <!-- Single Banner  -->
                    <div class="col-lg-6 col-md-6 col-12">
                        <div class="single-banner">
                            <img src="images/4-tips-phoi-phong-cach-workwear-3.png" alt="#">
                            <div class="content">
                                <p>Man's Collections</p>
                                <h3>Man's items <br>Up to<span> 50%</span></h3>
                                <a href="shopGrid?pname=">Shop Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- /End Single Banner  -->
                    <!-- Single Banner  -->
                    <div class="col-lg-6 col-md-6 col-12">
                        <div class="single-banner">
                            <img src="images/womenshoe.png" alt="#">
                            <div class="content">
                                <p>Women's shoes</p>
                                <h3>mid season <br> up to <span>70%</span></h3>
                                <a href="shopGrid?pname=" class="btn">Shop Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- /End Single Banner  -->
                </div>
            </div>
        </section>
        <!-- End Midium Banner -->

        <!-- Start Shop Services Area -->
        <section class="shop-services section home">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-12">
                        <!-- Start Single Service -->
                        <div class="single-service">
                            <i class="fa fa-truck"></i>
                            <h4>Free shipping</h4>
                            <p>Order over $100</p>
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
                            <i class="fa fa-shopping-basket"></i>
                            <h4>Secure Payment</h4>
                            <p>100% secure payment</p>
                        </div>
                        <!-- End Single Service -->
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <!-- Start Single Service -->
                        <div class="single-service">
                            <i class="fa fa-money"></i>
                            <h4>Best Price</h4>
                            <p>Guaranteed price</p>
                        </div>
                        <!-- End Single Service -->
                    </div>
                </div>
            </div>
        </section>
        <!-- End Shop Services Area -->

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
        <!-- Waypoints JS -->
        <script src="js/waypoints.min.js"></script>
        <!-- Countdown JS -->
        <script src="js/finalcountdown.min.js"></script>
        <!-- Nice Select JS -->
        <script src="js/nicesellect.js"></script>
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
        <script>
            function getIdProduct(id) {
                window.location.href = "Process_Cart?id=" + id;
            }
        </script>
    </body>
</html>