<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3> 글쓰기 페이지 </h3>
		<a href="boardlist.jsp"><button>글목록</button></a>
	<form method="post" action="boardwritecontroller.jsp">
		제목 : <input type="text" name="btitle" size="50"> <br>
		작성자 :<input type="text" name="bwriter" size="10"> <br>
		내용 :  <textarea rows="10" cols="40" style="resize: none" name="bcontents"></textarea> <br>
		<input type="submit" value="작성"> <input type="reset" value="취소">
	</form>
</body>
</html>