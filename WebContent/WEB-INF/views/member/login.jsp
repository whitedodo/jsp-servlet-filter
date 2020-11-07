<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	
	.member_tbl{
		width:500px;
		margin:auto;
		text-align:center;
		border:1px solid #666;
		border-collapse: collapse;
	}
	
	.member_tbl td{
		border-right:1px solid #666;
		border-bottom:1px solid #666;
	}
	
	.input_txt{
		width:98%;
	}
	
	.input_button{
		width:100%;
	}
	
	.txt_title{
		margin:auto;
		text-align:center;
	}

</style>
</head>
<body>

<div class="txt_title">
	<h2>로그인</h2>
</div>

<!--  로그인 -->
<form action="<%= contextPath %>/member/process.do">
<table class="member_tbl">
	<tr>
		<td style="width:15%; background-color:#e2e2e2; ">
			<span>이메일</span>
		</td>
		<td>
			<input class="input_txt" type="text" name="email" />
		</td>
	</tr>
	
	<tr>
		<td style="background-color:#e2e2e2; ">
			<span>비밀번호</span>
		</td>
		<td>
			<input class="input_txt" type="password" name="passwd" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input class="input_button" type="submit" value="로그인" />
		</td>
	</tr>
</table>
</form>

</body>
</html>