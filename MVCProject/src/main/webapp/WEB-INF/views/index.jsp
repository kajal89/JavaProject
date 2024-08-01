<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Index</title>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to product</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.No.</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>

					<tbody>

						<c:forEach items="${list}" var="p">


							<tr>
								<th scope="row">${p.productID }</th>
								<td>${p.productName }</td>
								<td>${p.description }</td>
								<td>${p.price }</td>
								<td><a href="delete/${p.productID }"><i
										class="fas fa-trash-alt"></i></a> <a href="update/${p.productID }">
										<i class="fas fa-pen-nib"></i>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center mt-5">
					<a href="add_Product" class="btn btn-outline-success"> Add
						Product</a>
				</div>
				<div class="container text-center mt-5">
					<a href="update_product" class="btn btn-outline-success">Update
						Product</a>
				</div>

			</div>

		</div>



	</div>
</body>
</html>