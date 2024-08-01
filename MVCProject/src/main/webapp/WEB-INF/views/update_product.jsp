<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
<title>Add Product</title>
</head>
<body class="" style="background: #e2e2e2;">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">

						<h3 class="text-center">Update Form</h3>
						<form action="${pageContext.request.contextPath }/handle_product" method="post">
							<div class="form-group">
								<label for="exampleInputEmail">Your Name</label> <input
									name="productName" type="text" class="form-control"
									id="exampleInputEmail" aria-describedby="emailhelp"
									placeholder="Enter Name" value="${product.productName }">
							</div>
							<div class="form-group">
								<label for="description">Description</label>
								<textarea class="form-control" name="description"
									placeholder="Enter Description" rows="5" id="description"
									value="${product.description}"></textarea>

							</div>
							<div class="form-group">
								<label for="price">Product Price</label> <input name="price"
									type="text" class="form-control" id="price"
									placeholder="Enter Price" value="${product.price }">
							</div>


							<div class="container text-center">

								<a href="${pageContext.request.contextPath }/"
									class="btn btn-outline-danger">Back</a>

								<button type="submit" class="btn btn-primary">Update</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>