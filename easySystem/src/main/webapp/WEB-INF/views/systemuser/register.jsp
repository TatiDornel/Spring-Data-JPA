<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>System User</title>
<style type="text/css">
	.campo {
		margin-bottom: 1em;	
	 }
	 .campo input:FOCUS, .campo select:FOCUS {
	 	background: #f8f8f8;
	 }
	 
	 .table {
	 	width: 640px;
	 	text-align: center;
	 }
	 
	 fieldset {
		width: 640px;
		margin: 0 auto;
	}
	
	 fieldset.group .campo {
		float: left;
		margin-right: 2em;
	 }
	 
	 .master {
	 	width: 960px;
	 	margin: 0 auto;
	 }
</style>
</head>
<body>
	<c:url var="save" value="/systemuser/save"/>
	
	<form:form modelAttribute="systemuser" action="${save}" method="post" 
														 enctype="multipart/form-data">
		
		<form:hidden path="id"/>
		<fieldset>
			<legend>System User</legend>
			
			<div>
				<form:label path="userName">Full Name</form:label><br>
				<form:input path="userName" type="text" required="true"/>				
			</div>
			<div>
				<form:label path="userLogin">Login</form:label><br>
				<form:input path="userLogin" type="text" required="true"/>				
			</div>
			<br>
			<div>
				<form:label path="email">Email</form:label><br>
				<form:input path="email" type="email" required="true"/>				
			</div>
			<br>
			<div>
				<form:label path="passWord">PassWord</form:label><br>
				<form:password path="passWord" required="true"/>				
			</div>
			<br>
			<div>
				<label for="file">Photo</label><br>
				<input type="file" name="file" required="true">		
			</div>
			
			
			<br>
			<input type="submit" value="Salvar">
			<input type="reset" value="Limpar">
		</fieldset>
		
	</form:form>


</body>
</html>