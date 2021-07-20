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
		aside{ width: 250px;  float: left; border: solid 1px green;   }
		#main{ width: 840px;  float: right; border: solid 1px green;  }
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
		
		/*���� �̹���*/
		#main_image{ 
			height: 300px; 
			background-image: url("main_image.jpg");
			background-repeat: no-repeat;
			background-position: top center;
		}
		
		/* ���̵�� */
		aside .title1{ padding: 10px; background-color: red; color: white; font-size: 20px;  }
		aside .comment{ padding: 10px; line-height: 150%; }
		aside .search input{ width: 150px; height: 32px; border: solid 1px black;}
		aside .search button{ padding: 8px; margin-left: 10px; border: solid 1px black;}
		aside .title2{
			margin-top: 20px;
			pause: 12px;
			border-top: solid 2px black;
			border-bottom: solid 1px black;
			font-size: 20px;
		}
		aside .list{ margin: 20px 0px;}
		aside .list li{ margin: 10px; }
		aside .ripple{ padding: 15px;}
		aside .ripple h2{ font-size: 20px; margin: 10px 0px;}
		aside .ripple li{ margin-top: 5px; }
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
		
	</section>
	<div class="box">
		<aside>
			<h2 class="title1"> The ����Ű </h2>
			<p class="comment"> �ȳ��ϼ��� ����Ű ������ �����ϰ� �����ϴ� �����Դϴ�</p>
			
			<div class="search">
				<input type="text"><button>�˻�</button>
			</div>
			
			<h2 class="title2"> ����Ű ī�װ� </h2>
				<ul class="list">
					<li> �Ƿ� </li>
					<li> �Ź� </li>
					<li> ���� </li>
				</ul>
				
			<div class="ripple">
				<h2> �ֱ� ��� </h2>
					<ul>
						<li> �����ϴ� </li>
						<li> ���γ׿� </li>
						<li> ���γ׿� </li>
					</ul>
			</div>	

		</aside>
		<section id="main">
			<%@include file="/Day06/day06_6.jsp"%>
		</section>
	</div>
	<footer>
		<div class="box">
			Ǫ��
		</div>
	</footer>
</body>
</html>

