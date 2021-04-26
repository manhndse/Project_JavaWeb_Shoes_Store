<%-- 
    Document   : login
    Created on : Nov 9, 2020, 11:53:13 PM
    Author     : MacBook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  >
    <head>
        <!-- Site made with Mobirise Website Builder v5.2.0, https://mobirise.com -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="generator" content="Mobirise v5.2.0, mobirise.com">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
        <link rel="shortcut icon" href="assets/images/doublemlogo-96x96.png" type="image/x-icon">
        <meta name="description" content="">


        <title>Login</title>
        <link rel="stylesheet" href="assets/web/assets/mobirise-icons2/mobirise2.css">
        <link rel="stylesheet" href="assets/tether/tether.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="assets/dropdown/css/style.css">
        <link rel="stylesheet" href="assets/socicon/css/styles.css">
        <link rel="stylesheet" href="assets/theme/css/style.css">
        <link rel="preload" as="style" href="assets/mobirise/css/mbr-additional.css"><link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">

    </head>
    <body>
        <form action="LoginController" method="post">
            <section class="menu menu2 cid-sfR2QEthON" once="menu" id="menu2-1h">
                <nav class="navbar navbar-dropdown navbar-fixed-top navbar-expand-lg">
                    <div class="container-fluid">
                        <div class="navbar-brand">
                            <span class="navbar-logo">
                                <a href="home.jsp">
                                    <img src="assets/images/doublemlogo-96x96.png" alt="Mobirise" style="height: 3.8rem;">
                                </a>
                            </span>
                            <span class="navbar-caption-wrap"><a class="navbar-caption text-black display-7" href="home.jsp">Double M</a></span>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                            <div class="hamburger">
                                <span></span>
                                <span></span>
                                <span></span>
                                <span></span>
                            </div>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav nav-dropdown nav-right" data-app-modern-menu="true"><li class="nav-item"><a class="nav-link link text-black display-4" href="home.jsp">Home</a></li>
                                <li class="nav-item"><a class="nav-link link text-black display-4" href="shop.jsp">Shop</a></li>
                                <li class="nav-item"><a class="nav-link link text-black display-4" href="login.jsp">Login</a></li>
                                <li class="nav-item"><a class="nav-link link text-black display-4" href="register.jsp">Register</a>
                                </li></ul>
                            <div class="icons-menu">
                                <a class="iconfont-wrapper" href="https://www.facebook.com/ducmanh10x/" target="_blank">
                                    <span class="p-2 mbr-iconfont socicon-facebook socicon"></span>
                                </a>
                                <a class="iconfont-wrapper" href="https://www.instagram.com/amanh.xanhla/" target="_blank">
                                    <span class="p-2 mbr-iconfont socicon-instagram socicon"></span>
                                </a>
                            </div>

                        </div>
                    </div>
                </nav>
            </section>

            <section class="form4 cid-sfQY9HTO4n mbr-fullscreen" id="form4-1b">
                <div class="container-fluid">
                    <div class="row content-wrapper justify-content-center">
                        <div class="col-lg-3 offset-lg-1 mbr-form" data-form-type="formoid">
                            <form action="https://mobirise.eu/" method="POST" class="mbr-form form-with-styler" data-form-title="Form Name"><input type="hidden" name="email" data-form-email="true" value="apohACoA/Qk97IBXWCMsmCwVeB3Hrb3M4Tb2pFzgeBiqjkQeDotId+ViU39Jf/6ju3uikA6OkRTnaE5Yf8UNXMHQGusEDaCCcR4idfTkuLbbK/HnZaeqHyqzyZMLqEsj">
                                <div class="">
                                    <div hidden="hidden" data-form-alert="" class="alert alert-success col-12">Login Successfully</div>
                                    <div hidden="hidden" data-form-alert-danger="" class="alert alert-danger col-12">Oops...! some
                                        problem!</div>
                                </div>
                                <div class="dragArea row">
                                    <div class="col-lg-12 col-md-12 col-sm-12">
                                        <h1 class="mbr-section-title mb-4 display-2"><strong>Login</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</h1>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-12">
                                        <p class="mbr-text mbr-fonts-style mb-4 display-7">If you don't have account, let's register</p>
                                    </div>
                                    <div class="col-lg-12 col-md col-12 form-group" data-for="name">
                                        <input type="text" name="account" placeholder="Account" data-form-field="account" class="form-control" value="" id="name-form4-1b">
                                    </div>
                                    <div class="col-lg-12 col-md col-12 form-group" data-for="email">
                                        <input type="password" name="password" placeholder="Password" data-form-field="password" class="form-control" value="" id="email-form4-1b">
                                    </div>
                                    <div class="col-12 col-md-auto mbr-section-btn"><button type="submit" class="btn btn-secondary display-4"><span class="mobi-mbri mobi-mbri-login mbr-iconfont mbr-iconfont-btn" style="color: rgb(0, 0, 0);"></span>Login</button></div>
                                </div>
                            </form>
                        </div>
                        <div class="col-lg-7 offset-lg-1 col-12">
                            <div class="image-wrapper">
                                <img class="w-100" src="assets/images/converse-vs-vans-1-1266x713.jpeg" alt="Mobirise">
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <section class="contacts3 map1 cid-sfQXnDk2DR" id="contacts3-1a">
                <div class="mbr-overlay" style="opacity: 0.2; background-color: rgb(0, 0, 0);"></div>
                <div class="container">
                    <div class="mbr-section-head">
                        <h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
                            <strong>Contacts</strong>
                        </h3>

                    </div>
                    <div class="row justify-content-center mt-4">
                        <div class="card col-12 col-md-6">
                            <div class="card-wrapper">
                                <div class="image-wrapper">
                                    <span class="mbr-iconfont mobi-mbri-phone mobi-mbri"></span>
                                </div>
                                <div class="text-wrapper">
                                    <h6 class="card-title mbr-fonts-style mb-1 display-5">
                                        <strong>Phone</strong>
                                    </h6>
                                    <p class="mbr-text mbr-fonts-style display-7">
                                        <a href="tel:+12345678910" class="text-primary"></a>0985059332</p>
                                </div>
                            </div>
                            <div class="card-wrapper">
                                <div class="image-wrapper">
                                    <span class="mbr-iconfont mobi-mbri-letter mobi-mbri"></span>
                                </div>
                                <div class="text-wrapper">
                                    <h6 class="card-title mbr-fonts-style mb-1 display-5">
                                        <strong>Email</strong>
                                    </h6>
                                    <p class="mbr-text mbr-fonts-style display-7">manhndhe141204@fpt.edu.vn&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>
                                </div>
                            </div>
                        </div>
                        <div class="map-wrapper col-12 col-md-6">
                            <div class="google-map"><iframe frameborder="0" style="border:0" src="https://www.google.com/maps/embed/v1/place?key=AIzaSyCt1265A4qvZy9HKUeA8J15AOC4SrCyZe4&amp;q=Đại học FPT Hà Nội" allowfullscreen=""></iframe></div>
                        </div>
                    </div>
                </div>
            </section>

            <section class="footer3 cid-s48P1Icc8J" once="footers" id="footer3-18">

                <div class="container">
                    <div class="media-container-row align-center mbr-white">
                        <div class="row row-links">
                            <ul class="foot-menu">
                                <li class="foot-menu-item mbr-fonts-style display-7"><a href="https://mobirise.com/help/" class="text-success">Help Center</a></li><li class="foot-menu-item mbr-fonts-style display-7"><a href="http://forums.mobirise.com/" class="text-success">Mobirise Forums</a></li><li class="foot-menu-item mbr-fonts-style display-7"><a href="https://mobirise.com/" class="text-success">Mobirise.com</a></li></ul>
                        </div>
                        <div class="row social-row">
                            <div class="social-list align-right pb-2">
                                <div class="soc-item">
                                    <a href="https://twitter.com/mobirise" target="_blank">
                                        <span class="socicon-twitter socicon mbr-iconfont mbr-iconfont-social"></span>
                                    </a>
                                </div><div class="soc-item">
                                    <a href="https://www.facebook.com/ducmanh10x" target="_blank">
                                        <span class="socicon-facebook socicon mbr-iconfont mbr-iconfont-social"></span>
                                    </a>
                                </div><div class="soc-item">
                                    <a href="https://www.youtube.com/watch?v=QH9vvwPPBS8" target="_blank">
                                        <span class="socicon-youtube socicon mbr-iconfont mbr-iconfont-social"></span>
                                    </a>
                                </div><div class="soc-item">
                                    <a href="https://www.instagram.com/amanh.xanhla" target="_blank">
                                        <span class="mbr-iconfont mbr-iconfont-social socicon-instagram socicon"></span>
                                    </a>
                                </div></div>
                        </div>
                        <div class="row row-copirayt">
                            <p class="mbr-text mb-0 mbr-fonts-style mbr-white align-center display-7">
                                © Copyright 2020 Mobirise. All Rights Reserved.
                            </p>
                        </div>
                    </div>
                </div>
            </section><section style="background-color: #fff; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Helvetica Neue', Arial, sans-serif; color:#aaa; font-size:12px; padding: 0; align-items: center; display: flex;"><a href="https://mobirise.site/b" style="flex: 1 1; height: 3rem; padding-left: 1rem;"></a><p style="flex: 0 0 auto; margin:0; padding-right:1rem;"><a href="https://mobirise.site/c" style="color:#aaa;">The</a> page was started with Mobirise</p></section><script src="assets/web/assets/jquery/jquery.min.js"></script>  <script src="assets/popper/popper.min.js"></script>  <script src="assets/tether/tether.min.js"></script>  <script src="assets/bootstrap/js/bootstrap.min.js"></script>  <script src="assets/smoothscroll/smooth-scroll.js"></script>  <script src="assets/parallax/jarallax.min.js"></script>  <script src="assets/dropdown/js/nav-dropdown.js"></script>  <script src="assets/dropdown/js/navbar-dropdown.js"></script>  <script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>  <script src="assets/theme/js/script.js"></script>  <script src="assets/formoid/formoid.min.js"></script>  

        </form>
    </body>
</html>
