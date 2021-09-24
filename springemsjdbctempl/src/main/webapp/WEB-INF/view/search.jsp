<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee page</title>
<style type="text/css">
.success {
	position: fixed;
	width: 50%;
	margin-left: 50px;
	margin-top: 20px;
	padding: 20px;
	background-color: #99b3e6;
	border: 1px solid #99b3e6;
	border-radius: 4px;
}

.success1 {
	position:relative;
	top:200px;
	width: 51%;
	height: 100px;
	margin-left: 50px;
	margin-top: 20px;
	padding: 20px;
	background-color: #99b3e6;
	border: 1px solid #99b3e6;
	border-radius: 4px;
}

.form-container {
	position: fixed;
	width: 50%;
	margin-left: 20px;
	margin-top: 20px;
	margin-bottom: 20px;
	
	padding: 20px;
	background-color: #c0c0c0;
	border: 1px solid #ddd;
	border-radius: 4px;
}


.has-error {
	color: red;
}

.floatRight {
	float: right;
	margin-right: 18px;
}

</style>


</head>
<body>
	<div class="success">
		<form:form method="POST" modelAttribute="employee" action="searchbyid"
			class="form-horizontal">
			<div class="row">
				<div class="form-group col-md-12">
					<label>To search employee by id</label><br><br>
					<label class="col-md-3 control-lable" for="name">Enter Id</label>
					<div class="col-md-7">
						<form:input type="number" path="id" id="id"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="name" class="help-inline" />
						</div>
					</div>
					<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Search"
						class="btn btn-primary btn-sm">
				</div>
			</div>
				</div>
			</div>
			</form:form>
	</div>
			
	<div class="success1">
		<form:form method="POST" modelAttribute="employee" action="searchbyname"
			class="form-horizontal">
			<div class="row">
				<div class="form-group col-md-12">
					<label>To search employee by name</label><br><br>
					<label class="col-md-3 control-lable" for="name">Enter name</label>
					<div class="col-md-7">
						<form:input type="text" path="name" id="name"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="name" class="help-inline" />
						</div>
					</div>
					<div>
						<div class="form-actions floatRight">
					<input type="submit" value="Search"
						class="btn btn-primary btn-sm">
				</div>
					</div>
				</div>
			</div>
			
			
		</form:form>
	</div>
</body>
</html>