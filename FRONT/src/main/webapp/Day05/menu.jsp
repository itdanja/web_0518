<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		@font-face {
		    font-family: 'WandohopeB';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-10@1.0/WandohopeB.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
		*{
			font-family: 'WandohopeB';
		}
		#menuul{
			background-color: skyblue;
			padding: 15px;
			text-align: center;
			color: white;
		}
		.menuli{
			display: inline;
			margin-left: 20px;
		}
		a{
			color: white;
			text-decoration: none;
		}
		a:hover {
			color: orange;
			text-decoration: none;
		}
	</style>
</head>
<body >
	<ul id="menuul" >
		<li class="menuli"> <a href="menu.jsp">ȸ�� �Ұ�</a> </li>
		<li class="menuli"> <a href="#">��ǰ �Ұ�</a> </li>
		<li class="menuli"> <a href="#">�� ����</a> </li>
		<li class="menuli"> <a href="login.jsp">�α���</a> </li>
		<li class="menuli"> <a href="#">ȸ������</a> </li>
		<li class="menuli"> <a href="#">ã�� ���ô±�</a> </li>
	</ul>
</body>
</html>