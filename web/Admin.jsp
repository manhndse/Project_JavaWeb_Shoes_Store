<%-- 
    Document   : Admin
    Created on : Nov 11, 2020, 11:32:53 AM
    Author     : MacBook
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <jsp:useBean id="p" class="Model.ProductModel" scope="request"/>
        <title>Manage Product</title>
        
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
        <div>
            <jsp:include page="Header.jsp"/>
        </div>
        <br>
        <br>
        <div class="row">
            <div class="col-md-3">
                <form  action="add" method="post">
                    <div class="form-group">
                        <label for="exampleInputEmail1">ID</label>
                        <input name="id" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Name</label>
                        <input name="name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Unit</label>
                        <input name="unit" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Price</label>
                        <input name="price" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Link Image</label>
                        <input name="image" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">CateID</label>
                        <input name="cateID" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <button type="submit" class="btn btn-primary">Add</button>
                </form>
            </div>
            <div class="col-md-9">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Name</th>
                            <th scope="col">Image</th>
                            <th scope="col">Price</th>
                            <th scope="col">Unit</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${p.allProduct}" var="o">
                            <tr>
                                <th scope="row">${o.id}</th>
                                <td>${o.name}</td>
                                <td>
                                    <img style="height: 100px; width: 100px" src="${o.image}"/>
                                </td>
                                <td>${o.price}</td>
                                <td>${o.unit}</td>

                                <td>
                                    <a href="delete?id=${o.id}">
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </a>
                                    <a href="update.jsp?id=${o.id}">
                                        <button type="button" class="btn btn-primary">Edit</button>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
