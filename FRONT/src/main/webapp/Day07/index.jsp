<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		
		/* ���̾ƿ�*/
		*{ margin: 0; padding: 0; }
		header{ height: 150px; border: solid 1px red;}
		.box{ width: 1100px; margin: 0 auto;  border: solid 1px blue; }
		#main_image{ height: 200px; border: solid 1px red; }
		aside{ width: 250px; height: 300px; float: left; border: solid 1px green;   }
		#main{ width: 846px; height: 300px; float: right; border: solid 1px green;  }
		footer{ height: 150px; clear: both; border: solid 1px red;}
		
		/* ��� */
		#logo{ float: left; margin: 40px 0 0 20px; }
		#logo img{ width: 100px;}
		
		li{ list-style-type: none;}
		#menu{ float: right; text-align:right; margin-right: 20px; }
		#menu li{ display: inline-block;}
			/* inline : ���Ʒ� ����/���� x */
		#top_menu li{ margin: 30px 0 0 10px;}
		#main_menu li{ margin: 40px 0 0 100px; font-weight: bold; font-size: 20px;}
		
	</style>
	















</head>
<body>

	<header>
		<div class="box">
			
			<div id="logo">
					<img alt="" src="logo.png">
			</div>
			
			<div id="menu">
				<ul id="top_menu">
					<li> ���缮�� </li>
					<li> �α׾ƿ� </li>
					<li> ȸ������ </li>
				</ul>
				
				<ul id="main_menu">
					<li> Home </li>
					<li> ��ü��ǰ </li>
					<li> �Խ��� </li>
					<li> ������ </li>
				</ul>
			</div>
			
		</div>
	</header>
	<section id="main_image">
		���� �̹��� 
	</section>
	<div class="box">
		<aside>
			���̵��
		</aside>
		<section id="main">
			���� ����
		</section>
	</div>
	<footer>
		<div class="box">
			Ǫ��
		</div>
	</footer>
</body>
</html>

