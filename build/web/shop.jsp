<%-- 
    Document   : shop
    Created on : Nov 9, 2020, 11:53:29 PM
    Author     : MacBook
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


        <title>Shop</title>
        <link rel="stylesheet" href="assets/web/assets/mobirise-icons2/mobirise2.css">
        <link rel="stylesheet" href="assets/tether/tether.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="assets/dropdown/css/style.css">
        <link rel="stylesheet" href="assets/socicon/css/styles.css">
        <link rel="stylesheet" href="assets/theme/css/style.css">
        <link rel="preload" as="style" href="assets/mobirise/css/mbr-additional.css"><link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">

        <jsp:useBean id="p" class="Model.ProductModel" scope="request"/>


    </head>
    <body>

        <jsp:include page="Header.jsp"/>

        <section class="gallery5 mbr-gallery cid-sfR564WcbO" id="gallery5-1i">




            <div class="container">
                <div class="mbr-section-head">
                    <h3 class="mbr-section-title mbr-fonts-style align-center m-0 display-2"><strong>Vans and Converse Collection</strong></h3>

                </div>
                <br>
                <div>
                    <form action="Search.jsp" method="get">
                        <input type="text" name="txt">
                        <!--<input type="submit" name="search" value="Search">-->
                        <button type="submit">Search</button>
                    </form>
                </div>
                <div class="row mbr-gallery mt-4">

                    <c:forEach items="${listP}" var="o">

                        <div class="col-12 col-md-6 col-lg-3 item gallery-image">
                            <div class="item-wrapper" data-toggle="modal" data-target="#sfRpu6hpiV-modal">
                                <img class="w-100" src="${o.image}" alt="" data-slide-to="15" data-target="#lb-sfRpu6hpiV">
                                <div class="icon-wrapper">
                                    <span class="mobi-mbri mobi-mbri-search mbr-iconfont mbr-iconfont-btn"></span>
                                </div>
                            </div>
                            <h6 class="mbr-item-subtitle mbr-fonts-style align-center mb-2 mt-2 display-7">${o.name}<br>${o.price}$</h6>
                            <div>
                                <a href="Cart.jsp">
                                    <input type="submit" name="add" value="Buy">
                                </a>
                                <a href="detail?id=${o.id}">
                                    <input type="submit" name="detail" value="Detail">
                                </a>
                                <input type="submit" value="${o.view} views">
                                <input style="width: 30px;" type="${sessionScope.accessCount}" name="view">
                            </div>
                        </div>
                    </c:forEach>

                </div>

                <div class="modal mbr-slider" tabindex="-1" role="dialog" aria-hidden="true" id="sfRpu6hpiV-modal">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-body">
                                <div class="carousel slide carousel-fade" id="lb-sfRpu6hpiV" data-interval="5000">
                                    <div class="carousel-inner">
                                        <div class="carousel-item active">
                                            <img class="d-block w-100" src="assets/images/ultrarange-exo-hi-mte-506x506.png" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/oversizecheckerboard-sk8-hi-506x506.png" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/ditsy-floral-old-skool-506x506.png" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/image_1.png" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/pig-suede-authentic-670x670.png" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/gum-authentic-670x670.png" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/vans-moma-monet-authentic-670x670.png" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/vans-authentic-black-670x670.png" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/converse-x-bugs-bunny-chuck-taylor-all-star-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/gore-tex-utility-chuck-70-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/cons-realtree-xtra-colors-ctas-pro-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/converse-chuck-1970s-bw-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/all-terrain-chuck-taylor-all-star-130-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/hacked-fashion-chuck-70-90-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/checkpoint-pro-964x898.jpg" alt="">
                                        </div><div class="carousel-item">
                                            <img class="d-block w-100" src="assets/images/holiday-sweater-chuck-70-85-964x898.jpg" alt="">
                                        </div>
                                    </div>
                                    <ol class="carousel-indicators">
                                        <li data-slide-to="0" class="active" data-target="#lb-sfRpu6hpiV"></li>
                                        <li data-slide-to="1" data-target="#lb-sfRpu6hpiV"></li>
                                        <li data-slide-to="2" data-target="#lb-sfRpu6hpiV"></li>
                                        <li data-slide-to="3" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="4" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="5" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="6" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="7" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="8" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="9" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="10" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="11" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="12" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="13" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="14" data-target="#lb-sfRpu6hpiV"></li><li data-slide-to="15" data-target="#lb-sfRpu6hpiV"></li>
                                    </ol>
                                    <a role="button" href="" class="close" data-dismiss="modal" aria-label="Close">
                                    </a>
                                    <a class="carousel-control-prev carousel-control" role="button" data-slide="prev" href="#lb-sfRpu6hpiV">
                                        <span class="mobi-mbri mobi-mbri-arrow-prev" aria-hidden="true"></span>
                                        <span class="sr-only">Previous</span>
                                    </a>
                                    <a class="carousel-control-next carousel-control" role="button" data-slide="next" href="#lb-sfRpu6hpiV">
                                        <span class="mobi-mbri mobi-mbri-arrow-next" aria-hidden="true"></span>
                                        <span class="sr-only">Next</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div style="margin-left: 650px;">
            <c:forEach begin="1" end="${end}" var="i">
                <a href="paging?index=${i}">${i}</a>
            </c:forEach>
        </div>


        <section class="contacts3 map1 cid-sfQTOwal8h" id="contacts3-u">


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
                                    <a href="tel:+12345678910" class="text-primary"></a>0985059332&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>
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

        <section class="footer3 cid-s48P1Icc8J" once="footers" id="footer3-t">





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
        </section><section style="background-color: #fff; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Helvetica Neue', Arial, sans-serif; color:#aaa; font-size:12px; padding: 0; align-items: center; display: flex;"><a href="https://mobirise.site/o" style="flex: 1 1; height: 3rem; padding-left: 1rem;"></a><p style="flex: 0 0 auto; margin:0; padding-right:1rem;">Built with <a href="https://mobirise.site/b" style="color:#aaa;">Mobirise</a> template</p></section><script src="assets/web/assets/jquery/jquery.min.js"></script>  <script src="assets/popper/popper.min.js"></script>  <script src="assets/tether/tether.min.js"></script>  <script src="assets/bootstrap/js/bootstrap.min.js"></script>  <script src="assets/smoothscroll/smooth-scroll.js"></script>  <script src="assets/parallax/jarallax.min.js"></script>  <script src="assets/dropdown/js/nav-dropdown.js"></script>  <script src="assets/dropdown/js/navbar-dropdown.js"></script>  <script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>  <script src="assets/theme/js/script.js"></script>  


    </body>
</html>
