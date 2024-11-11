<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
    <!-- Awesome Icon -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    
	 <!-- bootstrap Icon -->   
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">    
    
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>

	<style type="text/css">
		.card {
			position: absolute;
			left: 50%;
			top:50%;
			transform:translate(-50%,-50%);
		}
	</style>
	
</head>
<body>
    <div class="card col-sm-4">
    <div class="card-body">
       		<h1 class="card-title text-center bg-success">
       		Edit Product
       		</h1>
        
            <form:form action="/updateProduct" method="post" modelAttribute="product">
                <div class="form-group">
                    <label for="pname">Product Id</label>
                    <form:input path="id" type="text" class="form-control" disabled="true"/>
                </div>
                 <div class="form-group">
                    <form:input path="id" type="hidden" class="form-control" />
                </div>
                
                <div class="form-group">
                    <label for="pname">Product Name</label>
                    <form:input path="pname" type="text" placeholder="Enter Product Name" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="quantity">Product Quantity</label>
                    <form:input path="quantity" type="number" class="form-control" placeholder="Enter Product Quantity" />
                </div>
                <div class="form-group">
                    <label for="price">Product Price</label>
                    <form:input path="price" type="number" class="form-control" placeholder="Enter Product Price" />
                </div>
                <button type="submit" class="btn btn-primary">
                   <i class="bi bi-cloud-upload-fill"></i> Update Product
                </button>
                <button type="reset" class="btn btn-secondary">
                    <i class="fas fa-eraser"></i> Clear
                </button>
            </form:form>
        </div>
        <div class="card-footer text-center">
            <a href="viewAllProducts" class="btn btn-link">
                <i class="fas fa-list"></i> View All Products
            </a>
        </div>
    </div>
</body>
</html>
