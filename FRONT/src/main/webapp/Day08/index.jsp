<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		/*���̾ƿ� */
		*{ margin: 0; padding: 0; font-family: "����";}
		header{  height: 100px; border: solid 1px red; }
		.box{  width: 1200px; margin: 0 auto; border: solid 1px red; }
			/* ���� �̹���*/
			#main_img{ 
				height: 250px; 
				background-image: url("../img/main_img.png"); 
				background-repeat: no-repeat;
				background-position: top center;
				margin-top: 20px;
			}
		#sub_menu{ width: 250px; height:500px; float: left; border: solid 1px red; }
		#main_contents{width: 946px; height:500px; float: right; border: solid 1px red;  }
		footer{ height:200px; clear: both; border: solid 1px red; }
		
		/*����*/
		li{ list-style-type: none;}
		
		/*��� �޴�*/
		#logo{ float: left; margin:20px 0 0 20px;  }
		#menu{ float: right;  }
		#top_menu{ text-align: right; margin-top: 20px; }
		#main_menu{ margin-top: 20px; font-family: 20px; }
		#main_menu li{ display: inline; margin-left: 80px;}
		
	
		
	</style>

</head>
<body>

	<header>
		<div class="box">
			<div id="logo">
				<img alt="" src="../img/logo.png"> 		
			</div>
			<div id="menu">
				<div id="top_menu">
					�α��� | ȸ������ | ��������
				</div>
				<ul id="main_menu">
					<li> �����̷� </li>
					<li> �������� </li>
					<li> �����۰� </li>
					<li> Ķ���� </li>
					<li> Ŀ�´�Ƽ </li>
				</ul> 
			</div>
		</div>
	</header>
	<section id="main_img">
		
	</section>
	
	<section class="box">
		<div id="sub_menu">
			���̵��	
		</div>
	
		<div id="main_contents">
			���� ����
		</div>
	</section>
	
	<footer>
		<div class="box">
			�ϴ� Ǫ�� 
		</div>
	</footer>
</body>
</html>